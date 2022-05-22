package com.practice;

import java.util.Scanner;

public class Example {

	public void sample1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 : ");
		int a = sc.nextInt();
		
		System.out.println("영어 : ");
		int b = sc.nextInt();
		
		System.out.println("수학 : ");
		int c = sc.nextInt();
		
		int sum = (a + b + c);
		double d = (a+b+c)/3.0;
		System.out.println("합계: " + sum);
		System.out.println("평균: " + d);
		
		String str =(a>=40 && b>=40 && c>=40 && d>=60)?"합격":"불합격";
		System.out.println(str);
		
		
	}
}
