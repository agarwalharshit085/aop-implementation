# Use OpenJDK 17 runtime as the base image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/aop-implementation-0.0.1-SNAPSHOT.jar app.jar

# Expose the port the app runs on
EXPOSE 8080

# Start the application
ENTRYPOINT ["java", "-jar", "app.jar"]
