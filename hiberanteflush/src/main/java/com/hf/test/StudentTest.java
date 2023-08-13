package com.hf.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hf.entity.Student;
import com.hf.helper.SFRegistery;

public class StudentTest {
	public static void main(String[] args) {

		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;

		try {
			sessionFactory = SFRegistery.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			Student student = new Student();
			student.setStudentId(2);
			student.setStudentName("Rakesh");
			student.setFatherName("Ashok");
			student.setAge(26);
			student.setGender("Male");
			student.setMobileNo("8096650457");
			student.setEmailId("rakesh1233@gmail.com");
			student.setCourse("java");
			session.persist(student);

			/*
			 * In case of hib 4 only if we call session.flush() method it will generates an
			 * sql query on db but it can't persist data into table .In case of hib 5 &hib 6
			 * it will automatically persist data into table by calling flush().
			 */
			
			session.flush();
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			
			if(flag ) {
				transaction.commit();
			}else {
				transaction.rollback();
			}

			if (session != null) {
				session.close();
				session = null;
			}
			SFRegistery.closeSessionFactory();
		}
	}

}
