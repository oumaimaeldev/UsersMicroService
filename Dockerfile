FROM maven:3.8.4-openjdk-17-slim AS build

WORKDIR /app

COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

FROM openjdk:17-jdk-alpine
WORKDIR /app

COPY --from=build /app/target/UserMicroService-0.0.1-SNAPSHOT.jar ./app.jar
COPY .env /app/.env



EXPOSE 8080

CMD ["java", "-jar", "app.jar"]