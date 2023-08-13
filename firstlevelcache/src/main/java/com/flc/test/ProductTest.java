package com.flc.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.flc.entity.Product;
import com.flc.helper.SFRegistry;

public class ProductTest {
	public static void main(String[] args) throws Throwable {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		try {
			sessionFactory = SFRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			/*
			 * Product product=new Product(); product.setProductNo(1);
			 * product.setProductName("Blue Diamond");;
			 * product.setDescription("Mens wrist Watch");;
			 * product.setManufacturerName("Fodg");; product.setCategory("Watch");;
			 * product.setPrice(299); session.persist(product);
			 */
			
			/*
			 * //Get product from db Product product = session.get(Product.class, 1);
			 * //session.evict(product); Product product2 = session.get(Product.class, 1);
			 * System.out.println("check 2nd time it will get from cache ::"+(product==
			 * product2));
			 */
			
			Product product=new Product();
			product.setProductNo(2);
			session.update(product);
			
			product.setPrice(300);
			session.update(product);
			
			
			flag = true;
		} catch (Throwable t) {
			t.printStackTrace();
			throw t;
		} finally {

			if (flag = true) {
				transaction.commit();
			} else {
				transaction.rollback();
			}

			if (session != null) {
				session.close();
				session = null;
			}

			SFRegistry.closeSessionFactory();
		}

	}
}
