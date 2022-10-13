package com.sparta.homework04.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sparta.homework04.dto.CommentRequestDto;
import com.sparta.homework04.utils.Timestamped;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Comment extends Timestamped {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Column(nullable = false)
    private String author;

    @Column(nullable = false)
    private String content;

    @JsonIgnore
    @ManyToOne
    @JoinColumn( name = "USER_ID", nullable = false)
    private Users user;

    @JsonIgnore
    @ManyToOne
    @JoinColumn( name = "BOARD_ID", nullable = false)
    private Post post;

    public Comment( CommentRequestDto requestDto , Users user , Post post){
        this.content = requestDto.getContent();
        this.user = user;
        this.author = user.getUsername();
        this.post = post;
    }

    public void updateComment( CommentRequestDto requestDto) {
        this.content = requestDto.getContent();
    }
}
