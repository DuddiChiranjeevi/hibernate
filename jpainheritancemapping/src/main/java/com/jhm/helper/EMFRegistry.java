package com.jhm.helper;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EMFRegistry {

	private static EntityManagerFactory entityManagerFactory;
	
static {
	try {
		entityManagerFactory=Persistence.createEntityManagerFactory("jim");
		
	}catch(Throwable t) {
		t.printStackTrace();
		throw t;
	}
}

public static EntityManagerFactory getEmfEntityManagerFactory() {
	return entityManagerFactory;
}

public static void closeEntityManagerFactory() {
	if(entityManagerFactory !=null) {
		entityManagerFactory.close();
		entityManagerFactory=null;
	}
}
}
