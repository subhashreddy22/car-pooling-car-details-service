FROM openjdk:8
ADD target/car-details-service.jar car-details-service.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "car-details-service.jar"]