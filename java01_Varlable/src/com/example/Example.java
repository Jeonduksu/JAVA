package com.example;

import java.util.Scanner;

public class Example {
	public void example1() {
	Scanner sc = new Scanner(System.in);
	System.out.print("첫 번째의 정수를 입력하시오 : " );
	int num1 = sc.nextInt();
	
	System.out.print("두 번쨰의 정수를 입력하시오 : ");
	int num2 = sc.nextInt();
	
	System.out.println("더하기 결과 : " + (num1+num2));
	System.out.println("빼기 결과 : " + (num1-num2));
	System.out.println("곱하기 결과 : " + (num1*num2));
	System.out.println("나누기 결과 : " + (num1/num2));
	System.out.println("나머지 결과 : " + (num1%num2));
	
	
	
	}
	public void example2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		double a = sc.nextDouble();
		
		System.out.print("세로 : ");
		double b = sc.nextDouble();
		
		System.out.println("면적 : " + (a*b));		
		System.out.println("둘레 : " + ((a+b)*2));
	}
    public void example3() {
    	Scanner sc= new Scanner(System.in);
    	
    	System.out.println("문자열 입력(공백X) : ");
    	String val = sc.next();
    	
    	//apple
    	System.out.println("첫번째 문자 : " + val.charAt(0));
    	System.out.println("두번째 문자 : " + val.charAt(1));
    	System.out.println("세번째 문자 : " + val.charAt(2));
    	
    	System.out.println("입력된 글자 갯수 : " + val.length());
    	
    	
    }
}
