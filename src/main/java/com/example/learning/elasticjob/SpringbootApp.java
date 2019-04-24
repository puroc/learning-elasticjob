package com.example.learning.elasticjob;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:spring-context.xml")
@SpringBootApplication
public class SpringbootApp {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApp.class,args);
    }

}
