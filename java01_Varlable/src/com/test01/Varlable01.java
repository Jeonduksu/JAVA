package com.test01;

public class Varlable01 {
    //Ÿ��  ������;
	//������ = ��;
	//Ÿ�� ������ = ��;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Varlable01 test = new Varlable01(); //��������
		//�غ�
		//Ŭ������ ������ = new Ŭ������();
		
		test.declareVarlable();
		
		test.initVarlable();
		//������.�޼ҵ��();
		//����
		
		
	}
	public void declareVarlable() {
		//������
		//������
		byte bnum;
		short snum;
		int inum;
		long lnum;
		
		//�Ǽ���
		float fnum;
		double dnum;
		
		//����
		char ch;
		
		//��
		boolean isTrue;
		
		//���ڿ�(������)
		String str;
		
		bnum = 1;
		snum = 2;
		inum = 4;
		lnum = 8L;
		
		fnum = 4.0f;
		dnum = 8.0;
		
		ch = 'A';
		str = "A";
		
		isTrue = false;
		
		//������ ����� �� ����ϱ�
		System.out.println("bnum�� ��: " + bnum);
		System.out.println("snum�� ��: " + snum);
		System.out.println("inum�� ��: " + inum);
		System.out.println("lnum�� ��: " + lnum);
		System.out.println("fnum�� ��: " + fnum);
		System.out.println("dnum�� ��: " + dnum);
		System.out.println("ch�� ��: " + ch);
		System.out.println("str�� ��: " + str);
		System.out.println("isTrue�� ��: " + isTrue);
	}
	public void initVarlable() {	
		//����� ���ÿ� �ʱ�ȭ
		int inum = 4;
		double dnum = 8.0;
		char ch = 'A';
		String str = "�ȳ��ϼ���";
		
		System.out.println(inum);
		System.out.println(dnum);
		System.out.println(ch);
		System.out.println(str);
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}