package com.test01;

import java.util.Scanner;

public class Variable02 {
	// Scanner 클래스
	
    public static void main(String[] args) {
    	//준비
    	Variable02 test = new Variable02();
    	
    	//실행
    	test.inputTest();
    }
    
    public void inputTest() {
    	//준비
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print("name: ");
    	String name = sc.nextLine();
    	
    	System.out.print("age: ");
    	int age = sc.nextInt();
    	
    	System.out.println("height: ");
    	double height = sc.nextDouble();
    	
    	
    	System.out.println("name is " + name);
    	System.out.println("age is " + age);
    	System.out.println("height is " + height);
    	
    	sc.close();
    }
}
