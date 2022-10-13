package com.sparta.homework04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class homework04 {

    public static void main(String[] args) {
        SpringApplication.run(homework04.class, args);
    }

}
