FROM openjdk:17-oracle

COPY target/*.jar consumer_app.jar

EXPOSE 7071

ENTRYPOINT ["java","-jar","consumer_app.jar"]
