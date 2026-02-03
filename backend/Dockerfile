# Etapa 1: Construção
FROM maven:3.8.5-openjdk-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Etapa 2: Execução (AQUI MUDOU A IMAGEM 👇)
FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app
COPY --from=build /app/target/safegas-backend-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]