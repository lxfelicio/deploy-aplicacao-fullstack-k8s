# Usando a imagem base do OpenJDK
FROM openjdk:11-jre-slim

# Define o diretório de trabalho
WORKDIR /app

# Copia o arquivo JAR da aplicação
COPY target/*.jar app.jar

# Expondo a porta 8080 para acesso externo
EXPOSE 8080

# Comando para iniciar a aplicação
CMD ["java", "-jar", "app.jar"]
