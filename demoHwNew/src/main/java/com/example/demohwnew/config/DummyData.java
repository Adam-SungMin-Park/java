package com.example.demohwnew.config;

import com.example.demohwnew.entity.Post;
import com.example.demohwnew.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class DummyData implements CommandLineRunner {

    @Autowired
    private PostService postService;


    @Override
    public void run(String... args) throws Exception {
        List<Post> posts = postService.getAll();

        if (posts.size() == 0) {

            Post post1 = new Post();
            Post post2 = new Post();

            post1.setName("user_first");
            post1.setEmail("adam@gmail.com");
            post1.setTitle("seed title");
            post1.setPassword("1234");
            post1.setContent("first content");

            post2.setName("user_Second");
            post2.setEmail("adam2@gmail.com");
            post2.setTitle("seed title2");
            post2.setPassword("1234");
            post2.setContent("second content");

            postService.save(post1);
            postService.save(post2);
        }

    }
}
