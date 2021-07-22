package com.test.chap04_constructor;

import java.util.Date;

public class MTest {

	public static void main(String[] args) {
		User u1 = new User();
		u1.prn();
		
		User u2 = new User("admin", "1234", "김수호");
		u2.prn();
		
		User u3 = new User("user1", "3211","사용자",new Date());
		u3.prn();
	
		//-----------
		u1.setUserId("user02");
		System.out.println( u1.getUserId());
		u1.prn();
		
		
		
		
	}

}
