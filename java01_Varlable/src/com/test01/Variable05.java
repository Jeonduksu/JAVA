package com.test01;

public class Variable05 {

	public static void main(String[] args) {
		
		//준비
		//클래스명 변수명 = new 클래스명();
		Variable05 test = new Variable05();
				
		//실행
		//변수명.메소드명();
		test.testOverflow();
	}

	
	public void testOverflow() {
		//byte bnum = 128;
		
		byte bnum = 127;
		bnum = (byte)(bnum + 1);
		
		System.out.println("bnum : " + bnum);
		
	}
}
