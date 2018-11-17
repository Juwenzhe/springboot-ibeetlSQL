package com.springboot.beetlsql.entity;

import java.util.Date;

public class User {
	private Integer id;
	private String name;
	private Integer departmentId;
	private Date createTime;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Integer id, String name, Integer departmentId, Date createTime) {
		super();
		this.id = id;
		this.name = name;
		this.departmentId = departmentId;
		this.createTime = createTime;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", departmentId=" + departmentId + ", createTime=" + createTime
				+ "]";
	}
}
