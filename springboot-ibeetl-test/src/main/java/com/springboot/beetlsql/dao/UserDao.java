package com.springboot.beetlsql.dao;

import java.util.List;

import org.beetl.sql.core.annotatoin.Param;
import org.beetl.sql.core.annotatoin.SqlResource;
import org.beetl.sql.core.mapper.BaseMapper;

import com.springboot.beetlsql.entity.User;

@SqlResource("ibeetlsql.user")
public interface UserDao extends BaseMapper<User>{
	User selectUserById(@Param("number") Integer pk);
	
	List<User> selectByPage(@Param("start") int start, @Param("offset") int offset);
}
