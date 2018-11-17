package com.springboot.beetlsql.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.springboot.beetlsql.entity.User;
import com.springboot.beetlsql.service.UserService;
@Controller
public class UserController {
	@Autowired UserService userService;
	@RequestMapping("/selectUser")
	@ResponseBody
	public User selectUser(){
		return userService.selectUserById(1);
	}
	
	@ResponseBody
	@RequestMapping("/selectByPage")
	public List<User> selectByPage(){
		return userService.selectByPage(1,2);
	}
}
