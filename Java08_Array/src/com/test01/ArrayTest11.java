package com.test01;

import java.util.Scanner;

public class ArrayTest11 {
		//�迭�� �����Է����� 5���� �ް� �ִ밪�� �ּҰ��� ���ض�
	public void test10() {
		int[] a = new int [5];
		int max =0 , min=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� : ");
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
			System.out.println("�ִ밪 : " + max);
			System.out.println("�ּҰ� : " + min);
		}
}
}