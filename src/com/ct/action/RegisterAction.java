package com.ct.action;

import java.util.Date;

import com.ct.domain.User;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport{
	private String userName;
	private String password;
	private int age;
	private Date birthDay;
	
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String user) {
		userName = user;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String pwd) {
		password = pwd;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public String execute() throws Exception {
		User user = new User(userName, password, age, birthDay);
		System.out.println(user);
		return SUCCESS;
	}
}
