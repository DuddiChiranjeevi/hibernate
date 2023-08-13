package com.ohm.test;

import java.io.Serializable;
import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ohm.entity.BabyDetails;
import com.ohm.helper.SFRegistry;

public class BabydetailsTest {
public static void main(String[] args) {
	SessionFactory sessionFactory=null;
	Session session=null;
	Transaction transaction=null;
	boolean flag=false;
	
	try {
		sessionFactory=SFRegistry.getSessionFactory();
		session=sessionFactory.openSession();
		transaction =session.beginTransaction();
		
		BabyDetails babyDetails=new BabyDetails();
		babyDetails.setBabyName(null);
		babyDetails.setFatherName("Prasad");
		babyDetails.setMotherName("Sharmila");
		babyDetails.setDob(LocalDate.of(2023,5,29));
		babyDetails.setGender("Male");
		session.persist(babyDetails);
		flag=true;
	}catch(Exception e) {
		e.printStackTrace();
		flag=false;
		throw e;
	}finally {
		if(flag ==true) {
			transaction.commit();
			System.out.println("data inserted into db");
			
		}else {
			transaction.rollback();
		}
	if(session !=null) {
		
		session.close();
		session=null;
	}
	}
	SFRegistry.closeSessionFactory();
}
}
