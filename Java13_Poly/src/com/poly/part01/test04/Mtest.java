package com.poly.part01.test04;

public class Mtest {

	public static void main(String[] args) {
		Animal a = new Cat();
		a.bark();
		a.eat("����");
		
		a = new Dog();
		a.bark();
		a.eat("���ٱ�");
		((Dog)a).bite();
		
		a=new Eagle();
		a.bark();
		a.eat("��ѱ�");
		((Eagle)a).fly();
	}

}
