package com.hitx.dao;

import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hitx.entities.Account;
import com.hitx.helper.SFRegistry;

public class AccountDao {

	public void saveAccount(Account account) throws SQLException, ClassNotFoundException {
		SessionFactory sessionFactory = null;
		Transaction transaction=null;
		Session session = null;
		boolean flag=false;
		try {
			sessionFactory = SFRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			transaction=session.beginTransaction();
		
			session.persist(account);
			flag=true;
		} finally {
			if(flag ==true) {
				transaction.commit();
			}else {
				transaction.rollback();
			}
			if (session != null) {
				session.close();
			}
		}
	}

}
