package com.sleep.dao;


import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

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

	@Override
	public Restaurant findByName(String name) {
		Session ses = HibernateUtil.getSessionFactory().openSession();
		//native sql query
//		return ses
//				.createNativeQuery("select * from hiber_schema.restaurant where rest_name = '"+name+"'", Restaurant.class)
//					.getSingleResult();
		
		//HQL
		//	Hibernate Query Language
		return ses
				.createQuery("from Restaurant where name = '"+name+"'", Restaurant.class)
					.getSingleResult();
		
		//criteria query
		
		
		//	hibernate 4
//		Criteria criteria = ses.createCriteria(Restaurant.class);
//		criteria.add(Restrictions.like("name", name));
//		return (Restaurant) criteria.list().get(0);
		
		//	hibernate 5
//		CriteriaBuilder cb = ses.getCriteriaBuilder();
//		CriteriaQuery<Restaurant> cq = cb.createQuery(Restaurant.class);
//		Root<Restaurant> root = cq.from(Restaurant.class);
//		cq.select(root).where(cb.like(root.get("name"), name));
//		Query q = ses.createQuery(cq);
//		return (Restaurant) q.getResultList().get(0);
	}

}
