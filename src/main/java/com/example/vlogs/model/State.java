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
import javax.persistence.Table;

@Entity
@Table(name="state")
public class State {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long stateId;
	
	@Column(name="state_name")
	private String stateName;
	
	@OneToMany(mappedBy="state", cascade = CascadeType.ALL)
	private List<City> citys= new ArrayList<>();

	public Long getStateId() {
		return stateId;
	}

	public String getStateName() {
		return stateName;
	}

	public List<City> getCitys() {
		return citys;
	}

	public void setStateId(Long stateId) {
		this.stateId = stateId;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public void setCitys(List<City> citys) {
		this.citys = citys;
	}

	
}
