package com.test.chap03.test01;

public class KindOfVariable { //Ŭ���� ������ ����
	//Ŭ���� ������ �ۼ��ϴ� ���� => �ʵ�
	// �ʵ� == �������(Ŭ������ ������ ������ �ǹ�) == ��������(Ŭ���� �������� ����� �� �ִ� ������� �ǹ�)
	private int globalNum;
	
	
	//�Ű������� ���� �ʱ�ȭ �� �ʿ䰡 ����.
	//ȣ�� �� �� ���� ������ �����ش�.
	public void testMethod(int num) {//�޼ҵ� ������ ����
		//�޼ҵ� ������ �ۼ��ϴ� ���� => ��������
		//�޼ҵ� ��ȣ �ȿ� �����ϴ� ���� => �Ű�����
		int localNum;
		
		//�������� ���� �ܿ� ����ϱ� ���ؼ��� �ݵ�� �ʱ�ȭ �Ǿ�� �Ѵ�.
		//�ʱ�ȭ ���� ���� �������� ������� ���Ѵ�
		//System.out.println(localNum);
		
		System.out.println(num);
		
		System.out.println(globalNum);
		//
		
	}//�޼ҵ� ������ ��
	
	public void testMethod2() {
		System.out.println(globalNum);
		//System.out.println(localNum);
		//�̰Ŵ� �������� �� ������� ���Ѵ�.
	}
}//Ŭ���� ������ ��
