package com.poly.part01.test04;

public class Dog extends Animal{

	@Override
	public void bark() {
		System.out.println("멍멍");
	}
	
	//bite라는 메소드 추가 이거는 dog만 갖고있는것
	public void bite() {
		System.out.println("깨물다!");
	}

}
