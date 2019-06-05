package ua.lviv.iot.controllers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories("ua.lviv.iot.repository")
@EntityScan("ua.lviv.iot.models")
public class RestApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(RestApplication.class, args);
    }
}
