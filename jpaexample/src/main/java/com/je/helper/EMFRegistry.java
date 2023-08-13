package com.je.helper;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EMFRegistry {

	private static EntityManagerFactory emf;
	
	static {
		try {
	 emf=	Persistence.createEntityManagerFactory("pu1");
		}catch(Exception e) {
			throw e;
		}
}

	public static EntityManagerFactory getEntityManagerFactory() {
		return emf;
	}

	public static void closeEmf() {
	if(emf !=null) {
		emf.close();
		emf=null;
	}
	}
	
}