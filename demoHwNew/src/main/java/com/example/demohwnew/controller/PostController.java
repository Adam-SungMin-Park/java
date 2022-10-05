package com.example.demohwnew.controller;

import com.example.demohwnew.dto.PostDto;
import com.example.demohwnew.entity.Post;
import com.example.demohwnew.repository.PostRepository;
import com.example.demohwnew.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;
    private final PostRepository postRepository;

    @GetMapping("/api/posts")
    public List<Post> getPost() {
        return postRepository.findAllByOrderByModifiedAtDesc();
    }

    @PostMapping("/api/posts")
    public Post createPost(@RequestBody PostDto postDto) {
        Post post = new Post(postDto);
        return postRepository.save(post);
    }
    @DeleteMapping("/api/posts/{id}")
    public Long deletePost(@PathVariable Long id) {
        postRepository.deleteById(id);
        return id;
    }
    @PutMapping("/api/posts/{id}")
    public String updatePost(@PathVariable Long id, @RequestBody PostDto postDto) {
        Optional<Post> optionalPost = postService.getById(id);
        if(optionalPost.isPresent()){
            Post existingPost = optionalPost.get();
            if(existingPost.getPassword().equals(postDto.getPassword())){
                postService.update(id, postDto);
            }else{
                throw new IllegalStateException("Password not match");
            }
        }
        return "";
    }

}
