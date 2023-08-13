package com.je.test;

import java.time.LocalDate;

import com.je.dao.BirthdayGreetingsDao;
import com.je.entities.BirthdayGreetings;
import com.je.helper.EMFRegistry;

public class BirthdayGreetingsTest {
public static void main(String[] args) {
	BirthdayGreetings birthdayGreetings =new BirthdayGreetings();
	birthdayGreetings.setPersonId(10);
	birthdayGreetings.setPersonName("Jyothi");
	birthdayGreetings.setFatherName("Krishnama Naidu");
	birthdayGreetings.setMobileNo("9010121481");
	birthdayGreetings.setDob(LocalDate.of(1985, 5, 10));
	birthdayGreetings.setWishes("Happy birthday  "+birthdayGreetings.getPersonName());
try {
BirthdayGreetingsDao birthdayGreetingsDao=new BirthdayGreetingsDao();
birthdayGreetingsDao.savePerson(birthdayGreetings);
}finally {
	
	EMFRegistry.closeEmf();
}

}
}