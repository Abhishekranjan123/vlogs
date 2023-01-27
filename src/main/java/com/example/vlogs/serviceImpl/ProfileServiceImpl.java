package com.example.vlogs.serviceImpl;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.vlogs.model.Posts;
import com.example.vlogs.model.Users;
import com.example.vlogs.repository.PostsRepo;
import com.example.vlogs.repository.UsersRepository;
import com.example.vlogs.request.vo.AddPostRequestVo;
import com.example.vlogs.service.ProfileService;
@Service
public class ProfileServiceImpl implements ProfileService {
	
	@Autowired
	private PostsRepo postsRepo;
	
	@Autowired
	private UsersRepository usersRepository;

	@Override
	public void savePost(AddPostRequestVo req) {
		Posts post= new Posts();
		try {
			
			
//			InputStream istream =file.getInputStream();
//			byte imageData[]= new byte[istream.available()];
//			
//			FileOutputStream fos = new FileOutputStream("filePathToWrite");
//			fos.write(imageData);
//			fos.close();
//			istream.close();
			
			Files.copy(req.getMedia().getInputStream(),Paths.get("D:\\blogs\\postMedia\\"+req.getMedia().getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
			post.setMediaPath("D:\\blogs\\postMedia\\"+req.getMedia().getOriginalFilename());
//			post.setCategory();
//			post.setCity();
			post.setDiscription(req.getDiscription());
			post.setPlace(req.getPlace());
			Optional<Users> findById = usersRepository.findById(Long.valueOf(req.getUserId()));
//			Users user =findById.get();
			post.setUsers(findById.get());
			
			postsRepo.save(post);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
