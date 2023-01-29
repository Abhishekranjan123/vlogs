package com.example.vlogs.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="experience")
public class Experience {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long experienceId;
	
	@Column(name="organization_name")
	private String organizationName;
	
	@Column(name="start_date")
	private LocalDateTime startDate;
	
	@Column(name="end_date")
	private LocalDateTime endDate;
	
	@Column(name="job_role")
	private String jobRole;
	
	@Column(name="employment_type")
	private String employmentType;
	
	@Column(name="discription")
	private String discription;
	
	@Column(name="location")
	private String location;
	
	@Column(name="currently_working")
	private Boolean currentlyWorking;
	
	@ManyToOne
	private UserDetails userDetails;

	public Long getExperienceId() {
		return experienceId;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}

	public String getJobRole() {
		return jobRole;
	}

	public String getEmploymentType() {
		return employmentType;
	}

	public String getDiscription() {
		return discription;
	}

	public String getLocation() {
		return location;
	}

	public Boolean getCurrentlyWorking() {
		return currentlyWorking;
	}

	public UserDetails getUserDetails() {
		return userDetails;
	}

	public void setExperienceId(Long experienceId) {
		this.experienceId = experienceId;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}

	public void setJobRole(String jobRole) {
		this.jobRole = jobRole;
	}

	public void setEmploymentType(String employmentType) {
		this.employmentType = employmentType;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setCurrentlyWorking(Boolean currentlyWorking) {
		this.currentlyWorking = currentlyWorking;
	}

	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}
	
	
}
