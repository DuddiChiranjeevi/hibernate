package com.chig.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.chig.entities.Customer;
import com.chig.entities.CustomerPK;

public class CustomerTest {
	public static void main(String[] args) throws Exception {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		try {
			Configuration configuration = new Configuration().configure();

			sessionFactory = configuration.buildSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();

//		Customer customer=new Customer();
//		customer.setFirstName("Duddi");
//		customer.setLastName("Chiranjeevi");
//		customer.setDepartmentName("Java developer");
//		customer.setMobileNo("9059798193");
//		customer.setEmailId("chiru123@gmail.com");
//		
//		session.persist(customer);
//		
			CustomerPK id = new CustomerPK();
			id.setFirstName("Duddi");
			id.setLastName("Chiranjeevi");

			Customer customer = (Customer) session.get(Customer.class, id);
			System.out.println(customer);
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

		finally {
			if (transaction != null) {
				if (flag) {
					transaction.commit();
				} else {
					transaction.rollback();
				}
			}
			if (session != null) {
				session.close();
			}
			if (sessionFactory != null) {
				sessionFactory.close();
			}
		}

	}
}
