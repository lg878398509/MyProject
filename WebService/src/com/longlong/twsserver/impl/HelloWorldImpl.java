package com.longlong.twsserver.impl;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;

import com.longlong.twsserver.HelloWorld;
import com.longlong.twsserver.domain.User;

@WebService(endpointInterface = "com.longlong.twsserver.HelloWorld", serviceName = "tessssss")
public class HelloWorldImpl implements HelloWorld {

	Map<Integer, User> users = new LinkedHashMap<Integer, User>();

	public String sayHi(String text) {
		return "Hello " + text;
	}

	public String sayHiToUser(User user) {
		users.put(users.size() + 1, user);
		return "Hello " + user.getName();
	}

	public String[] sayHiToUserList(List<User> userList) {
		String[] result = new String[userList.size()];
		int i = 0;
		for (User u : userList) {
			result[i] = "Hello " + u.getName();
			i++;
		}
		return result;
	}
}
