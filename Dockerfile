FROM openjdk:8-jdk-alpine
COPY MGLU3.SA.csv MGLU3.SA.csv
ADD target/*.jar app.jar
CMD ["java","-jar","/app.jar"]