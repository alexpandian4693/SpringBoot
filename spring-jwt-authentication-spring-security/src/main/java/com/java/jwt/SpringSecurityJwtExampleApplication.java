package com.java.jwt;

import com.java.jwt.model.User;
import com.java.jwt.repo.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringSecurityJwtExampleApplication {
    @Autowired
    private UserRepository repository;

    @PostConstruct
    public void initUsers() {
        List<User> users = Stream.of(
                new User(101, "MSD", "passMSD", "MSD@gmail.com"),
                new User(102, "Raina", "passRaina", "Raina@gmail.com"),
                new User(103, "Jadeja", "passJadeja", "Jadeja@gmail.com"),
                new User(104, "Hardik", "passHardik", "Hardik@gmail.com")
        ).collect(Collectors.toList());
        repository.saveAll(users);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityJwtExampleApplication.class, args);
    }

}
