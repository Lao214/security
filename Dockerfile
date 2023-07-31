FROM openjdk:8-jdk
VOLUME /tmp
COPY ./security-system/target/service-system.jar  service-system.jar
ENTRYPOINT ["java","-jar","/service-system.jar","&"]