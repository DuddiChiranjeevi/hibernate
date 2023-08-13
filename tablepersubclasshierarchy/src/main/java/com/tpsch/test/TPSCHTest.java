package com.tpsch.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tpsch.entities.AccidentalInsurancePlan;
import com.tpsch.entities.InsurancePlan;
import com.tpsch.entities.MedicalInsurancePlan;
import com.tpsch.helper.SFRegistry;

public class TPSCHTest {
	public static void main(String[] args) {

		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		try {
			sessionFactory = SFRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();

//		InsurancePlan insurancePlan = new InsurancePlan();
//		insurancePlan.setPlanName("InsurancePlan1");
//		insurancePlan.setTenure(24);
//		insurancePlan.setPremiumAmount(2000);
//		insurancePlan.setInsuredAmount(600000);
//		insurancePlan.setStatus("A");
//
//		session.persist(insurancePlan);
//		System.out.println("Insurence plan no : " + insurancePlan.getPlanNo());
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
//
//		session.persist(accidentalInsurancePlan);
//		System.out.println("Accidental Insurance Plan No: " + accidentalInsurancePlan.getPlanNo());
//		flag = true;

			MedicalInsurancePlan medicalInsurancePlan = session.get(MedicalInsurancePlan.class, 2);
			System.out.println(medicalInsurancePlan);
			System.out.println("Medicalinsurence plan no : " + medicalInsurancePlan.getPlanNo());
			AccidentalInsurancePlan accidentalInsurancePlan = session.get(AccidentalInsurancePlan.class, 3);
			System.out.println(accidentalInsurancePlan);

//		
//		InsurancePlan insurancePlan = session.get(InsurancePlan.class, 2);
//		System.out.println(insurancePlan);

		} finally {
			if (transaction != null) {
				if (flag) {
					transaction.commit();
				} else {
					transaction.rollback();
				}
			}
			if (session != null) {
				session.close();
				session = null;

			}

		}
		SFRegistry.closeSessionFactory();
	}
}
