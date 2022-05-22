package com.arrayPractice1.sample;

import java.util.Random;
import java.util.Scanner;

public class ArraySample {

	public void test1() {
		int[] a = new int[10];
		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			a[i] = ((int) (Math.random() * 100) + 1);
			System.out.println(a[i]);
			sum += a[i];
		}
		System.out.println("합계 :" + sum);
	}

	public void test2() {
		int[] a = new int[10];
		int max, min;

		for (int i = 0; i < a.length; i++) {
			a[i] = (int) ((Math.random() * 100) + 1);
			System.out.print(a[i] + " ");
		}
		max = a[0];
		min = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			} else if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}

	public void test3() {
		byte[] a = new byte[10];
		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			a[i] = (byte) ((Math.random() * 100) + 1);
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
				sum += a[i];
			}
		}
		System.out.println("합계 : " + sum);
		System.out.println();
	}

	public void test4() {
		Scanner sc = new Scanner(System.in);

		// 문자열로 된 숫자 입력
		System.out.print("숫자로 된 문자열 입력 : ");
		String value = sc.next();

		int sum = 0;
		// 스트링 길이 만큼 반복
		// substring() 메소드를 이용하여 자른다
		// 어디서부터 어디까지
		for (int i = 0; i < value.length(); i++) {
			String s = value.substring(i, i + 1);
			sum += Integer.parseInt(s);
			// parse잘라서 정수로 바꺼주는 메소드
			// 한줄로도 가능 parse메소드를 사용해서 범위를 (vlaue.substring(i,i2)
		}
		System.out.println("sum : " + sum);
	}

	public void test5() {
		Scanner sc = new Scanner(System.in);

		// 문자열로 된 숫자 입력
		System.out.print("숫자로 된 문자열 입력 : ");
		String value = sc.next();
		int sum = 0;
		
		//반복해서 숫자로 바꺼준다
		for(int i=0; i<value.length(); i++) {
			sum += (int)value.charAt(i) - 48;
		}

		System.out.println("sum : " + sum);
	}
}
