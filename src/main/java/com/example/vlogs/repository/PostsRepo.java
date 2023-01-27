package com.example.vlogs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.vlogs.model.Posts;
import com.example.vlogs.model.Users;

public interface PostsRepo extends JpaRepository<Posts, Long> {

	List<Posts> findByUsers(Users users);
	

}
