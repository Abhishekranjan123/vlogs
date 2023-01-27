package com.example.vlogs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.vlogs.model.City;

public interface CityRepo extends JpaRepository<City, Long> {

}
