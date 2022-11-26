package com.example.vlogs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="places")
public class Places {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long Id;
	
	@Column(name="place_name")
	private String placeName;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name="country")
	private String country;
	

	
}
