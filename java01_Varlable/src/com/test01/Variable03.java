package com.test01;


public class Variable03 {
	//���� ����&�ʱ�ȭ
	//Ű����� �Է¹޾� ������ ����� �� ����

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� ���� & �ʱ�ȭ
		String name = "������";
		char gender = 'M';
		int age = 24;
		
		System.out.println("name : " + name);
		System.out.println("gender : " + gender);
		System.out.println("age : " + age);
		
		//Ű����� �Է¹޾� ������ ����� �� ����
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("�̸� �Է�: ");
		name = sc.nextLine();
		
		
		System.out.print("���� �Է�: ");
		gender = sc.next().charAt(0);
		
		System.out.print("���� �Է� : ");
		age = sc.nextInt();
		
		System.out.println("name : " + name);
		System.out.println("gender : " + gender);
		System.out.println("age : " + age);
		
		
		
		
	}

}
