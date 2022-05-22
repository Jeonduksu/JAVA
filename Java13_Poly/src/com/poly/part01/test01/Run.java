package com.poly.part01.test01;

public class Run {

	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		cat.bark();
		dog.bark();
		
		//부모클래스 Animal의 eat을 호출
		cat.eat("고양이");
		dog.eat("강아지");
	}

}
