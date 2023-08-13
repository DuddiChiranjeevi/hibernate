package com.ha.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ha.entities.Employee;
import com.ha.helper.SFRegistry;

public class EmployeeDao {
	SessionFactory sessionFactory = null;
	Session session = null;
	Employee emp=null;
	
	public Employee getEmployee(int employeeId) {
		try {
		sessionFactory = SFRegistry.getSessionFactory();
		session = sessionFactory.openSession();
		emp=session.get(Employee.class, 1);
		System.out.println(emp);
		}finally {
	
			if(session !=null) {
				session.close();
			}
			
		}
		return emp;
		

}
}