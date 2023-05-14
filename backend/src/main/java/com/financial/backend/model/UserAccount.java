package com.financial.backend.model;

import org.springframework.stereotype.Component;

@Component
public class UserAccount {
  private String UserID;
  private String UserName;
  private String Email;
  private String Account;
  
  public String getUserID() {
	  return UserID;
  }
  
  public void setUserID(String UserID) {
	  this.UserID = UserID;
  }

  public String getEmail() {
	  return Email;
  }
  
  public void setEmail(String Email) {
	  this.Email = Email;
  }
  
  public String getUserName() {
	  return UserName;
  }
  
  public void setUserName(String UserName) {
	  this.UserName = UserName;
  }
  
  public String getAccount() {
	  return Account;
  }
  
  public void setAccount(String Account) {
	  this.Account = Account;
  }
}
  
  
  