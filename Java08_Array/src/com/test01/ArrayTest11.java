package com.test01;

import java.util.Scanner;

public class ArrayTest11 {
		//배열에 정수입력으로 5개를 받고 최대값과 최소값을 구해라
	public void test10() {
		int[] a = new int [5];
		int max =0 , min=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		max = a[0];
		min = a[0];
		
		for(int i=0; i<a.length; i++) {
			if(a[i]>max) {
				max = a[i];
			}else if(a[i]<min) {
				min = a[i];
			}
			System.out.println("최대값 : " + max);
			System.out.println("최소값 : " + min);
		}
}
}