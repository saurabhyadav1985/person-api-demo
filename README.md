# person-api-demo

Build the project using maven (maven needs to be preinsta
    mvnw clean install

Run the project using maven spring boot plugin
    mvnw spring-boot:run

Build docker image
    docker build -t ysaurabh/person-api .

Push docker image to dockerhub
    docker push ysaurabh/person-api

Pull docker image
    docker pull ysaurabh/person-api

Run docker image 
    docker run -p 80:8080 person-api:latest

Documentation
    http://localhost/swagger-ui-custom.html

Credentials 
    See application.properties
