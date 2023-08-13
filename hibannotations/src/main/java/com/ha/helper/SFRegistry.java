package com.ha.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SFRegistry {
private static SessionFactory sessionFactory;
	static { 
		try {
		Configuration configuration =new Configuration().configure();
		sessionFactory=configuration.buildSessionFactory();
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public static void closeSessionfactory() {
		if(sessionFactory !=null) {
			sessionFactory.close();
			sessionFactory=null;
		}
	}
}
