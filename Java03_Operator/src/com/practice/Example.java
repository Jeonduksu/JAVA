package com.practice;

import java.util.Scanner;

public class Example {

	public void sample1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� : ");
		int a = sc.nextInt();
		
		System.out.println("���� : ");
		int b = sc.nextInt();
		
		System.out.println("���� : ");
		int c = sc.nextInt();
		
		int sum = (a + b + c);
		double d = (a+b+c)/3.0;
		System.out.println("�հ�: " + sum);
		System.out.println("���: " + d);
		
		String str =(a>=40 && b>=40 && c>=40 && d>=60)?"�հ�":"���հ�";
		System.out.println(str);
		
		
	}
}
