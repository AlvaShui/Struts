package com.ct.action;

public class LoginAction {
	private String userName;
	private String password;
	
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

	public String execute() throws Exception {
		if(getUserName().equals("chen")&&getPassword().equals("123")) {
			return "success";
		}else {
			return "input";
		}
	}
}
