package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Horror;

public interface HorrorDao extends JpaRepository<Horror, Integer>{

}
