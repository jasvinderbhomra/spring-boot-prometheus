# Use Java 17 base image
FROM eclipse-temurin:17-jre-alpine

# Set app directory
WORKDIR /app

# Copy jar from host
COPY target/spring-boot-prometheus-0.0.1-snapshot.jar app.jar

# Run the Spring Boot app
ENTRYPOINT ["java", "-jar", "app.jar"]
