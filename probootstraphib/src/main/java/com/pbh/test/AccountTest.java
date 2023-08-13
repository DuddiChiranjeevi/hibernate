package com.pbh.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.pbh.entity.Account;
import com.pbh.helper.PropSFRegistry;

public class AccountTest {
public static void main(String[] args) throws ClassNotFoundException {
	SessionFactory sessionFactory=null;
	Session session=null;
	
	try {
		sessionFactory =PropSFRegistry.getSessionFactory();
		session=sessionFactory.openSession();
		Account account=session.get(Account.class, 1);
		System.out.println(account);
	}finally {
		if(session !=null) {
			session.close();
			session=null;
		}
		
	}
	PropSFRegistry.closeSessionFactory();
}
}
