package com.hitx.test;

import com.hitx.dao.AccountDao;
import com.hitx.entities.Account;

public class AccountTest {
public static void main(String[] args) throws Exception {
	Account account =new Account();
	account.setAccountId(200);
	account.setAccountHolderName("Ramana");
	account.setEmailId("Ramana@gmail.com");
	account.setMobileNo("9566847569");
	account.setDob("12/12/1995");
	AccountDao accountDao=new AccountDao();
	accountDao.saveAccount(account);
}
}
