package com.example.vlogs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="media")
public class Media {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="media_id")
	private Long mediaId;
	
	@Column(name="media_path")
	private String mediaPath;
	
	@Column(name="place_id")
	private String placeId;
	
	@Column(name="type")
	private String type;  //video , photo
	
	@Column(name="category_id")
	private String categoryId;
	
	@OneToOne
	private Posts post;
	
	public Long getMediaId() {
		return mediaId;
	}

	public void setMediaId(Long mediaId) {
		this.mediaId = mediaId;
	}

	public String getMediaPath() {
		return mediaPath;
	}

	public void setMediaPath(String mediaPath) {
		this.mediaPath = mediaPath;
	}

	public String getPlaceId() {
		return placeId;
	}

	public void setPlaceId(String placeId) {
		this.placeId = placeId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public Posts getPost() {
		return post;
	}

	public void setPost(Posts post) {
		this.post = post;
	}
	
	
}
