package com.financial.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.financial.backend.model.MemberAccount;
import com.financial.backend.service.MemberService;

@RestController
public class MemberController {
	//透過 @RequestMapping 指定從/會被對應到此hello()方法
	@Autowired
	MemberAccount memberAccount;
	
	@Autowired
	MemberService memberService;
    @RequestMapping("/add")
    public String hello(){
    	memberAccount = new MemberAccount();
    	memberAccount.setPassword("12345678");
    	memberAccount.setEmail("test@gmail.com");
    	memberAccount.setCellphone("0912345789");
    	memberAccount.setAddress("台北市");
    	memberService.addMember(memberAccount);
        return "新增會員成功";
    }

    @RequestMapping("/query")
    public String query(){
        return "111111";
    }
}