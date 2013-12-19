package com.longlong.twsserver;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.longlong.twsserver.domain.User;
@WebService
public interface  HelloWorld {
	String sayHi(@WebParam(name="text")String text);
    String sayHiToUser(User user);
    String[] sayHiToUserList(List<User> userList);
}
