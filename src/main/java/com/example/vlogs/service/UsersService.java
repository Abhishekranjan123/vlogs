package com.example.vlogs.service;

import java.util.List;

import com.example.vlogs.model.Posts;
import com.example.vlogs.model.Users;
import com.example.vlogs.vo.UsersVo;

public interface UsersService {

	void addUser(UsersVo user);
	
	Users getCurrentUser();

	void saveUser(Users user);

	void resetUser();

	List<Posts> getPostByUserId(Users currentUser);

}
