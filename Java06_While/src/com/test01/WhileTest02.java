package com.test01;

import java.util.Scanner;

public class WhileTest02 {

	public static void main(String[] args) {
		// do while문
		WhileTest02 tc = new WhileTest02();
		tc.testDoWhile2();

	}
	public void testDoWhile() {
		int i = 11;
		
		do {
			System.out.println(i);
			i++;
		}while(i<10);
		
		System.out.println("while 종료 후 의 값 : " + i);
	}
    public void testDoWhile2() {
    	//키보드로 영어 문자열을 입력받아 출력
    	//"end" 입력시 종료
    	
    	Scanner sc = new Scanner(System.in);
    	String str = null;
    	
    	do {
    		System.out.println("문자열 입력 : ");
    		str = sc.next();
    		
    		System.out.println("str : " + str);
    	}while(!str.equals("end")); 
    	
    }
}
