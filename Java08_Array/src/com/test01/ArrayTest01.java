package com.test01;

import java.util.Scanner;

public class ArrayTest01 {
	public void testArray() {
		/*int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		int num5 = 50;
		
		int sum = 0;
		
		sum += num1;
		sum += num2;
		sum += num3;
		sum += num4;
		sum += num5;
		
		System.out.println(num1);
		*/
		
		int[] arr = new int[5];
		
		/*arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		sum += arr[0];
		sum += arr[1];
		sum += arr[2];
		sum += arr[3];
		sum += arr[4];*/
		//for문을 이용하여 값 대입
		for(int i=0; i<5; i++) {
			arr[i] = (i+1)*10;
		}
		
		int sum = 0;
		
		for(int i=0; i<5; i++) {
			sum += arr[i];
		}
		
		System.out.println(sum);
		
	}
	public void testArray2() {
		//배열의 선언
		//자료형[] 변수명;
		//자료형 변수명[]; 로 선언
		
		/*int[] iarr ;
		char carr[];
		
		//할당
		iarr = new int[5];
		carr = new char[10];
		*/
		
		int[] iarr = new int[5];
		char carr[] = new char[10];
		
		System.out.println(iarr);
		System.out.println(carr);
		
		System.out.println("iarr의 hashCode : " + iarr.hashCode());
		System.out.println("carr의 hashCode : " + carr.hashCode());
		
		System.out.println("iarr의 길이 : " + iarr.length);
		System.out.println("carr의 길이 : " + carr.length);
		
		//스캐너 활용하여 배열길이 입력 받아 할당
		Scanner sc = new Scanner(System.in);
		
		System.out.println("새로 할당할 배열의 길이 입력 : ");
		int size = sc.nextInt();
		
		double[] darr = new double[size];
		
		System.out.println("dar의 hashCode : " + darr.hashCode());
		//여기서 .length 변수(뼈대)라고 볼수 있다.
		//.length() 랑 .length 랑은 다르다.
		System.out.println("darr의 길이 : " + darr.length);
		
		darr = new double[30];
		
		System.out.println("수정 후 dar의 hashCode : " + darr.hashCode());
		System.out.println("수정 후 darr의 길이 : " + darr.length);
		
		darr = null;
		
		System.out.println("삭제 후 darr의 길이 : " + darr.length);
	}
	public void testArray3() {
		int[] iarr = new int[5];
		System.out.println(iarr[0]);
		System.out.println(iarr[1]);
		
		int[] iarr2 = {1,2,3,4,5};
		//int[] iarr2 = new int[] {1,2,3,4,5};
		for(int i=0; i<iarr.length; i++) {
			System.out.println(iarr2[i]);
		}
		
		//String[] sarr = new String[s];
		
		String[] sarr = {"apple","home","soju","phone"};
		
		for(int i=0; i<sarr.length; i++) {
			System.out.println(sarr[i]);
		}
	}
}
