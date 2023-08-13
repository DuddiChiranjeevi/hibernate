package com.ha.test;

import com.ha.dao.EmployeeDao;
import com.ha.entities.Employee;

public class EmployeeTest {
public static void main(String[] args) {
	
	EmployeeDao employeeDao=new EmployeeDao();
	Employee emp=   employeeDao.getEmployee(1);
	System.out.println(emp.getRegisterdate());
}
}
