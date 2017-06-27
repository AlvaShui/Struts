package com.ct.action;

import java.util.Date;

import com.ct.domain.User;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport{
	
	
	
	@Override
	public void validate() {
		if(user.getUserName().contains("admin"))
			this.addFieldError("user.userName", "该类用户名易被禁止使用");
		if(user.getPassword().contains("1234"))
			this.addFieldError("user.password", "密码过于简单，请重设");
	}

	private User user;
	

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String execute() throws Exception {
		System.out.println(user);
		return SUCCESS;
	}
}
