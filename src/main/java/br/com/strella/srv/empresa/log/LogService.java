package br.com.strella.srv.empresa.log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class LogService {

	private static final Logger LOGGER = LoggerFactory.getLogger(LogService.class);

	private static final String ASPECT_POINTCUT =
		"execution(public protected * br.com.bradesco.cntdr.srv.taje.persistence.service..*(..))";

	@Around(value = LogService.ASPECT_POINTCUT)
	public Object logMethod(ProceedingJoinPoint joinPoint) throws Throwable {
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();
		Logged logged = method.getAnnotation(Logged.class);

		// If the method being executed does not have the @Logged annotation or if the ignore parameter is set to true,
		// proceed with the original method execution without logging.
		if (logged == null || logged.ignore()) {
			return joinPoint.proceed();
		}

		final String className = joinPoint.getTarget().getClass().getSimpleName();
		final String methodName = method.getName();
		final Object[] args = joinPoint.getArgs();

		LOGGER.debug("Executing method {} from class {} with parameters: {}.", methodName, className, args);

		long start = System.currentTimeMillis();
		final Object result = joinPoint.proceed();
		long duration = System.currentTimeMillis() - start;

		LOGGER.debug("Method {} from class {} took {} ms and returned: {}.", methodName, className, duration, result);
		LOGGER.info("Method {} from class {} finished successfully and took {} ms.", methodName, className, duration);

		return result;
	}

	@AfterThrowing(pointcut = LogService.ASPECT_POINTCUT, throwing = "exception")
	public void logException(JoinPoint joinPoint, Exception exception) {
		final MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		final Method method = signature.getMethod();
		final Logged logged = method.getAnnotation(Logged.class);

		// If the method being executed does have the @Logged annotation and the ignore parameter is set to false,
		// proceed with the method execution with log.
		if (logged != null && !logged.ignore()) {
			final String className = joinPoint.getTarget().getClass().getSimpleName();
			final String methodName = joinPoint.getSignature().getName();
			final Object[] args = joinPoint.getArgs();

			LOGGER.error("An error {} occurred while executing method {} from class {} with parameters: {}",
				exception, methodName, className, args);
		}
	}

}
