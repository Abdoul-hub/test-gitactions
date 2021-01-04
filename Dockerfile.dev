FROM openjdk:8 
LABEL maintainer="togolaabdoul@gmail.com"

VOLUME /tmp

EXPOSE 8080

COPY ./target/*.jar app.jar

CMD ["java","-jar","/app.jar"]

