package com.sparta.homework04.controller;

import com.sparta.homework04.dto.PostRequestDto;
import com.sparta.homework04.dto.ResponseDto;
import com.sparta.homework04.security.UserDetailsImpl;
import com.sparta.homework04.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;



@RestController
public class PostController {
    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping("/auth/posts")
    public ResponseDto<?> addPost(
            @RequestBody PostRequestDto requestDto,
            @AuthenticationPrincipal UserDetailsImpl userDetails
            ){
        return postService.addPost( requestDto , userDetails.getUser() );
    }

    @GetMapping("/posts")
    public ResponseDto<?> getPost(){
        return postService.getPost();
    }

    @PutMapping("/auth/posts/{id}")
    public ResponseDto<?> updatePost(@PathVariable Long id,
                                      @RequestBody PostRequestDto requestDto,
                                      @AuthenticationPrincipal UserDetailsImpl userDetails ){
        return postService.updatePost( id , requestDto ,userDetails.getUser() );
    }

    @DeleteMapping("/auth/posts/{id}")
    public ResponseDto<?> deletePost(@PathVariable Long id,
                                      @AuthenticationPrincipal UserDetailsImpl userDetails){
        return postService.deletePost( id , userDetails.getUser() );
    }
}
