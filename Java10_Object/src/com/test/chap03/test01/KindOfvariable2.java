package com.test.chap03.test01;

public class KindOfvariable2 {
	//파란색은 전역 변수 
	//private으로 바껴도 선언자체는 가능한데 이용하지를 못한다
	public static int staticNum;
	
	public static final int STATIC_NUM=1;
	//public 접근제한자에 static+final 키워드를 함께 사용하는 것을
	//'상수필드'
	//선언과 동시에 초기화가 되어야 한다
	
	//대문자로 변수를 정한다
	public final static int STATIC_NUM2=1;
	
	
	public void methodTest() {
		//static 초기화랑 {} 초기화 같이 쓸수 없다
		//static int localStaticNum;
		
	}
	public static void staticMethodTest() {
		//전역변수는 Stack에 연결된다
		//지역변수에서는 static 사용불가
		//static int localStaticNum;
	}
}
