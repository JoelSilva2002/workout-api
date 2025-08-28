# Estágio 1: Compilar a aplicação usando Maven com o JDK 21
# Alteramos a imagem para uma que usa o OpenJDK 21
FROM maven:3.9.6-eclipse-temurin-21 AS build

# Define o diretório de trabalho dentro do container
WORKDIR /app

# Copia todo o seu código para dentro do container
COPY . .

# Roda o comando para compilar seu projeto e gerar o arquivo .jar
RUN mvn clean package -DskipTests

# Estágio 2: Rodar a aplicação
# Usamos uma imagem "slim" com o JRE 21, que é mais leve
FROM eclipse-temurin:21-jre-jammy

# Define o diretório de trabalho
WORKDIR /app

# Copia apenas o arquivo .jar compilado do estágio anterior
COPY --from=build /app/target/*.jar app.jar

# Expõe a porta 8080 para que o mundo externo possa acessar a aplicação
EXPOSE 8080

# O comando que será executado quando o container iniciar
ENTRYPOINT ["java","-jar","app.jar"]