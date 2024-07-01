#
# Build stage
#
FROM openjdk:17 AS builddd
RUN mvnw -f pom.xml clean package

#
# Package stage
#
FROM openjdk:17
ARG JAR_FILE=./target/*.jar
COPY --from=build $JAR_FILE ems-backend-0.0.1-SNAPSHOT.jar
EXPOSE 8080
#ENTRYPOINT java -jar /app/runner.jar
ENTRYPOINT ["java", "-jar", "ems-backend-0.0.1-SNAPSHOT.jar"]


FROM openjdk:17
ADD target/ems-backend-0.0.1-SNAPSHOT.jar ems-backend-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "ems-backend-0.0.1-SNAPSHOT.jar"]