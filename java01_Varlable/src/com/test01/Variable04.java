package com.test01;

public class Variable04 {
    //상수
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		final int AGE;
		
		age = 19;
		AGE = 19;
		
		System.out.println("age : " + age);
		System.out.println("AGE : " + AGE);
		
		//값 변경
		age = 20;
		//AGE = 21;
		
		Variable05 test = new Variable05();
		test.testOverflow();
		
	}

}
