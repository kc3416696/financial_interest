package com.financial.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.financial.backend.model.UserAccount;
import com.financial.backend.service.UserService;

@RestController
public class UserController {
	//透過 @RequestMapping 指定從/會被對應到此hello()方法
	@Autowired
	UserAccount userAccount;
	
	@Autowired
	UserService userService;
    @RequestMapping("/user/add")
    public String hello(){
    	userAccount = new UserAccount();
    	userAccount.setUserID("A12345678");
    	userAccount.setEmail("test@gmail.com");
    	userAccount.setUserName("name");
    	userAccount.setAccount("123123123");
    	userService.addUser(userAccount);
        return "新增會員成功321";
    }

    @RequestMapping("/user/query")
    public String query(){
        return "111111";
    }

	@PostMapping(value="/test",consumes = "application/json;charset=UTF-8")
    public String test(@RequestParam(value="UserID",required = false) String arg1){
        return arg1;
    }

	// @PostMapping(value="/login",consumes = "application/json;charset=UTF-8")
    // public String login(@RequestBody User user) throws Exception{}

	// @RequestMapping(value ="/test", method = RequestMethod.POST)
	// // @ResponseStatus(HttpStatus.OK)
	// // @ResponseBody
	// public String updatePerson(@RequestParam("UserID") String arg1){
	// 	System.out.println(arg1);
	// 	// input.setName("NewName");
	// 	return arg1;
	// }
}