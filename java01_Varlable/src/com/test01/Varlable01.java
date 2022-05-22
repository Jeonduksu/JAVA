package com.test01;

public class Varlable01 {
    //타입  변수명;
	//변수명 = 값;
	//타입 변수명 = 값;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Varlable01 test = new Varlable01(); //변수선언
		//준비
		//클래스명 변수명 = new 클래스명();
		
		test.declareVarlable();
		
		test.initVarlable();
		//변수명.메소드명();
		//실행
		
		
	}
	public void declareVarlable() {
		//숫자형
		//정수형
		byte bnum;
		short snum;
		int inum;
		long lnum;
		
		//실수형
		float fnum;
		double dnum;
		
		//문자
		char ch;
		
		//논리
		boolean isTrue;
		
		//문자열(참조형)
		String str;
		
		bnum = 1;
		snum = 2;
		inum = 4;
		lnum = 8L;
		
		fnum = 4.0f;
		dnum = 8.0;
		
		ch = 'A';
		str = "A";
		
		isTrue = false;
		
		//변수에 저장된 값 출력하기
		System.out.println("bnum의 값: " + bnum);
		System.out.println("snum의 값: " + snum);
		System.out.println("inum의 값: " + inum);
		System.out.println("lnum의 값: " + lnum);
		System.out.println("fnum의 값: " + fnum);
		System.out.println("dnum의 값: " + dnum);
		System.out.println("ch의 값: " + ch);
		System.out.println("str의 값: " + str);
		System.out.println("isTrue의 값: " + isTrue);
	}
	public void initVarlable() {	
		//선언과 동시에 초기화
		int inum = 4;
		double dnum = 8.0;
		char ch = 'A';
		String str = "안녕하세요";
		
		System.out.println(inum);
		System.out.println(dnum);
		System.out.println(ch);
		System.out.println(str);
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}