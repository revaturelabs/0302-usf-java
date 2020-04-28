package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.HorrorDao;
import com.example.model.Horror;

@Service
public class HorrorService {

	@Autowired
	HorrorDao hd;
	
	public Horror insert(Horror h) {
		return hd.save(h);
	}
	
	public List<Horror> findAll() {
		return hd.findAll();
	}
}
