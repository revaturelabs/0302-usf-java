package com.project.service;

import java.util.List;

import com.project.dao.DaoContract;
import com.project.dao.GiraffeDao;
import com.project.model.Giraffe;

public class GiraffeService {
	

	private GiraffeDao gdao;
	
	{
		gdao=new GiraffeDao();
	}
	
	public List<Giraffe> getAllGiraffes(){
		return gdao.findAll();
	}
	
	public Giraffe getbyId(int id) {
		return gdao.findById(id);
	}
	
	public Giraffe insert(String name, boolean exist) {
		return gdao.insert(new Giraffe(0, name, exist));
	}
	
	public Giraffe getByName(String s) {
		return gdao.findByString(s);
	}
}
