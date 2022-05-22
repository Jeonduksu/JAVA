package com.test.chap05.test02;

public class Run {

	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
		
		//1)매개변수와 반환값 없는 메소드 호출
		mt.method1();
		
		//2)매개변수는 없지만 변환값은 있는 메소드 호출
		String str = mt.method2();
		System.out.println(str);
		
		//이렇게 사용해도 된다
		System.out.println(mt.method2());
		
		//3)메개변수는 있지만 변환값은 없는 메소드 호출
		mt.method3(10, 20);
		
		//4)매개변수와 변환값 있는 메소드 호출
		int result = mt.method4(30, 40);
		System.out.println(result);
	}

}
