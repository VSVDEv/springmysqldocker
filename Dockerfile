FROM openjdk:12-alpine
EXPOSE 8088
ADD target/sprmysqldock.jar sprmysqldock.jar
ENTRYPOINT ["java", "-jar", "/sprmysqldock.jar"]