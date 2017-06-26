package com.ct.action;

import com.ct.domain.User;
import com.opensymphony.xwork2.ActionSupport;

public class LoginConverterAction extends ActionSupport{
	private User user;
	

	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public String execute() throws Exception {
		if(user.getUserName().equals("chen")&&user.getPassword().equals("123")) {
			return "success";
		}else {
			return "input";
		}
	}
}
