package com.test.chap03.test01;

public class KindOfVariable { //클래스 영역의 시작
	//클래스 영역에 작성하는 변수 => 필드
	// 필드 == 멤버변수(클래스가 가지는 멤버라는 의미) == 전역변수(클래스 전역에서 사용할 수 있는 변수라는 의미)
	private int globalNum;
	
	
	//매개변수는 따로 초기화 할 필요가 없다.
	//호출 할 때 값을 적으면 보내준다.
	public void testMethod(int num) {//메소드 영역의 시작
		//메소드 영역에 작성하는 변수 => 지역변수
		//메소드 괄호 안에 선언하는 변수 => 매개변수
		int localNum;
		
		//지역변수 선언 외에 사용하기 위해서는 반드시 초기화 되어야 한다.
		//초기화 되지 않은 지역변수 사용하지 못한다
		//System.out.println(localNum);
		
		System.out.println(num);
		
		System.out.println(globalNum);
		//
		
	}//메소드 영역의 끝
	
	public void testMethod2() {
		System.out.println(globalNum);
		//System.out.println(localNum);
		//이거는 지역변수 라서 사용하지 못한다.
	}
}//클래스 영역의 끝
