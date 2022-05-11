FROM adoptopenjdk:11-jre-hotspot
ADD target/carRentalclub-0.0.1-SNAPSHOT.jar carRentalclub-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar","carRentalclub-0.0.1-SNAPSHOT.jar"]