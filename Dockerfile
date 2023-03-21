FROM amazoncorretto:11-alpine-jdk
MAINTAINER JLC
COPY target/jlc-0.0.1-SNAPSHOT.jar jlc-app.jar
ENTRYPOINT ["java", "-jar", "/jlc-app.jar"]