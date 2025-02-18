package com.example.rest_tdd.domain.post.post.repository;

import com.example.rest_tdd.domain.post.post.entity.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PostRepository extends JpaRepository<Post, Long> {
    Optional<Post> findTopByOrderByIdDesc();
    Page<Post> findByListed(boolean listed, PageRequest pageRequest);
    Page<Post> findByListedAndTitleLike(boolean listed, String keyword, PageRequest pageRequest);
    Page<Post> findByListedAndContentLike(boolean listed, String likeKeyword, PageRequest pageRequest);
}
