package com.nt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Users;
import com.nt.repo.UsersRepo;
import com.nt.request.LoginRequest;

@Service
public class UserService {
    
    @Autowired 
    UsersRepo usersRepo;
    
    public Users addUser(Users user) {
        return usersRepo.save(user);
    }
    
    public Object loginUser(LoginRequest loginRequest) {
        Optional<Users> user = usersRepo.findById(loginRequest.getUserId());
        
        // Check if user is not found
        if (user.isEmpty()) {
            return false;
        }
        
        Users user1 = user.get();
        
        // Validate password
        if (!user1.getPassword().equals(loginRequest.getPassword())) {
            return false;
        }
        
        // Return user details upon successful login
        return user1; // Return the user details
    }
}
