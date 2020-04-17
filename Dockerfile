FROM openjdk:8
#copies target jar into image jar
ADD target/auctionProject.jar auctionProject.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "docker-spring-boot.jar"]