package com.example.service;

import com.example.dao.ClownDao;
import com.example.model.Clown;

public class ClownService {

	private ClownDao cd;
	
	public ClownService(){
		cd = new ClownDao();
	}
	
	public Clown findById(int id) {
		return id>0? cd.findById(id):null;
	}
}
