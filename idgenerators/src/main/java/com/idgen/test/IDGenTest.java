package com.idgen.test;

import com.idgen.entities.Order;
import com.idgen.helper.EMFRegistry;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

public class IDGenTest {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		boolean flag = false;
		Order order = null;

		try {
			entityManagerFactory = EMFRegistry.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();

			order = new Order();
			order.setOrderName("Watches");
			order.setPrice(500);
			entityManager.persist(order);

			System.out.println("order no : " + order.getOrderId());

			flag = true;
		} finally {
			if (transaction != null) {
				if (flag) {
					transaction.commit();
				} else {
					transaction.rollback();
				}
			}
			if (entityManager != null) {
				entityManager.close();
			}
			EMFRegistry.closeEntityManagerFactory();
		}
	}
}
