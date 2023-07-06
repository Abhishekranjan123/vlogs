package com.example.vlogs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.vlogs.model.Media;
import com.example.vlogs.model.Users;
import com.example.vlogs.service.HomeService;
import com.example.vlogs.service.UsersService;

@Controller
@RequestMapping("home")
public class HomeController {
	
	@Autowired
	private HomeService homeService;
	
	@Autowired
	private UsersService userService;
	
	@GetMapping("displayHome")
	public String home(Model model) {
		System.out.println("in home controller");
		userService.resetUser();
		try {
			List<Media> medias = homeService.getAllMedias();
			if(medias==null|| medias.isEmpty()) {
				model.addAttribute("msg", "No Medias Available");
			}else {
				model.addAttribute("medias", medias);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Errors while geting medias"+ e.getMessage());
		}
		return"home";
	}

}
