package com.example.vlogs.request.vo;

import org.springframework.web.multipart.MultipartFile;

public class AddPostRequestVo {

	private String userId;
	private MultipartFile media;
	private String state;
	private String city;
	private String place;
	private String discription;
	private String category;
	
	public String getUserId() {
		return userId;
	}
	public MultipartFile getMedia() {
		return media;
	}
	public String getState() {
		return state;
	}
	public String getCity() {
		return city;
	}
	public String getPlace() {
		return place;
	}
	public String getDiscription() {
		return discription;
	}
	public String getCategory() {
		return category;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setMedia(MultipartFile media) {
		this.media = media;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
}
