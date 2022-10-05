package com.example.demohwnew;

import com.example.demohwnew.dto.PostDto;
import com.example.demohwnew.entity.Post;
import com.example.demohwnew.repository.PostRepository;
import com.example.demohwnew.service.PostService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.List;

@SpringBootApplication
@EnableJpaAuditing
public class DemoHwNewApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoHwNewApplication.class, args);
    }
}
