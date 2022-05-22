package com.inherit.chap02.override;

public class Run {

	public static void main(String[] args) {

		Book b1 = new Book("수학의 정석","나수학",100);
		Book b2 = new Book("자바의 정석","다자바",200);
	
		System.out.println("b1 = " + b1);
		System.out.println("b2 = " + b2);
	
		
		
		//비교
		System.out.println("b1과 b2는 같은 객체? : " + b1.equals(b2));
		
		//얉은복사 라고 볼수 있다
		//얉은복사를 함으로써 b1의 주소값을 b3에 담는다 그래서 비교를 하면 같다.
		Book b3 = b1;
		System.out.println("b1과 b3는 같은 객체? : " + b1.equals(b3));
		
		//주소값이 같다고해도 객체는 다르다!
		//b1과 값이 동일한 객체 생성
		Book b4 = new Book("수학의 정석","나수학",100);
		System.out.println("b1과 b4는 같은 객체? : " + b1.equals(b4));
		System.out.println(b1.hashCode());
		System.out.println(b4.hashCode());
		
	}


}
