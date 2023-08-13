package com.hig.helper;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class PFRegistry {
 private static EntityManagerFactory entityManagerFactory;
 static {
	 try {
		 entityManagerFactory=Persistence.createEntityManagerFactory("higpu1");
	 }catch(Throwable t) {
		 t.printStackTrace();
		 throw t;
	 }
 }
public static EntityManagerFactory getEntityManagerFactory() {
	return entityManagerFactory;
}
 
 public static void closeEntityManagerFactory() {
	 if(entityManagerFactory !=null) {
		 entityManagerFactory.close();
		 entityManagerFactory=null;
		 
	 }
 }
}
