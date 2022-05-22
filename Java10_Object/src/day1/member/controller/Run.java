package day1.member.controller;

import day1.member.model.vo.Member;

public class Run {

	public static void main(String[] args) {
		Member lee = new Member();
		
		//기본생성자
		//setter로 값 변경
		lee.setMemberId("user01");
		lee.setMemberPwd("pass01");
		lee.setMemberName("abcd");
		lee.setAge(24);
		lee.setGender('M');
		lee.setPhone("010-4075-6891");
		lee.setEmail("jin5114jj");
		
		
		//getter로 조회
		System.out.println(lee.getMemberId());
		System.out.println(lee.getMemberPwd());
		System.out.println(lee.getMemberName());
		System.out.println(lee.getAge());
		System.out.println(lee.getGender());
		System.out.println(lee.getPhone());
		System.out.println(lee.getEmail());
		
	}

}
