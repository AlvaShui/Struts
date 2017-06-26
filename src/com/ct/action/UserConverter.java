package com.ct.action;

import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import com.ct.domain.User;

public class UserConverter extends StrutsTypeConverter {

	@Override
	public Object convertFromString(Map arg0, String[] arg1, Class arg2) {
//		arg2 = User.class;
		if(arg1.length>1) {
			User[] users = new User[arg1.length];
			
			for(int i=0;i<arg1.length;i++) {
				User user = new User();
				String[] userValue = arg1[i].split(",");
				user.setUserName(userValue[0]);
				user.setPassword(userValue[1]);
				users[i] = user;
			} 
			return users;
		}else {
			User user = new User();
			String[] userValue = arg1[0].split(",");
			user.setUserName(userValue[0]);
			user.setPassword(userValue[1]);
			return user;
		}
	}

	@Override
	public String convertToString(Map arg0, Object arg1) {
		User user = (User)arg1;
		return user.toString();
	}

}
