package com.ct.action;

import java.util.Map;

import com.ct.domain.User;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction2 extends ActionSupport{
	private Map<String,User> users;
	
	public Map<String, User> getUsers() {
		return users;
	}

	public void setUsers(Map<String, User> users) {
		this.users = users;
	}



	public String execute() throws Exception {
		if(users.get("one").getUserName().equals("xiao")&&users.get("one").getPassword().equals("123")
				||users.get("two").getUserName().equals("ming")&&users.get("two").getPassword().equals("123")) {
			System.out.println(users.get("one"));
			System.out.println(users.get("two"));
			return SUCCESS;
		}
		return INPUT;
	}
}
