package com.longlong.twsserver.client;

import java.util.ArrayList;
import java.util.List;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.longlong.twsserver.HelloWorld;
import com.longlong.twsserver.domain.User;

public class HelloWorldClient {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		HelloWorld client = (HelloWorld) context.getBean("client");
		User user1 = new User();
		user1.setName("Tony");
		user1.setDescription("test");
		User user2 = new User();
		user2.setName("freeman");
		user2.setDescription("test");
		List<User> userList = new ArrayList<User>();
		userList.add(user1);
		userList.add(user2);
		String[] res = client.sayHiToUserList(userList);
		System.out.println(res[0]);
		System.out.println(res[1]);

	}
}
