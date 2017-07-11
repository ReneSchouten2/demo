FROM openjdk:alpine
COPY target/demo-app-1.0-jar-with-dependencies.jar /app/demo-app/
WORKDIR /app/demo-app
EXPOSE 5000
CMD ["java", "-jar", "demo-app-1.0-jar-with-dependencies.jar"]
