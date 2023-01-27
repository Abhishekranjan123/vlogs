package com.example.vlogs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.vlogs.model.Likes;

public interface LikesRepo extends JpaRepository<Likes, Long> {

}
