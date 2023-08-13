package com.jtpch.helper;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EMFRegistry {

	private static EntityManagerFactory emf;
	
	static {
		emf=Persistence.createEntityManagerFactory("jtpccpu1");
		
	}

	public static EntityManagerFactory getEmf() {
		return emf;
	}
	
	public static void  closeEntityManagerFactory () {
		if(emf !=null) {
			emf.close();
			emf=null;
		}
	}
}
