package com.example.vlogs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="city")
public class City {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	@Column(name="city_id")
	private Long cityId;
	
	@Column(name="city_name")
	private String cityName;
	
	@ManyToOne
	private State state;

	public Long getCityId() {
		return cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public State getState() {
		return state;
	}

	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public void setState(State state) {
		this.state = state;
	}

	
}
