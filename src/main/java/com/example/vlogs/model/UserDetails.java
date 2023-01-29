package com.example.vlogs.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="user_details")
public class UserDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userDetailsId;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="middle_name")
	private String middleName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="age")
	private Date dateOfBirth;
	
	@Column(name="profile")
	private String profile;
	
	@Column(name="profile_picture")
	private String profilePicture;
	
	@Column(name="cover_picture")
	private String coverPicture;
	
	@OneToOne
	private Users user;
	
	@OneToMany(mappedBy="userDetails", cascade = CascadeType.ALL)
	private List<Experience> experience= new ArrayList<>();

	public Long getUserDetailsId() {
		return userDetailsId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public String getProfile() {
		return profile;
	}

	public String getProfilePicture() {
		return profilePicture;
	}

	public String getCoverPicture() {
		return coverPicture;
	}

	public Users getUser() {
		return user;
	}

	public List<Experience> getExperience() {
		return experience;
	}

	public void setUserDetailsId(Long userDetailsId) {
		this.userDetailsId = userDetailsId;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}

	public void setCoverPicture(String coverPicture) {
		this.coverPicture = coverPicture;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public void setExperience(List<Experience> experience) {
		this.experience = experience;
	}
	
}
