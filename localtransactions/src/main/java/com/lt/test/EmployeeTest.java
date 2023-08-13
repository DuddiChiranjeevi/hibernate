package com.lt.test;

import com.lt.dao.EmployeeDao;
import com.lt.entities.Employee;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.setEmpId(3);
		employee.setEmpName("Chiru");
		employee.setMobileNo("8529950654");
		employee.setEmailId("chiru@gmail.com");
		employee.setSalary(5000);
		
		EmployeeDao employeeDao =new EmployeeDao();
		  Employee emp=  employeeDao.saveEmployee(employee);
		System.out.println(emp);
		
	}
}
