package com.poly.part01.test01;

public class Dog extends Animal{

	@Override
	public void bark() {
		System.out.println("�۸۸�");
	}
	
	//animal�� eat�� ȣ���Ѵ�.
	@Override
	public void eat(String animal) {
		super.eat(animal);
	}
}
