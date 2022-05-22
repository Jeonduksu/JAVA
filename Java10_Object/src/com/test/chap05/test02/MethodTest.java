package com.test.chap05.test02;

public class MethodTest {

	//1.매개변수x , 반환값x 
	public void method1() {
		System.out.println("매개변수와 반환값이 둘 다 없는 메소드 입니다.");
		return;
		
	}
	
	//2매개변수x , 반환값o
	//메소드명이 달라야된다
	public String method2() {
		return "매개변수가 없지만 반환값이 있는 메소드입니다.";
	}
	
	//3매개변수o, 반환값 없다
	//반환값이 없으니 void 를 사용
	public void method3(int num, int num2) {
		System.out.println("sum : " + (num+num2));
		return;
	}
	
	//4매개변수o , 반환값 o
	public int method4(int num, int num2) {
		int sum = num+num2;
		return num+num2;
	}
	
	
	
	
	
	
}
