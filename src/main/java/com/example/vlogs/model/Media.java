package com.example.vlogs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="media")
public class Media {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="media_path")
	private String mediaPath;
	
	@Column(name="place_id")
	private String placeId;
	
	@Column(name="type")
	private String type;  //video , photo
	
	@Column(name="category_id")
	private String categoryId;
}
