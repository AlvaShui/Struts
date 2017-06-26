package com.ct.action;

import java.util.List;
import java.util.Map;

import com.ct.domain.User;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction3 extends ActionSupport{
	private List<User> users;

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public String execute() throws Exception {
		if(users.get(1).getUserName().equals("xiao")&&users.get(1).getPassword().equals("123")
				||users.get(2).getUserName().equals("ming")&&users.get(2).getPassword().equals("123")) {
			System.out.println(users.get(1));
			System.out.println(users.get(2));
			return SUCCESS;
		}
		return INPUT;
	}
}
