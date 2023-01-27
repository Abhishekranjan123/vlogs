package com.example.vlogs.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="posts")
public class Posts {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="post_id")
	private Long postId;
	
	@Column(name="media_path")
	private String mediaPath;
	
	@Column(name="discription")
	private String Discription;
	
	@Column(name="place")
	private String place;
	
	@ManyToOne
	private Users users;
	
	@ManyToOne
	private City city;
	
	@ManyToOne
	private Category category;
	
	@OneToMany(mappedBy="post", cascade = CascadeType.ALL)
	private List<Likes> likes= new ArrayList<>();

	public Long getPostId() {
		return postId;
	}

	public String getMediaPath() {
		return mediaPath;
	}

	public String getDiscription() {
		return Discription;
	}

	public Users getUsers() {
		return users;
	}

	public Category getCategory() {
		return category;
	}

	public List<Likes> getLikes() {
		return likes;
	}

	public void setPostId(Long postId) {
		this.postId = postId;
	}

	public void setMediaPath(String mediaPath) {
		this.mediaPath = mediaPath;
	}

	public void setDiscription(String discription) {
		Discription = discription;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public void setLikes(List<Likes> likes) {
		this.likes = likes;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}
	

	
	
	
	
}
