package com.example.vlogs.service;

import org.springframework.web.multipart.MultipartFile;

import com.example.vlogs.request.vo.AddPostRequestVo;

public interface ProfileService {

	void savePost(AddPostRequestVo request);

}
