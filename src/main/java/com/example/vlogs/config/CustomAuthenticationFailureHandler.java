package com.example.vlogs.config;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;

import com.example.vlogs.model.Users;
import com.example.vlogs.repository.UsersRepository;

public class CustomAuthenticationFailureHandler extends SimpleUrlAuthenticationFailureHandler{

	@Autowired
	private UsersRepository usersRepository;
	@Override
	public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException exception) throws IOException, ServletException {
		String parameter = request.getParameter("username");
		Users user = usersRepository.findByUserName(parameter);
		if(user != null) {
			if(user.getUnlocking()!=false) {
				user.setAttemptCount(user.getAttemptCount()+1);
				if(user.getAttemptCount()>4) {
					user.setUnlocking(false);
				}
				usersRepository.save(user);
			}
		}
		super.setDefaultFailureUrl("/login");
		super.onAuthenticationFailure(request, response, exception);

	}

}
