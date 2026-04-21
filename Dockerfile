#Stage 1: Build the application
FROM maven:3.8.4-openjdk-17 AS build

# Set the working directory
WORKDIR /app

# Copy the Application code
COPY . .

# Build the application (requieres Maven)
#RUN ./mvnw clean package -DskipTests
RUN mvn clean package -DskipTests

#Stage 2: Run the application
FROM eclipse-temurin:17-jdk-jammy

# Set the working directory
WORKDIR /app

#VARIABLE DE ENTORNO
ENV APP_PASS=123123

# Copy the built JAR file from the build stage
COPY --from=build /app/target/*.jar app.jar

# Expose the application port
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "app.jar"]