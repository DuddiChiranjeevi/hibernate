package com.otoasotm.test;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.otoasotm.entities.Product;
import com.otoasotm.entities.Warranty;
import com.otoasotm.helper.SFRegistry;

public class OneToOneAsOneToManyTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;

		Product product = null;
		Warranty warranty = null;

		try {
			sessionFactory = SFRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			product = new Product();
			product.setProductName("Men's Watch");
			product.setProductCode("CT0001");
			product.setPrice(500);
			product.setManufacturer("Quartz");

			session.persist(product);
			System.out.println(product.getProductId());

			warranty = new Warranty();
			warranty.setWarrantyIssuedDate(new java.util.Date());
			warranty.setNoDays(365);
			warranty.setMobileNo("9059798193");
			warranty.setProduct(product);

			session.persist(warranty);

			//System.out.println("Persist with an Id: " + warranty);
			flag = true;
			System.out.println(warranty);
		} catch (Exception e) {
			flag = false;
			e.printStackTrace();
			throw e;
		} finally {
			if (transaction != null) {
				if (flag) {
					transaction.commit();
				} else {
					transaction.rollback();
				}
			}
			if (session != null) {
				session.close();
				session = null;
			}
		}
		SFRegistry.closeSessionFactory();
	}
}
