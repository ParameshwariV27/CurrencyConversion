FROM eclipse-temurin:21-jdk-jammy
WORKDIR /app
COPY target/*.jar app.jar
EXPOSE 9100
ENTRYPOINT ["java","-jar","/app/app.jar"]
