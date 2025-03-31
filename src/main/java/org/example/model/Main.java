package org.example.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("org.example")
@EntityScan(basePackages = "org.example.model") // Для сущностей
@EnableJpaRepositories(basePackages = "org.example.repository") // Для репозиториев
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
