FROM maven AS build

WORKDIR /app/moisesdias

COPY . .

RUN mvn clean package


FROM openjdk:21-ea-oraclelinux8

WORKDIR /app

COPY --from=build /app/moisesdias/target/dslist*.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]