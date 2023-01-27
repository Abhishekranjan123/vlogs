package com.example.vlogs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.vlogs.model.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {

	Users findByUserName(String userName);
	
}
