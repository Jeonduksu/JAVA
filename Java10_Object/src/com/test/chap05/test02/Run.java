package com.test.chap05.test02;

public class Run {

	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
		
		//1)�Ű������� ��ȯ�� ���� �޼ҵ� ȣ��
		mt.method1();
		
		//2)�Ű������� ������ ��ȯ���� �ִ� �޼ҵ� ȣ��
		String str = mt.method2();
		System.out.println(str);
		
		//�̷��� ����ص� �ȴ�
		System.out.println(mt.method2());
		
		//3)�ް������� ������ ��ȯ���� ���� �޼ҵ� ȣ��
		mt.method3(10, 20);
		
		//4)�Ű������� ��ȯ�� �ִ� �޼ҵ� ȣ��
		int result = mt.method4(30, 40);
		System.out.println(result);
	}

}
