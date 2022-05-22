package com.test.chap03.test02;

public class Mtest {
	public static void main(String[] args) {
		InitBlock p = new InitBlock("È«¹Ì5",100,"»þ¿À¹Ì");
		//Å¬·¡½º¸í º¯¼ö¸í = new(°´Ã¼) Å¬·¡½º¸í(
		p.setName("È«¹Ì6");
		String pName = p.getName();
		
		
		p.information();
	}

}
