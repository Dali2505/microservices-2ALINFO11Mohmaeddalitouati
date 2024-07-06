FROM openjdk:17
EXPOSE 8045
ADD target/apigategay-service-0.0.1-SNAPSHOT.jar apigateway.jar
ENTRYPOINT ["java" , "-jar" , "apigateway.jar"]