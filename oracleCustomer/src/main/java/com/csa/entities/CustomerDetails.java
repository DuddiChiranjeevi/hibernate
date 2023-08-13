package com.csa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "customer")
@Data
public class CustomerDetails {
	@Id
	@Column(name = "cus_id")
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;
	@Column(name = "cus_nm")
	private String customerName;
	@Column(name = "user_nm")
	private String userName;
	private String password;
	@Column(name = "email_id")
	private String emailId;
	@Column(name = "mobile_no")
	private String mobileNo;
	@Column(name = "pin_code")
	private String pinCode;
	private String address;

}
