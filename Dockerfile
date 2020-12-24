FROM docker.io/cabraltogola/test-github-actions:v1

LABEL maintainer="togolaabdoul@gmail.com"

VOLUME /tmp

EXPOSE 8080

COPY ./target/*.jar app.jar

CMD ["java","-jar","/app.jar"]

