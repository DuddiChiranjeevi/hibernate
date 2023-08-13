package com.amxa.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.amxa.entities.Associates;
import com.amxa.entities.Project;
import com.amxa.helper.SFRegistry;

public class AMXATest {
public static void main(String[] args) {
	
	SessionFactory sessionFactory=null;	
	Session session=null;
	Transaction tx=null;
	boolean flag=false;
	try {
		sessionFactory=SFRegistry.getSessionFactory();
		session=sessionFactory.openSession();
		tx=session.beginTransaction();
		
//		Associates a1=new Associates("Gopi", "male", "gopi@chubb.com");
//		Associates a2=new Associates("HarshSai", "male", "harsha@chubb.com");
//		session.persist(a1);
//		session.persist(a2);
//		
		Set<Associates> listAssociates=new HashSet<>();
//		listAssociates.add(a1);
//		listAssociates.add(a2);
		
//		System.out.println(listAssociates);
//		
//		Project project=new Project();
//		project.setProjectTittle("Integiration-Hub");
//		project.setClientName("Chubb Insurance");
//		project.setDomain("Insurance");
//		project.setDuration(24);
//		project.setTeamSize(5);
//		project.setAssociates(listAssociates);
//		
//	   session.persist(project);
//	   
//		System.out.println("Data inserted into the table "+project.getProjectId());
		
		Project p=session.get(Project.class, 1);
		System.out.println(p);
	listAssociates=	p.getAssociates();
	listAssociates.forEach(System.out::println);
//		Associates associates=session.get(Associates.class, 1);
//		System.out.println(associates);
		flag=true;
	}catch(Exception e) {
		e.printStackTrace();
		throw e;
	}finally {
		if(session !=null) {
		if(flag) {
		tx.commit();
	}else {
		tx.rollback();
	}
	session.close();
	session=null;
	}
	SFRegistry.closeSessionFactory();
	}
}
}
