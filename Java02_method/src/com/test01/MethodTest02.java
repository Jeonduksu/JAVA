package com.test01;

public class MethodTest02 {

	public static void main(String[] args) {
		// static : calss.method();
		MethodTest01.publicMethod();
		MethodTest01.protectedMethod();
		MethodTest01.defaultMethod();
		//MethodeTest01.privateMethod();
		
		//non static : class 변수명 = new class();
		//변수명.method()
		MethodTest01 test = new MethodTest01();
		test.NonstaticMethod();
	}

}

