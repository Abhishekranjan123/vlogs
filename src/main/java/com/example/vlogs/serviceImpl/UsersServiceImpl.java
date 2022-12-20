package com.example.vlogs.serviceImpl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.vlogs.model.Users;
import com.example.vlogs.repository.UsersRepository;
import com.example.vlogs.service.UsersService;
import com.example.vlogs.vo.UsersVo;
@Service
public class UsersServiceImpl implements UsersService {

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Autowired
	private UsersRepository usersRepository;
	
	@Override
	public void addUser(UsersVo userVo) {
		Users user= new Users();
		try {
			BeanUtils.copyProperties(userVo, user);
			user.setPassword(bCryptPasswordEncoder.encode(userVo.getPassword()));
			usersRepository.save(user);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
