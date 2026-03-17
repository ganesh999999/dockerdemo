# Use the official Maven image to create a build artifact.
FROM maven:3.9.2-eclipse-temurin-17 AS build
COPY pom.xml /app/
COPY src /app/src/
WORKDIR /app
RUN mvn clean package -DskipTests

# Second stage: Use the OpenJDK image to run the app.
FROM eclipse-temurin:17-jdk-jammy
COPY --from=build /app/target/dockerdemo-0.0.1-SNAPSHOT.jar /usr/app/dockerdemo.jar
WORKDIR /usr/app
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "dockerdemo.jar"]
