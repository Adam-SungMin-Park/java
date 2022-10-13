package com.sparta.homework04.service;

import com.sparta.homework04.dto.CommentRequestDto;
import com.sparta.homework04.dto.ResponseDto;
import com.sparta.homework04.model.Post;
import com.sparta.homework04.model.Comment;
import com.sparta.homework04.model.Users;
import com.sparta.homework04.repository.PostRepository;
import com.sparta.homework04.repository.CommentRepository;
import com.sparta.homework04.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    private final PostRepository postRepository;
    private final CommentRepository commentRepository;
    private final UserRepository userRepository;

    @Autowired
    public CommentService(PostRepository postRepository, CommentRepository commentRepository, UserRepository userRepository) {
        this.postRepository = postRepository;
        this.commentRepository = commentRepository;
        this.userRepository = userRepository;
    }

    public ResponseDto<?> addComment(CommentRequestDto requestDto, Users user ) {
        Post post = postRepository.findById( requestDto.getPostId() )
                .orElseThrow( () -> new NullPointerException("게시글이 존재하지 않습니다") );

        Comment comment = new Comment( requestDto, user , post);

        commentRepository.save( comment );

        return ResponseDto.success( comment );



    }

    public ResponseDto<?> getComments( Long id ) {

        Post post = postRepository.findById( id )
                .orElseThrow( () -> new NullPointerException("게시글이 존재하지 않습니다") );

        List<Comment> commentList = commentRepository.findAllByBoard(post);

        return ResponseDto.success( commentList );

    }

    public ResponseDto<?> updateComment(Long id, CommentRequestDto requestDto ,Users user) {

        Post post = postRepository.findById( requestDto.getPostId() )
                .orElseThrow(() -> new RuntimeException("게시글이 없습니다."));

        Comment comment = commentRepository.findById( id )
                .orElseThrow(() -> new RuntimeException("댓글이 없습니다."));

        if( !comment.getUser().getUsername().equals( user.getUsername() ) ){
            throw new RuntimeException("본인이 작성한 댓글이 아닙니다.");
        }

        comment.updateComment( requestDto );

        commentRepository.save( comment );

        return ResponseDto.success(comment);
    }

    public ResponseDto<?> deleteComment( Long id , Users user) {

        Comment comment = commentRepository.findById( id )
                .orElseThrow(() -> new RuntimeException("댓글이 없습니다."));

        if( !comment.getUser().getUsername().equals( user.getUsername() ) ){
            throw new RuntimeException("본인이 작성한 댓글이 아닙니다.");
        }
        commentRepository.deleteById( id );

        return ResponseDto.success("delete success");

    }
}
