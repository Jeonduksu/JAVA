package com.poly.part01.test06;

import java.util.Scanner;

//�߻� �޼ҵ�
public class Circle extends AreaImpl{

	@Override
	public void make() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է� : ");
		int r = sc.nextInt();
		
		double res = r * r * Math.PI;
		
		//super.setResult(res+"");
		setResult(String.format("%.2f", res));
	}

	//���� ���� ����ϰ� 
	//�θ��� print �������� �ļ��� print�� �����´�.
	@Override
	public void print() {
		System.out.println("����");
		super.print();
	}
}
