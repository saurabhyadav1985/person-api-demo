# person-api-demo

**Build**

After checking out the project move into the person-api-demo directory. Here maven wrapper, pom.xml, dockerfile, source directory etc will be present.
Build the project using maven
    mvnw clean install

**Run**

Run the project after building using maven spring boot plugin. Below command needs to be ran on the same directory.
    mvnw spring-boot:run

**Containerization**


Build docker image
    docker build -t ysaurabh/person-api .

Push docker image to dockerhub
    docker push ysaurabh/person-api

Pull docker image
    docker pull ysaurabh/person-api

Run docker image 
    docker run -p 80:8080 person-api:latest

**Documentation**

API endpoint and documentation will be present on below URL which can be reached after launching the docker image.
    http://localhost/swagger-ui-custom.html

**Credentials **
    See application.properties
