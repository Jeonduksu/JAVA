package com.poly.part01.test06;

import java.util.Scanner;

public class Triangle extends AreaImpl{

	@Override
	public void make() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�غ� �Է� : ");
		int x = sc.nextInt();
		System.out.println("���� �Է� : ");
		int y = sc.nextInt();
		
		//���� ���ϱ� 
		//���� ��� = �غ� * ���� /2
		double res = (double)x*y/2.0;
		
		setResult(String.format("%f", res));
	}
}
