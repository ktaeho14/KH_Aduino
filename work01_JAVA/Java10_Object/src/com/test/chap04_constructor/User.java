package com.test.chap04_constructor;

import java.util.Date;

public class User {
	
	private String userId;
	private String userPwd;
	private String userName;
	private Date regDate;
	
	//기본생성자
	public User() {
		
	}
	
	//매개변수 생성자 (오버로딩 이용)
	public User(String userId, String userPwd, String userName) {
		 this.userId = userId;
		 this.userPwd = userPwd;
		 this.userName = userName;
	
	}
	
	public User(String userId, String userPwd, String userName, Date regDate) {
//		this.userId = userId;
//		this.userPwd = userPwd;
//		this.userName = userName;
		
		this(userId, userPwd, userName);
		this.regDate = regDate;
		
		
		
	}
	
	
	//setter /getter 작성
	/*private로 설정이 되어있는것을 불러오기위한 역할
	 * setter(내가 저장하고싶은 값을 저장하는 방법)
	 * getter(저장되어있는 값을 가져온다)
	 */
	public String getUserId() {
		return userId;
	}
	
	public String getUserPwd() {
		return userPwd;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public Date getUserRegDate() {
		return regDate;
	}
	
	// -----
	public void setUserId(String userId) {
		this.userId= userId;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setUserRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	
	//출력용 메소드
	public void prn() {
		System.out.println(userId + "," + userPwd + "," + userName + "," + regDate );
	}
	
	
	
	}
	
	
	
	
	
	
	
	
	

