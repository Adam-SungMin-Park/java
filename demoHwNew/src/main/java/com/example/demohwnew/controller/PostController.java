package com.example.demohwnew.controller;

import com.example.demohwnew.dto.PostDto;
import com.example.demohwnew.entity.Post;
import com.example.demohwnew.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @GetMapping("/posts")
    public List<Post> getPost() {
        return postService.getAll();
    }

    @PostMapping("/posts")
    public Post createPost(@RequestBody PostDto postDto) {
        Post post = new Post(postDto);
        return postService.save(post);
    }
    @DeleteMapping("/posts/delete/{id}")
    public Long deletePost(@PathVariable Long id) {
        postService.delete(id);

        return id;
    }
    @GetMapping("/posts/{id}")
    public Optional<Post> getPostById(@PathVariable Long id){
        return postService.getById(id);
    }


    @PutMapping("/posts/update/{id}")
    public Optional<Post> updatePost(@PathVariable Long id, @RequestBody PostDto postDto) {
        Optional<Post> optionalPost = postService.getById(id);
        if(optionalPost.isPresent()){
            Post existingPost = optionalPost.get();
            if(existingPost.getPassword().equals(postDto.getPassword())){
                postService.update(id, postDto);
            }else{
                throw new IllegalStateException("Password not match");
            }
        }
        return postService.getById(id);
    }
}
