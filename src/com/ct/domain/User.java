package com.ct.domain;

import java.util.Date;

public class User {

	private String userName;
	private String password;
	private int age;
	private Date birthDay;
	public User() {
		super();
	}
	public User(String userName, String password, int age, Date birthDay) {
		super();
		this.userName = userName;
		this.password = password;
		this.age = age;
		this.birthDay = birthDay;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + ", age=" + age + ", birthDay=" + birthDay
				+ "]";
	}
	
	
}
