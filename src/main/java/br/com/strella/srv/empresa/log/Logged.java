package br.com.strella.srv.empresa.log;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation used to specify whether a method should be logged or not.
 *	<p>
 *  This annotation can be applied to methods and the 'ignore' parameter can be used to exclude them from logging.
 *  </p>
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD })
public @interface Logged {

	/**
	 * Specifies whether a method should be excluded from logging when used with the Logged annotation.
	 * <p>
	 * The default value of 'false' means that the method will be logged by default. If set to 'true', the method will be
	 * excluded from logging.
	 * </p>
	 **/
	boolean ignore() default false;

}

