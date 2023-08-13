package com.pbh.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PropSFRegistry {
	private static SessionFactory sessionFactory;
	static {
		try {
		Configuration configuration = new Configuration();
		configuration= configuration.addResource("com/pbh/entity/Account.hbm.xml");
		sessionFactory = configuration.buildSessionFactory();
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void closeSessionFactory() {
		if (sessionFactory != null) {
			sessionFactory.close();
			sessionFactory = null;
		}
		
	}
	
}
