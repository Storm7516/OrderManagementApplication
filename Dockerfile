FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY target/OrderManagementApplication-0.0.1.jar ordermgmtapp.jar
COPY src/main/resources/config/application.yml /app/src/main/resources/config/application.yml
COPY db /app/db
ENTRYPOINT ["java","-jar","ordermgmtapp.jar"]
