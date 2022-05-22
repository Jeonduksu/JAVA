package com.test01;

import java.util.Scanner;

public class ForTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ForTest02.testFor1();
		ForTest02.testFor2();
//		ForTest02.testFor4();
		
		
	}

	
	public static void testFor1() {
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				System.out.println("i= " + i+ "j =" +j);
			}
		System.out.println();
		}
	}
	public static void testFor2() {
		for(int i=2; i<=3; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i + "*" + j + "="+ (i*j));
			}
			System.out.println();
		}
	}
	public static void testFor3() {
		
		for(int r=1; r<=5; r++) {
			for(int c=1; c<=5; c++) {
				System.out.println("*");
			}
			System.out.println();
		}
	}
	public static void testFor4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("줄 수 : ");
		int num1 = sc.nextInt();
		
		System.out.println("칸 수 : ");
		int num2 = sc.nextInt();
		
		for(int r=1; r<=num1; r++) {
			//System.out.println("별별별별별별");
			// =>
			for(int c=1; c<=num2; c++) {
				if(r==c) {
					System.out.print(r);
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		/*for(int i=1; i<=num1; i++) {
			for(int j=1; j<=num2; j++) {
				System.out.print("*");
			}System.out.print(i);
			System.out.println();
		}*/
	}
}
