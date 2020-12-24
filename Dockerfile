ange this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
FROM cabraltogola/test-github-actions

LABEL maintainer="togolaabdoul@gmail.com"

VOLUME /tmp

EXPOSE 8080

COPY ./target/*.jar app.jar

CMD ["java","-jar","/app.jar"]

