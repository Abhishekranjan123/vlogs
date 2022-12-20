package com.example.vlogs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.vlogs.model.State;

public interface StateRepo extends JpaRepository<State, Long> {

}
