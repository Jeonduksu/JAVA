package com.test.chap01;

public class Main {

	public static void main(String[] args) {
		//Account Ÿ���� ��ü �ּҰ��� �� �� �ִ�.
		//Ŭ������ ����� ��ü (�̸�,���¹�ȣ,��й�ȣ)
		Account my = new Account();
		Account your = new Account();
		//���� �ܾ� ��ȸ
		my.display();
		
		//�Ա�
		my.in(100);
		my.display();
		your.display();
		
		my.in(150);
		my.display();
		
		//���
		my.out(50);
		my.display();
		
		//my.balance -= 200;
		
		my.out(50);
		my.display();
	}

}
