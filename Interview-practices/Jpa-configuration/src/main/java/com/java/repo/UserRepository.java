package com.java.repo;  
import org.springframework.data.repository.CrudRepository;

import com.java.model.UserRecord;  
public interface UserRepository extends CrudRepository<UserRecord, String> 
{  
}  
