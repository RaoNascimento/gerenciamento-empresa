FROM nexusrepository.bradesco.com.br:8500/ubi8/openjdk-11:1.3-3.1595332543

ENV TZ America/Sao_Paulo
ENV LANG en_US.UTF-8
ENV LANGUAGE en_US:en
ENV LC_ALL en_US.UTF-8

COPY target/"strella-srv-empresas.jar ./

CMD ["java", "-Xms768m", "-Xmx768m", "-Djava.security.egd=file:/dev/./urandom", "-Dspring.profiles.active=${ENVIRONMENT}", "-Dfile.encoding=UTF8", "-jar", "strella-srv-empresas.jar"]
