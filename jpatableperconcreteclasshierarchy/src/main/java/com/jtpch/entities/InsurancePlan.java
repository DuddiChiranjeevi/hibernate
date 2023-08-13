package com.jtpch.entities;

import java.io.Serializable;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.GenericGenerators;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Table(name="insurance_plan")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Data
@SequenceGenerator(name = "insurance_plan_gen",sequenceName = "insurance_plan_seq",allocationSize = 1)
public class InsurancePlan implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator = "insurance_plan_gen")
	
	@Column(name="plan_no")
	protected int planNo;
	@Column(name="plan_nm")
	protected String planName;
	protected int tenure;
	@Column(name="premium_amount")
	protected double premiumAmount;
	@Column(name="insured_amount")
	protected double insuredAmount;
	protected String status;

}
