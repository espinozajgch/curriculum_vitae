FROM openjdk:8-jdk-alpine

#FROM openjdk:8
#RUN apt-get update && apt-get install -y maven
#COPY . /project
#RUN  cd /project && mvn package -DskipTests

# Add a volume pointing to /tmp
#VOLUME /tmp

# Make port 8080 available to the world outside this container
EXPOSE 8080

# The application's jar file
ARG JAR_FILE=/target/curriculum-vitae.jar

# Add the application's jar to the container
#ADD ${JAR_FILE} app.jar
COPY ${JAR_FILE} application.jar
ENTRYPOINT ["java", "-jar", "application.jar"]
#ENTRYPOINT ["java", "-jar", "/project/target/demo.jar"]

