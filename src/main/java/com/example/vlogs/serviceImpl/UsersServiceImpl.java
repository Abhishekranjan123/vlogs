package com.example.vlogs.serviceImpl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
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
			user.setAttemptCount(0);
			user.setUnlocking(true);
			user.setPassword(bCryptPasswordEncoder.encode(userVo.getPassword()));
			usersRepository.save(user);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	@Override
	public Users getCurrentUser() {
		try {
			Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
			String currentUser = authentication.getName();
			Users user = usersRepository.findByUserName(currentUser);
			return user;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public void saveUser(Users user) {
		usersRepository.save(user);
		
	}

}
