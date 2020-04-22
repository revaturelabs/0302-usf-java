package com.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.orm.model.LightSabers;

@Repository
public class LightSaberDao {

	private SessionFactory sesfact;
	
	@Autowired
	public LightSaberDao(SessionFactory ses) {
		sesfact=ses;
	}
	
	//just hibernate...opening a session with the session factory, beginning a transaction, saving the instance, commit
	@Transactional
	public void insert(LightSabers ls) {
//		Session ses= sesfact.openSession();
//		Transaction tx = ses.beginTransaction();
//		ses.save(ls);
//		tx.commit();
		sesfact.openSession().save(ls);
	}
	
	@Transactional
	public LightSabers findById(int id) {
		return sesfact.openSession().get(LightSabers.class, id);
	}
	
	@Transactional
	public List<LightSabers> findAll(){
		return sesfact.openSession().createQuery("from LightSabers", LightSabers.class).list();
	}
}
