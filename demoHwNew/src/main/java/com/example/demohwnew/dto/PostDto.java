package com.example.demohwnew.dto;

import lombok.Getter;

@Getter
public class PostDto {
    private final String name;
    private final String content;
    private final String email;
    private final String password;

    public PostDto(String name, String content ,String email, String password) {
        this.name = name;
        this.content = content;
        this.email = email;
        this.password = password;
    }
}
