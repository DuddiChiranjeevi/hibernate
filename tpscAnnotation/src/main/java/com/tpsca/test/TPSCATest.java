package com.tpsca.test;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tpsca.entities.GuestUser;
import com.tpsca.entities.PremiumUser;
import com.tpsca.entities.SBOUser;
import com.tpsca.helper.SFRegistry;

public class TPSCATest {
public static void main(String[] args) {
	SessionFactory sessionFactory=null;
	Session session=null;
	Transaction transaction=null;
	boolean flag=false;
	try {
		sessionFactory=SFRegistry.getSessionFactory();
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		
		SBOUser sboUser=new SBOUser();
		sboUser.setUserName("Chiranjeevi");
		sboUser.setPassword("Chiru@98");
		sboUser.setGender("Male");
		sboUser.setMobileNo("7095793613");
		sboUser.setEmlilId("chiru@gmail.com");
		sboUser.setJoiningDate(LocalDate.of(1998, 8, 06));
		sboUser.setStatus("A");
		sboUser.setAccountNo("6379748984");
		sboUser.setIfscCode("IDIB000K028");
		sboUser.setBranchName("Karvati Nagaram");
	session.persist(sboUser);
	System.out.println("Sbo User id : "+sboUser.getUserId());
		

		PremiumUser premiumUser=new PremiumUser();
		premiumUser.setUserName("Rakesh");
		premiumUser.setPassword("Raki@98");
		premiumUser.setGender("Male");
		premiumUser.setMobileNo("8096650457");
		premiumUser.setEmlilId("raki@gmail.com");
		premiumUser.setJoiningDate(LocalDate.of(1997, 11, 26));
		premiumUser.setStatus("A");
		premiumUser.setAccountNo("6379748984");
		premiumUser.setIfscCode("IDIB000K028");
		premiumUser.setBranchName("Karvati Nagaram");
		premiumUser.setDalyIncome(200);
		premiumUser.setIntroBonus(100);
		premiumUser.setComissionBySubordinatesPercentage(12);
	session.persist(premiumUser);
	System.out.println("Premium User id : "+premiumUser.getUserId());
		
		
		
		GuestUser guestUser=new GuestUser();
		guestUser.setUserName("Saikumar");
		guestUser.setPassword("sai@93");
		guestUser.setGender("Male");
		guestUser.setMobileNo("9642842463");
		guestUser.setEmlilId("sai@gmail.com");
		guestUser.setJoiningDate(LocalDate.of(1993, 10, 10));
		guestUser.setStatus("A");
		guestUser.setAccountNo("6379748984");
		guestUser.setIfscCode("IDIB000K028");
		guestUser.setBranchName("Karvati Nagaram");
		guestUser.setReffralBonus(50);
		guestUser.setDailyIncome(200);
	session.persist(guestUser);
	System.out.println("Premium User id : "+guestUser.getUserId());
	
	System.out.println("");
	GuestUser guestUser2=session.get(guestUser.getClass(), 3);
	System.out.println(guestUser2);
	
		
		PremiumUser premiumUser1=session.get(PremiumUser.class, 2);
		System.out.println(premiumUser1);
		
		SBOUser sboUser1=session.get(SBOUser.class, 3);
		System.out.println(sboUser1);
	flag=true;
	}finally {
		if(transaction !=null) {
			if(flag) {
				transaction.commit();
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
}
