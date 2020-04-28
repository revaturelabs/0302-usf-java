package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.ScifiDao;
import com.example.model.Scifi;

@Service
public class ScifiService {

	@Autowired
	ScifiDao hd;
	
	public Scifi insert(Scifi h) {
		return hd.save(h);
	}
	
	public List<Scifi> findAll() {
		return hd.findAll();
	}
}
