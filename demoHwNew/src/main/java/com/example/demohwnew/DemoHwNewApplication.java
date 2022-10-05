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

    @Bean
    public CommandLineRunner seedData(PostRepository postRepository, PostService postService){
        return (args -> {
            postRepository.save(new Post("adam","testing content","adam@gmail.com","1234"));
            System.out.println("data coming thru");
            List<Post> postList = postRepository.findAll();
            for(int i = 0 ; i < postList.size(); i++){
                Post post = postList.get(i);
                System.out.println(post.getId());
                System.out.println(post.getName());
                System.out.println(post.getContent());
            }
            postRepository.save(new Post("2adam2","2testing content2","adam@gmail.com","1234"));

        });
    }
}
