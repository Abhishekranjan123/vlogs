package com.example.vlogs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.example.vlogs.model.Posts;
import com.example.vlogs.model.Users;
import com.example.vlogs.request.vo.AddPostRequestVo;
import com.example.vlogs.response.vo.ResponseVo;
import com.example.vlogs.service.ProfileService;
import com.example.vlogs.service.UsersService;

@Controller
public class ProfileController {
	
	@Autowired
	private UsersService userService;
	
	@Autowired
	private ProfileService profileService;

	@RequestMapping(value="/getUserMedia" , method = { RequestMethod.POST, RequestMethod.GET })
	public String getUserMedia(Model model) {
		Users currentUser = userService.getCurrentUser();
		List<Posts> postList = userService.getPostByUserId(currentUser);
		model.addAttribute("posts", postList);
		model.addAttribute("user", currentUser.getUserId());
		return "user_profile";
	}
	
	@PostMapping("getCurrentUser")
	public @ResponseBody ResponseVo getCurrentUser() {
		ResponseVo response=new ResponseVo();
		try {
			Users currentUser = userService.getCurrentUser();
			response.setData(currentUser.getUserName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}
	
	@PostMapping("addPost")
	public String addPost(@ModelAttribute  AddPostRequestVo request) {
		ResponseVo response = new ResponseVo();
		try {
			System.out.println("Hello");
			
			if(request.getMedia().getContentType().equals("image/jpeg")) {
				
			}
			profileService.savePost(request);
			response.setMessage("Yes I am");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "redirect:/getUserMedia";
	}
	
	
	
}
