package com.java.service;  
import java.util.List;   
import java.util.ArrayList;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import com.java.model.UserRecord;
import com.java.repo.UserRepository;  
@Service  
public class UserService 
{  
@Autowired  
private UserRepository userRepository;  
public List<UserRecord> getAllUsers()
{  
List<UserRecord>userRecords = new ArrayList<>();  
userRepository.findAll().forEach(userRecords::add);  
return userRecords;  
}  

public void addUser(UserRecord userRecord)
{  
userRepository.save(userRecord);  
}  
}  