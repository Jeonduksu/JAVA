package com.poly.part01.test06;

import java.util.Scanner;

public class Triangle extends AreaImpl{

	@Override
	public void make() {
		Scanner sc = new Scanner(System.in);
		System.out.println("밑변 입력 : ");
		int x = sc.nextInt();
		System.out.println("높이 입력 : ");
		int y = sc.nextInt();
		
		//넓이 구하기 
		//넓이 방식 = 밑변 * 높이 /2
		double res = (double)x*y/2.0;
		
		setResult(String.format("%f", res));
	}
}
