package com.example.vlogs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.vlogs.model.Media;
import com.example.vlogs.service.HomeService;

@Controller
@RequestMapping("home")
public class HomeController {
	
	@Autowired
	private HomeService homeService;
	
	@GetMapping("displayHome")
	public String home(Model model) {
		try {
			
			List<Media> medias = homeService.getAllMedias();
			if(medias==null|| medias.isEmpty()) {
				model.addAttribute("msg", "No Medias Available");
			}else {
				model.addAttribute("medias", medias);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error while geting medias"+ e.getMessage());
		}
		return"home";
	}

}
