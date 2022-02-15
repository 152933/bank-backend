FROM openjdk:8
ADD target/bank.jar bank.jar
EXPOSE 9090
ENTRYPOINT ["java", "-jar", "bank.jar"]
