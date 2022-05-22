package com_test01;

public class Operator04 {
	//비교 연산자
	
	//a<b a가 b보다 작은가?
	//>, ==, !=, <=, >=
	public static void main(String[] args) {
		
		int a=10, b=20;
		boolean res1, res2, res3;
		
		res1 = (a == b);
		res2 = (a <= b);
		res3 = (a > b);
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		
	}

}
