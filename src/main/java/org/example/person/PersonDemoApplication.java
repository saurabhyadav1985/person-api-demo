package org.example.person;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@OpenAPIDefinition
public class PersonDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PersonDemoApplication.class, args);
    }

}
