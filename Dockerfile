FROM openjdk:8-jdk-alpine

VOLUME /tmp

ADD build/libs/*.jar RewardMicroservice.jar

EXPOSE 9092

ENTRYPOINT ["java","-jar","RewardMicroservice.jar"]