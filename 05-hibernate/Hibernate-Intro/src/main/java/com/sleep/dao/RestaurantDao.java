package com.sleep.dao;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sleep.model.Restaurant;
import com.sleep.util.HibernateUtil;

public class RestaurantDao implements DaoContract<Restaurant>{

	@Override
	public Restaurant getById(int id) {
		Session ses = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = ses.beginTransaction();
		Restaurant res = ses.get(Restaurant.class, id);
		tx.commit();
		return res;
	}

	@Override
	public Restaurant save(Restaurant t) {
		Session ses = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = ses.beginTransaction();
		ses.save(t);
		tx.commit();
		return t;
	}

}
