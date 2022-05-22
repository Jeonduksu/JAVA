package com.test01;


public class Variable03 {
	//변수 선언&초기화
	//키보드로 입력받아 변수에 저장된 값 변경

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수 선언 & 초기화
		String name = "전덕수";
		char gender = 'M';
		int age = 24;
		
		System.out.println("name : " + name);
		System.out.println("gender : " + gender);
		System.out.println("age : " + age);
		
		//키보드로 입력받아 변수에 저장된 값 변경
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("이름 입력: ");
		name = sc.nextLine();
		
		
		System.out.print("성별 입력: ");
		gender = sc.next().charAt(0);
		
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		
		System.out.println("name : " + name);
		System.out.println("gender : " + gender);
		System.out.println("age : " + age);
		
		
		
		
	}

}
