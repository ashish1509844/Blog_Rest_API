package com.blog.data.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.data.Model.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}
