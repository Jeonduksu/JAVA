package com.test01;

import java.util.Scanner;

public class ifTest03 {
	//else if ������ ���� ������ �� �� �ִ�.
	
	public void test() {
		int i = 10;
		int j = 20;
		
		if(i > j) {
			System.out.println(i + " ��" + j + " ���� Ů�ϴ�.");
		}else if(i == j){
			System.out.println(i + "��" + j + " �� �����ϴ�.");
		}else if(i < j) {
			System.out.println(i + "��" + j + "���� �۽��ϴ�.");
		}
	}
	public void test2() {
		//������ �ϳ� �Է¹޾� ����� ������ ������ ����� ���
		//�����, 90�� �̻��� A���
		//90 �̸� 80 �̻� B
		//80 �̸� 70 �̻� C
		//70 �̸� 60 �̻� D
		//60 �̸� F
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		int a = sc.nextInt();
		
		if(a >= 90) {
			System.out.println("A���");
		}else if(a<90 && a>=80) {
			System.out.println("B���");
		}else if(a<80 && a>=70) {
			System.out.println("C���");
		}else if(a<70 && a>=60) {
			System.out.println("D���");
		}else if(a<60) {
			System.out.println("F���");
		}
		
		
	}
    public void test3() {
    	//���� ������ �� ��޺� �߰� ���� �̻��� ��쿡��
    	//��޿� "+"��� ���ڸ� �߰��Ͽ� ���
    	//��)95�� �̻��̸� ����� A+���
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("���� �Է� : ");
    	int point = sc.nextInt();
    	
    	String grade = "";
    	
    	if(point >= 90) {
    		grade = "A";
    		if(point>=95) {
    			grade += "+";
    		}
    	}else if(point >= 80) {
    		grade = "B";
    		if(point>=85) {
    			grade += "+";
    		}
    	}else if(point >= 70) {
    		grade = "C";
    		if(point>=75) {
    			grade += "+";
    		}
    	}else if(point >= 60) {
    		grade = "D";
    		if(point>=65) {
    			grade +="+";
    		}
    	}else {
    		grade = "F";
    	}
    	
    	System.out.printf("����� ������ %d �̰�, ����� %�Դϴ�.",point,grade);
    }


}
