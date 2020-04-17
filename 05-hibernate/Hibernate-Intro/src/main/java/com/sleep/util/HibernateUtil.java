package com.sleep.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * 
 * @author Revature
 * 
 * 	Configuration (class)
 * 		its job is to gather information from hibernate.cfg.xml and use that
 * 			information to create a session factory
 *
 *	SessionFactory (Interface)
 *		its job is to create sessions and store information on how to
 *			make connections to your db. Once it is configured, it is immutable.
 */
public class HibernateUtil {
	
	private static SessionFactory sessfact;
	
	private static SessionFactory buildSessionFactory() {
		Configuration config = new Configuration();
		//since we used the default file name, we do not have to use this. this
		//	is for if you name the file something different.
		config.configure("hibernate.cfg.xml");
		return config.buildSessionFactory();
	}
	
	public static SessionFactory getSessionFactory() {
		if(sessfact==null) {
			sessfact=buildSessionFactory();
		}
		return sessfact;
	}

}
