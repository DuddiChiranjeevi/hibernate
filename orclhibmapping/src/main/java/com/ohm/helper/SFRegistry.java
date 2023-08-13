package com.ohm.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SFRegistry {
private static SessionFactory sessionFactory;
static {
try {
	Configuration configuration=new Configuration().configure();
//	configuration.addResource("com/ohm/entity/BabyDetails.xml");
	System.out.println(configuration.getProperty("connection.driver_class"));
	sessionFactory=configuration.buildSessionFactory();
}catch (Exception e) {
	e.printStackTrace();
	throw e;
}
}
public static SessionFactory getSessionFactory() {
	return sessionFactory;
}

public static void closeSessionFactory() {
	if(sessionFactory !=null) {
		sessionFactory.close();
		sessionFactory=null;
	}
}
}