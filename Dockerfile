FROM maven:3.8.5-openjdk-17 AS build

WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN mvn clean package -DskipTests

FROM openjdk:17-jdk-slim

WORKDIR /app

COPY --from=build /app/target/TramarsaERP-0.0.1-SNAPSHOT.jar /app/TramarsaERP.jar

EXPOSE 8080

CMD ["sh", "-c", "java -jar /app/TramarsaERP.jar \
    --server.port=${SERVER_PORT} \
    --datasource.url=${DATASOURCE_URL} \
    --datasource.username=${DATASOURCE_USERNAME} \
    --datasource.password=${DATASOURCE_PASSWORD} \
    --security.jwt.private.key=${PRIVATE_KEY} \
    --security.jwt.user.generator=${USER_GENERATOR}"]
