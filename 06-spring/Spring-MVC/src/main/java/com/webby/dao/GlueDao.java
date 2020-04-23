package com.webby.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.webby.model.Glue;

@Repository
@Transactional
public class GlueDao implements DaoContract<Glue, Integer> {

	private SessionFactory sesfact;

	@Autowired
	public GlueDao(SessionFactory sse) {
		sesfact = sse;
	}

	@Override
	public List<Glue> findAll() {
		return sesfact.openSession().createQuery("from Glue", Glue.class).list();
	}

	@Override
	public Glue findById(Integer id) {
		return sesfact.openSession().get(Glue.class, id);
	}

	@Override
	public void save(Glue t) {
		sesfact.openSession().save(t);

	}

	@Override
	public void update(Glue t) {
		sesfact.getCurrentSession().update(t);
	}

	@Override
	public void deleteById(Integer id) {
		sesfact.getCurrentSession().delete(findById(id));
	}

	@Override
	public void delete(Glue t) {
		sesfact.getCurrentSession().delete(t);
	}

}
