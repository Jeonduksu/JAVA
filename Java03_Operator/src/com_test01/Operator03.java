package com_test01;

public class Operator03 {
	public static void main(String args[]) {
		
		new Operator03().opTest();
		
	}
	
	public void opTest() {
		int num1 = 10;
		int num2 = 3;
		
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		//나누었을때 몫을 구한다.
		System.out.println(num1 / num2);
		//나누었을때 나머지를 구한다.
		System.out.println(num1 % num2);
		
		//짝수인지    값 % 2 == 0 true일경우 2의배수
 		//2의 배수인지 값 % 5 == 0
		
	}
}
