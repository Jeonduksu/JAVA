package com.test01;

import java.util.Scanner;

public class WhileTest02 {

	public static void main(String[] args) {
		// do while��
		WhileTest02 tc = new WhileTest02();
		tc.testDoWhile2();

	}
	public void testDoWhile() {
		int i = 11;
		
		do {
			System.out.println(i);
			i++;
		}while(i<10);
		
		System.out.println("while ���� �� �� �� : " + i);
	}
    public void testDoWhile2() {
    	//Ű����� ���� ���ڿ��� �Է¹޾� ���
    	//"end" �Է½� ����
    	
    	Scanner sc = new Scanner(System.in);
    	String str = null;
    	
    	do {
    		System.out.println("���ڿ� �Է� : ");
    		str = sc.next();
    		
    		System.out.println("str : " + str);
    	}while(!str.equals("end")); 
    	
    }
}
