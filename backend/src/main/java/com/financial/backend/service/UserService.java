package com.financial.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.financial.backend.dao.UserDao;
import com.financial.backend.model.UserAccount;

@Service
public class UserService {
	@Autowired
	UserDao userDao;
	public void addUser(UserAccount userAccount){
		userDao.addUser(userAccount);
	}
}
