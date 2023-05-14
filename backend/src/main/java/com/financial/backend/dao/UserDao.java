package com.financial.backend.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.financial.backend.model.UserAccount;

@Repository
public class UserDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void addUser(UserAccount userAccount){
		// System.out.println("EXCUTE INSERT MEMBER");
	  jdbcTemplate.update("INSERT INTO user(UserID, UserName, Email, Account) "
	  		+ "VALUES (?,?,?,?)",userAccount.getUserID(), userAccount.getUserName(), userAccount.getEmail(),
	  		userAccount.getAccount());
  }
}
