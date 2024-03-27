FROM openjdk:17-oracle

COPY target/*.jar all-in-one.jar

EXPOSE 7071

ENTRYPOINT ["java","-jar","all-in-one.jar"]
