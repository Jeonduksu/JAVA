package com.example;

import java.util.Scanner;

public class Example {
	public void example1() {
	Scanner sc = new Scanner(System.in);
	System.out.print("ù ��°�� ������ �Է��Ͻÿ� : " );
	int num1 = sc.nextInt();
	
	System.out.print("�� ������ ������ �Է��Ͻÿ� : ");
	int num2 = sc.nextInt();
	
	System.out.println("���ϱ� ��� : " + (num1+num2));
	System.out.println("���� ��� : " + (num1-num2));
	System.out.println("���ϱ� ��� : " + (num1*num2));
	System.out.println("������ ��� : " + (num1/num2));
	System.out.println("������ ��� : " + (num1%num2));
	
	
	
	}
	public void example2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		double a = sc.nextDouble();
		
		System.out.print("���� : ");
		double b = sc.nextDouble();
		
		System.out.println("���� : " + (a*b));		
		System.out.println("�ѷ� : " + ((a+b)*2));
	}
    public void example3() {
    	Scanner sc= new Scanner(System.in);
    	
    	System.out.println("���ڿ� �Է�(����X) : ");
    	String val = sc.next();
    	
    	//apple
    	System.out.println("ù��° ���� : " + val.charAt(0));
    	System.out.println("�ι�° ���� : " + val.charAt(1));
    	System.out.println("����° ���� : " + val.charAt(2));
    	
    	System.out.println("�Էµ� ���� ���� : " + val.length());
    	
    	
    }
}
