package com.je.dao;

import com.je.entities.BirthdayGreetings;
import com.je.helper.EMFRegistry;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

public class BirthdayGreetingsDao {

	public void savePerson(BirthdayGreetings birthdayGreetings) {

		EntityManagerFactory emf = null;
		EntityTransaction et = null;
		EntityManager em = null;
		boolean flag=false;
		try {

			emf = EMFRegistry.getEntityManagerFactory();
			em = emf.createEntityManager();

			et = em.getTransaction();
			et.begin();
			em.persist(birthdayGreetings);
			flag=true;

		} finally {
			if (em != null) {
				if(flag ) {
					et.commit();
				}else {
					et.rollback();
				}
				em.close();
			}
		}
	}
}
