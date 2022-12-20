package com.example.vlogs.controller;

import javax.websocket.Session;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.vlogs.vo.MediaVo;

@Controller
public class ProfileController {

	@GetMapping("/profile")
	public String profile() {
		return"user_profile";
	}
	
	@PostMapping("getUserMedia")
		public @ResponseBody MediaVo getUserMedia() {
			MediaVo response= new MediaVo();
			return response;
		}
	
}
