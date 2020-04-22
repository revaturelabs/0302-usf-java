package com.webby.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webby.dao.DaoContract;
import com.webby.dao.GlueDao;
import com.webby.model.Glue;

@Service
public class GlueService {

	private DaoContract<Glue, Integer> gluer;
	
	@Autowired
	public void setGluer(DaoContract<Glue, Integer> dd) {
		gluer=dd;
	}
	
	public List<Glue> getAll(){
		return gluer.findAll();
	}
	
	public Glue save(Glue g) {
		gluer.save(g);
		return g;
	}
}
