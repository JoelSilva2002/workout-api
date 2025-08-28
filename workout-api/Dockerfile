# Etapa 1: Build do projeto
FROM maven:3.9.9-eclipse-temurin-21 AS build
WORKDIR /app

# Copiar o pom.xml e baixar dependências
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Copiar o código-fonte e empacotar
COPY src ./src
RUN mvn clean package -DskipTests

# Etapa 2: Criar imagem final
FROM eclipse-temurin:21-jdk
WORKDIR /app

# Copiar o JAR da etapa de build
COPY --from=build /app/target/*.jar app.jar

# Expor porta padrão do Spring Boot
EXPOSE 8080

# Rodar o JAR
ENTRYPOINT ["java", "-jar", "app.jar"]
