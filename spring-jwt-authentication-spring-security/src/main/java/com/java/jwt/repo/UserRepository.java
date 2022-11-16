package com.java.jwt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.jwt.model.User;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserName(String username);
}
