package com.test.chap04.model.dto;

import java.util.Date;

public class User {

	//필드
	private String userId;
	private String userPwd;
	private String userName;
	private Date enrollDate;
	
	//생성자(기본생성자 , 매개변수 )
	//기본생성자
	public User() {}
	
	//매개변수 생성자
	//필드를 매개변수 객체로 채우겟다
	public User(String userId, String userPwd, String userName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
	}
	
	public User(String userId, String userPwd, String userName, Date enrollDate) {
		//this.userId = userId;
		//this.userPwd = userPwd;
		//this.userName = userName;
		this(userId, userPwd, userName);
		
		
		this.enrollDate = enrollDate;
	}
	
	
	//getter % setter
	//필드값을 되돌리고 싶은데 get&set
	public String getUserId() {
		//반환 하고자 하는 필드를 되돌아온다
		return userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public String getUserName() {
		return userName;
	}
	public Date getEnrollDate() {
		return enrollDate;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd; //필드 = 매개변수
	}
	
	public void serUserName(String userName) {
		this.userName = userName;
	}
	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}
	
	//information()
	public void information() {
		System.out.println(userId + " ," + userPwd + "," + userName + "," + enrollDate);
	}
}
