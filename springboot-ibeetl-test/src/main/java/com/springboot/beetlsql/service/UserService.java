package com.springboot.beetlsql.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.beetlsql.dao.UserDao;
import com.springboot.beetlsql.entity.User;
@Service("userService")
public class UserService {
	@Autowired
	UserDao userDao;
	public User selectUserById(int i){
		return userDao.selectUserById(i);
	}
	
	public List<User> selectByPage(int start, int offset){
		return userDao.selectByPage(start, offset);
	}
}
