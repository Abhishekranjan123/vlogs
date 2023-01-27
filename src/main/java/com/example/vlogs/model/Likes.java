package com.example.vlogs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="likes")
public class Likes {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="like_id")
		private Long likeId;
		
		@ManyToOne
		private Users user;
		
		@ManyToOne
		private Posts post;

		public Long getLikeId() {
			return likeId;
		}

		public Users getUser() {
			return user;
		}

		public Posts getPost() {
			return post;
		}

		public void setLikeId(Long likeId) {
			this.likeId = likeId;
		}

		public void setUser(Users user) {
			this.user = user;
		}

		public void setPost(Posts post) {
			this.post = post;
		}
		
		
}
