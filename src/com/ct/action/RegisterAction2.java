package com.ct.action;

import com.ct.domain.User;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction2 extends ActionSupport{
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
