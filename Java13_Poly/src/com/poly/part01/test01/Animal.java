package com.poly.part01.test01;

public abstract class Animal {
	
	public void eat(String animal) {
		System.out.println(animal + "먹는다.");
	}
	
	//추상메소드
	//추상메소드는 abstract를 무조건 써줘야됨
	public abstract void bark();
}
