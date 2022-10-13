package com.sparta.homework04.service;

import com.sparta.homework04.dto.PostRequestDto;
import com.sparta.homework04.dto.ResponseDto;
import com.sparta.homework04.model.Post;
import com.sparta.homework04.model.Users;
import com.sparta.homework04.repository.PostRepository;
import com.sparta.homework04.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    private final PostRepository postRepository;
    private final UserRepository userRepository;

    @Autowired
    public PostService(PostRepository postRepository, UserRepository userRepository) {
        this.postRepository = postRepository;
        this.userRepository = userRepository;
    }

    public ResponseDto<?> addPost(PostRequestDto requestDto , Users user ) {
        Post post = new Post( requestDto , user );
        return ResponseDto.success(postRepository.save(post));
    }

    public ResponseDto<?> getPost(){
        return ResponseDto.success(postRepository.findAll());
    }


    public ResponseDto<?> updatePost(Long id , PostRequestDto requestDto , Users user) {
        Post post = postRepository.findById( id )
                .orElseThrow(() -> new RuntimeException("No post available"));

        if( !post.getUser().getUsername().equals( user.getUsername() ) ){
            throw new RuntimeException("Not written by user");
        }

        post.updateBoard( requestDto );

        postRepository.save(post);

        return ResponseDto.success(post);
    }

    public ResponseDto<?> deletePost(Long id, Users user) {
        Post post = postRepository.findById( id )
                .orElseThrow(() -> new RuntimeException("No post available"));

        if( !post.getUser().getUsername().equals( user.getUsername() ) ){
            throw new RuntimeException("Not written by user");
        }
        postRepository.deleteById( id );

        return ResponseDto.success("delete success");
    }

}
