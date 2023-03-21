FROM amazoncorretto:11-alpine-jdk
EXPOSE 8080
MAINTAINER JLC
COPY target/jlc-0.0.1-SNAPSHOT.jar jlc-app.jar
ENTRYPOINT ["java", "-jar", "/jlc-app.jar"]