package com.poly.part01.test06;

import java.util.Scanner;

//추상 메소드
public class Circle extends AreaImpl{

	@Override
	public void make() {
		Scanner sc = new Scanner(System.in);
		System.out.println("반지름 입력 : ");
		int r = sc.nextInt();
		
		double res = r * r * Math.PI;
		
		//super.setResult(res+"");
		setResult(String.format("%.2f", res));
	}

	//원의 먼저 출력하고 
	//부모의 print 가져오고 후손의 print를 가져온다.
	@Override
	public void print() {
		System.out.println("원의");
		super.print();
	}
}
