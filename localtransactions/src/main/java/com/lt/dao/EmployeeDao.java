package com.lt.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.lt.entities.Employee;
import com.lt.helper.SFRegistry;

public class EmployeeDao {
	SessionFactory sessionFactory = null;
	Session session = null;
	Transaction transaction=null;
	boolean flag=false;
	public Employee saveEmployee(Employee employee) {
		try {
		sessionFactory = SFRegistry.getSessionFactory();
		session = sessionFactory.openSession();
		transaction=session.beginTransaction();
		session.persist(employee);
		flag=true;
		}finally {
			if(flag) {
				transaction.commit();
			}else {
				transaction.rollback();
			}
			
			if(session !=null) {
				session.close();
			}
			
		}
		return employee;

}
}