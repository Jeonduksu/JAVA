package com.inherit.chap03.test01.bbb;

import com.inherit.chap03.test01.aaa.AAA;

public class Mtest {

	public static void main(String[] args) {
		BBB b1 = new BBB();
		b1.setAbc(10);  //��Ӌ����� AAA�� �ִ°� BBB�� ��� ����
		b1.setB(20);
		System.out.println(b1.getAbc() + " + " + b1.getB() + " = " + b1.getSum());
		b1.prn();
		
		BBB b2 = new BBB(3);  //AAA�� �ִ� �����ڶ� BBB�����ڸ� �Ѱ��� ��Ƶа�
		System.out.println(b2.getAbc() + " + " + b2.getB() + " = " + b2.getSum());
	
		BBB b3 = new BBB(5,6);
		System.out.println(b3.getAbc() + " + " + b3.getB() + " = " + b3.getSum());
	
		AAA a1 = new AAA();
		AAA a2 = new BBB(); //�پ缺 �θ�ϱ� �ڽĵ��� ���� �پ��ϰ� �޴´�
		a1.prn();
		a2.prn();
	}	
}
