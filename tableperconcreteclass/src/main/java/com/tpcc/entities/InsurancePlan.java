package com.tpcc.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class InsurancePlan implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name="plan_no")
	protected int planNo;
	@Column(name="plan_name")
	protected String planName;
	protected int tenure;
	@Column(name="premium_amount")
	protected double premiumAmount;
	@Column(name="insured_amount")
	protected double insuredAmount;
	protected String status ;
	
}
