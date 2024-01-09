FROM maven:3.6.3 AS maven
LABEL MAINTAINER="oumaima"

WORKDIR /app
COPY . .

RUN mvn clean install
RUN mvn package

FROM openjdk:17-jdk-alpine

WORKDIR /app

ARG JAR_FILE=target/*.jar
COPY ./target/spring-boot-docker-maven.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/app.jar"]