package com.test.chap03.test01;

public class KindOfvariable2 {
	//�Ķ����� ���� ���� 
	//private���� �ٲ��� ������ü�� �����ѵ� �̿������� ���Ѵ�
	public static int staticNum;
	
	public static final int STATIC_NUM=1;
	//public ���������ڿ� static+final Ű���带 �Բ� ����ϴ� ����
	//'����ʵ�'
	//����� ���ÿ� �ʱ�ȭ�� �Ǿ�� �Ѵ�
	
	//�빮�ڷ� ������ ���Ѵ�
	public final static int STATIC_NUM2=1;
	
	
	public void methodTest() {
		//static �ʱ�ȭ�� {} �ʱ�ȭ ���� ���� ����
		//static int localStaticNum;
		
	}
	public static void staticMethodTest() {
		//���������� Stack�� ����ȴ�
		//�������������� static ���Ұ�
		//static int localStaticNum;
	}
}
