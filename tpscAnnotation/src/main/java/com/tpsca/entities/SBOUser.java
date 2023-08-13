package com.tpsca.entities;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "sbo_user_info")
@Inheritance(strategy = InheritanceType.JOINED)
@Data
public class SBOUser implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	protected int UserId;
	@Column(name = "user_nm")
	protected String userName;
	protected String password;
	protected String gender;
	@Column(name = "mobile_no")
	protected String mobileNo;
	@Column(name = "email_id")
	protected String emlilId;
	@Column(name = "joining_date")
	protected LocalDate joiningDate;
	protected String status;
	@Column(name = "account_no")
	private String accountNo;
	@Column(name = "ifsc_code")
	private String ifscCode;
	@Column(name = "branch_nm")
	private String branchName;

}
