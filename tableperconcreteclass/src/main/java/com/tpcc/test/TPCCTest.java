package com.tpcc.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tpcc.entities.AccidentalInsurancePlan;
import com.tpcc.entities.InsurancePlan;
import com.tpcc.entities.MedicalInsurancePlan;
import com.tpcc.helper.SFRegistry;

public class TPCCTest {
public static void main(String[] args) {
	SessionFactory sessionFactory=null;
	Session session=null;
	Transaction transaction=null;
	boolean flag=false;
	try {
		sessionFactory =SFRegistry.getSessionFactory();
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		
//		InsurancePlan insurancePlan=new InsurancePlan();
//		insurancePlan.setPlanName("Insurance Plan1");
//		insurancePlan.setTenure(12);
//		insurancePlan.setPremiumAmount(12000);;
//		insurancePlan.setInsuredAmount(200000);
//		insurancePlan.setStatus("A");
//		session.persist(insurancePlan);
//		System.out.println("Insurance plan id:"+insurancePlan.getPlanNo());
//		
//		
//		MedicalInsurancePlan medicalInsurancePlan = new MedicalInsurancePlan();
//		medicalInsurancePlan.setPlanName("MedicalInsurancePlan1");
//		medicalInsurancePlan.setTenure(120);
//		medicalInsurancePlan.setPremiumAmount(12000);
//		medicalInsurancePlan.setInsuredAmount(1200000);
//		medicalInsurancePlan.setStatus("A");
//		medicalInsurancePlan.setCopay(10);
//		medicalInsurancePlan.setCoverageType("In-patient");
//
//		session.persist(medicalInsurancePlan);
//		System.out.println("Medical Insurance Plan No: " + medicalInsurancePlan.getPlanNo());
//
//		AccidentalInsurancePlan accidentalInsurancePlan = new AccidentalInsurancePlan();
//		accidentalInsurancePlan.setPlanName("AccidentalInsurancePlan1");
//		accidentalInsurancePlan.setTenure(12);
//		accidentalInsurancePlan.setPremiumAmount(2000);
//		accidentalInsurancePlan.setInsuredAmount(600000);
//		accidentalInsurancePlan.setStatus("A");
//		accidentalInsurancePlan.setDisabilityCoveragePercentage(60);
//		accidentalInsurancePlan.setInternationalCoverage(false);
//		session.persist(accidentalInsurancePlan);
//		System.out.println("Accidental Insurance Plan No: " + accidentalInsurancePlan.getPlanNo());

InsurancePlan insurancePlan=session.get(InsurancePlan.class, 1);
System.out.println(insurancePlan);
		flag=true;
	} finally {
		if(transaction !=null) {
			if(flag) {
				transaction.commit();
			}else {
				transaction.rollback();
			}
		}
		if(session !=null) {
			session.close();
			session=null;
		}
	}
	SFRegistry.closeSessionFactory();
}
}

