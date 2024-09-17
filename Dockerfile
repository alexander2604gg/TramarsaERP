# Utilizar una imagen base de Java
FROM openjdk:17-jdk-slim

# Establecer el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar el archivo JAR de la aplicación al contenedor
COPY target/TramarsaERP.jar /app/TramarsaERP.jar

# Exponer el puerto en el que la aplicación se ejecutará
EXPOSE 8080

# Pasar las variables de entorno al JAR y ejecutar la aplicación
CMD ["sh", "-c", "java -jar /app/TramarsaERP.jar \
    --server.port=${SERVER_PORT} \
    --datasource.url=${DATASOURCE_URL} \
    --datasource.username=${DATASOURCE_USERNAME} \
    --datasource.password=${DATASOURCE_PASSWORD} \
    --security.jwt.private.key=${PRIVATE_KEY} \
    --security.jwt.user.generator=${USER_GENERATOR}"]
