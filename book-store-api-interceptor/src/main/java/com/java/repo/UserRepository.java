package com.java.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.java.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findOneByEmailIdIgnoreCaseAndPassword(String emailId, String password);
}
