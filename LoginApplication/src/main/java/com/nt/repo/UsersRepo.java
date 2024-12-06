package com.nt.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.model.Users;

@Repository
public interface UsersRepo extends JpaRepository<Users, String> {
	
	
	public String findByName(String name);
	public Optional<Users> findByNameAndPassword(String userId, String password);
	

}
