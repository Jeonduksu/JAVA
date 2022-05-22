package com.chap01.runtime;

import java.util.Scanner;

//예외처리 방법 !!
public class RuntimeException {
	//RuntimeException 예외처리 
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		RuntimeException re = new RuntimeException();
		re.test2();
	}
	public void test1() {
		int no = 100;
		
		System.out.print("나누는 수 하나 입력:");
		int inputNum = sc.nextInt();
		
		/*
		if문 처리
		if(inputNum == 0) {
			System.out.println("0을 입력했습니다.");
		}else {
			int res = no/inputNum;
			System.out.println("나누기 결과: " + res);
		}*/
		
		//try catch처리
		try {
		int res = no/inputNum;
		System.out.println("나누기 결과: " + res);
		}catch(ArithmeticException e) {
			System.out.println("Exception 발생");
		}
	}
	
	public void test2() {
		try {
		//ClassCastException
		/*	Object obj = 'a';
		System.out.println(obj);
		String str = (String)obj;
		System.out.println(str);
		*/
		//ArrayIndexOutOfBoundsException
			/*int arr[] = new int[2];
			arr[0] = 1;
			arr[1] = 2;
			
			arr[2] = 3;
			System.out.println("이거 실행 될까??");*/
			//NullPointerException
			String str = null;
			int length = str.length();
			
		}catch(ClassCastException e) {
			System.out.println("예외 발생! 형변환 불가");
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("이건 배열의 범위를 넘어가서 발생되는 예외야 !!");
			System.out.println(e.getMessage());
		}catch(NullPointerException e) {
			System.out.println("null 인디?");
		}
		finally {
			System.out.println("이거까진 실행!!");
		}
	}
	
}
