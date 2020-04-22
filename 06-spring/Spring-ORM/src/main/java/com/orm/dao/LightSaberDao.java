package com.orm.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
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
	public void insert(LightSabers ls) {
		Session ses= sesfact.openSession();
		Transaction tx = ses.beginTransaction();
		ses.save(ls);
		tx.commit();
	}
}
