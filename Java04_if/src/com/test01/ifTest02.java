package com.test01;

import java.util.Scanner;

public class ifTest02 {
	//if~else
	//�� �� �ϳ��� �����ϴ� ���ǹ�
	public void test() {
		int i = 20;
		
		if(i<10) {
			System.out.println(i + " �� 10���� �۽��ϴ�.");
		}else {
			System.out.println(i + " �� 10���� ũ�ų� �����ϴ�.");
		}
		
		
	}
	public void test2() {
		//���ڸ� �ϳ� �Է¹޾� Ȧ�� ¦������ ���
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Է� : ");
		int a= sc.nextInt();
		
		if(a % 2 == 0) {
			System.out.println("¦���Դϴ�");
		}else {
			System.out.println("Ȧ���Դϴ�");
		}
		
	}
	
	public void test3() {
		//Scanner�� ���� �ϳ� �Է�
		////50���� ũ�ų� ��������� ¦������, Ȧ������ ���
		//50���� ��������� �ڰ� ��� ���
		Scanner sc = new Scanner(System.in);
		System.out.println("0���� ū ���� �Է�: ");
		int no = sc.nextInt();
		
		if(no >=50 ) {
			if(no % 2== 0) {
				System.out.println("50���� ū ¦��	");
			} else {
				System.out.println("50���� ū Ȧ��");
			}
		    }else {
			    System.out.println("50���� �۴�.");
		}
		
	}
	public void test4() {
		//���� �ϳ� �Է� �޾� ������� �������� ���. ��,0�̸� "�Դϴ�."��� ���
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �ϳ� �Է� : ");
		int a = sc.nextInt();
		
		if(a == 0) {
			System.out.println("0�Դϴ�");
		}else {
			if(a>0) {
				System.out.println("����Դϴ�");
			}else {
				System.out.println("�����Դϴ�");
			}
		}
	}
}
