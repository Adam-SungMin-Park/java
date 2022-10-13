package com.sparta.homework04.repository;


import com.sparta.homework04.model.Post;
import com.sparta.homework04.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findAllByBoard(Post post);
}
