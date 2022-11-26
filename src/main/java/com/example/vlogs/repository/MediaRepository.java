package com.example.vlogs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.vlogs.model.Media;

public interface MediaRepository extends JpaRepository<Media, Long> {

}
