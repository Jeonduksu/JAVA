package com.test.chap03.test02;

public class Mtest {
	public static void main(String[] args) {
		InitBlock p = new InitBlock("ȫ��5",100,"������");
		//Ŭ������ ������ = new(��ü) Ŭ������(
		p.setName("ȫ��6");
		String pName = p.getName();
		
		
		p.information();
	}

}
