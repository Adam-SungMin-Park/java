package com.example.demohwnew.entity;

import com.example.demohwnew.dto.PostDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Post extends Timestamped{
    public Post(String name, String content, String email, String password) {
        this.name = name;
        this.content = content;
        this.email = email;
        this.password = password;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    public Post(PostDto postDto) {
        this.name = postDto.getName();
        this.content = postDto.getContent();
        this.email = postDto.getEmail();
        this.password = postDto.getPassword();
    }

    public void update(PostDto postDto){
        this.name = postDto.getName();
        this.content = postDto.getContent();
        this.email = postDto.getEmail();
        this.password = postDto.getPassword();
    }
}
