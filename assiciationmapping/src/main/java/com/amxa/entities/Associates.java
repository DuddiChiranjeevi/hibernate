package com.amxa.entities;

import java.io.Serializable;
import java.util.Objects;

import lombok.Data;
@Data
public class Associates implements Serializable {

	private static final long serialVersionUID = 1L;
	private int empId;
	private String empName;
	private String gender;
	private String emailId;
	public Associates( String empName, String gender, String emailId) {
		this.empName = empName;
		this.gender = gender;
		this.emailId = emailId;
	}
	
	public Associates() {
		
	}
	
}
