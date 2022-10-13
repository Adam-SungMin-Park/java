package com.sparta.homework04.model;


import com.sparta.homework04.dto.PostRequestDto;
import com.sparta.homework04.utils.Timestamped;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Setter
@Getter
@NoArgsConstructor
@Entity
public class Post extends Timestamped {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private String author;

    @ManyToOne
    @JoinColumn( name = "USER_ID", nullable = false)
    private Users user;

    public Post(PostRequestDto requestDto , Users user ){
        this.title = requestDto.getTitle();
        this.content = requestDto.getContent();
        this.user = user;
        this.author = user.getUsername();
    }

    public void updateBoard(PostRequestDto requestDto) {
            this.title = requestDto.getTitle();
            this.content = requestDto.getContent();
    }
}
