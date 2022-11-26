package com.example.vlogs.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.vlogs.model.Media;
import com.example.vlogs.repository.MediaRepository;
import com.example.vlogs.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService {
	
	@Autowired
	private MediaRepository mediaRepository;

	@Override
	public List<Media> getAllMedias() {
		List<Media> medias = mediaRepository.findAll();
		return medias;
	}

}
