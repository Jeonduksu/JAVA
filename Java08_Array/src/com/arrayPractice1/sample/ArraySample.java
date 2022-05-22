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
		System.out.println("�հ� :" + sum);
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
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
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
		System.out.println("�հ� : " + sum);
		System.out.println();
	}

	public void test4() {
		Scanner sc = new Scanner(System.in);

		// ���ڿ��� �� ���� �Է�
		System.out.print("���ڷ� �� ���ڿ� �Է� : ");
		String value = sc.next();

		int sum = 0;
		// ��Ʈ�� ���� ��ŭ �ݺ�
		// substring() �޼ҵ带 �̿��Ͽ� �ڸ���
		// ��𼭺��� ������
		for (int i = 0; i < value.length(); i++) {
			String s = value.substring(i, i + 1);
			sum += Integer.parseInt(s);
			// parse�߶� ������ �ٲ��ִ� �޼ҵ�
			// ���ٷε� ���� parse�޼ҵ带 ����ؼ� ������ (vlaue.substring(i,i2)
		}
		System.out.println("sum : " + sum);
	}

	public void test5() {
		Scanner sc = new Scanner(System.in);

		// ���ڿ��� �� ���� �Է�
		System.out.print("���ڷ� �� ���ڿ� �Է� : ");
		String value = sc.next();
		int sum = 0;
		
		//�ݺ��ؼ� ���ڷ� �ٲ��ش�
		for(int i=0; i<value.length(); i++) {
			sum += (int)value.charAt(i) - 48;
		}

		System.out.println("sum : " + sum);
	}
}
