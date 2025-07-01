package com.blog.data.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.data.Model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
