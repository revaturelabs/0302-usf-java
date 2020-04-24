package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.BootDaoContract;
import com.example.model.Boot;

@Service
public class BootService {
	@Autowired
	private BootDaoContract bd;

	public Boot getBoot() {
		bd.save(new Boot(0,22,true));
		return bd.findById(1);
	}
	
}
