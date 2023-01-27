package com.example.vlogs.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="category_id")
	private Long categoryId;
	
	@Column(name="category_name")
	private Long categoryName;
	
	@OneToMany(mappedBy="category", cascade = CascadeType.ALL)
	private List<Posts> post= new ArrayList<>();

	public Long getCategoryId() {
		return categoryId;
	}

	public Long getCategoryName() {
		return categoryName;
	}

	public List<Posts> getPost() {
		return post;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public void setCategoryName(Long categoryName) {
		this.categoryName = categoryName;
	}

	public void setPost(List<Posts> post) {
		this.post = post;
	}
	
	
}
