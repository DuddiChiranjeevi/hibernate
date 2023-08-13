package com.jtpch.test;

import com.jtpch.entities.AccidentalInsurancePlan;
import com.jtpch.entities.InsurancePlan;
import com.jtpch.entities.MedicalInsurancePlan;
import com.jtpch.helper.EMFRegistry;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

public class JTPCCHTest {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=null;
	EntityManager entityManager=null;
	EntityTransaction entityTransaction=null;
	boolean flag=false;
	
	try {
		entityManagerFactory=EMFRegistry.getEmf();
//	Map<String, Object> 	pro=entityManagerFactory.getProperties();
//	System.out.println(pro);
		entityManager=entityManagerFactory.createEntityManager();
		entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		InsurancePlan insurancePlan=new InsurancePlan();
		insurancePlan.setPlanName("Insurance Plan1");
		insurancePlan.setTenure(12);
		insurancePlan.setPremiumAmount(12000);;
		insurancePlan.setInsuredAmount(200000);
		insurancePlan.setStatus("A");
		entityManager.persist(insurancePlan);
		
		System.out.println("Insurance plan id:"+insurancePlan.getPlanNo());
		
		MedicalInsurancePlan medicalInsurancePlan = new MedicalInsurancePlan();
		medicalInsurancePlan.setPlanName("MedicalInsurancePlan1");
		medicalInsurancePlan.setTenure(120);
		medicalInsurancePlan.setPremiumAmount(12000);
		medicalInsurancePlan.setInsuredAmount(1200000);
		medicalInsurancePlan.setStatus("A");
		medicalInsurancePlan.setCopay(10);
		medicalInsurancePlan.setCoverageType("In-patient");

		entityManager.persist(medicalInsurancePlan);
		System.out.println("Medical Insurance Plan No: " + medicalInsurancePlan.getPlanNo());
		AccidentalInsurancePlan accidentalInsurancePlan = new AccidentalInsurancePlan();
		accidentalInsurancePlan.setPlanName("AccidentalInsurancePlan1");
		accidentalInsurancePlan.setTenure(12);
		accidentalInsurancePlan.setPremiumAmount(2000);
		accidentalInsurancePlan.setInsuredAmount(600000);
		accidentalInsurancePlan.setStatus("A");
		accidentalInsurancePlan.setDisabilityCoveragePercentage(60);
		accidentalInsurancePlan.setInternationalCoverage(false);
		entityManager.persist(accidentalInsurancePlan);
	
		System.out.println("Medical Insurance Plan No: " + accidentalInsurancePlan.getPlanNo());

//		MedicalInsurancePlan medicalInsurancePlan=entityManager.find(MedicalInsurancePlan.class, 2);
//		System.out.println(medicalInsurancePlan);
	
		
//		AccidentalInsurancePlan accidentalInsurancePlan=entityManager.find(AccidentalInsurancePlan.class, 3);
//		System.out.println(accidentalInsurancePlan);
		
		InsurancePlan insurancePlan2=entityManager.find(InsurancePlan.class, 2);
		System.out.println(insurancePlan2);
		
		
		flag=true;
	}finally {
		if(entityTransaction !=null) {
			if(flag) {
				entityTransaction.commit();
			}else {
				entityTransaction.rollback();
			}
		}
		if(entityManager !=null) {}
		entityManager.close();
		entityManager=null;
	}
	EMFRegistry.closeEntityManagerFactory();
}
}
