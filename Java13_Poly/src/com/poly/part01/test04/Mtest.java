package com.poly.part01.test04;

public class Mtest {

	public static void main(String[] args) {
		Animal a = new Cat();
		a.bark();
		a.eat("»ý¼±");
		
		a = new Dog();
		a.bark();
		a.eat("»À´Ù±Í");
		((Dog)a).bite();
		
		a=new Eagle();
		a.bark();
		a.eat("ºñµÑ±â");
		((Eagle)a).fly();
	}

}
