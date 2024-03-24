FROM openjdk:17-oracle

COPY target/*.jar producer_app.jar

EXPOSE 7070

ENTRYPOINT ["java","-jar","producer_app.jar"]