package com.test01;

import java.util.Scanner;

public class ifTest01 {
	public void testIf() {
		//�ܵ� if��
		//���ǽ��� ����� ���̸� { }�ȿ� �ڵ� ����
		//       ����� �����̸� { }�ȿ� �ڵ� ���� �Ѿư�
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Ѱ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		//¦������ ���� Ȯ��
		if(num % 2 == 0) {
			//������ ���ϰ��
			System.out.println("�Է��Ͻ� ���ڴ� ¦���Դϴ�.");
			
		}
		//¦���� �ƴ��� ������ Ȯ��
		//"�Է��Ͻ� ���ڴ� Ȧ���Դϴ�" ��� ���
		if(num % 2 != 0) {
			System.out.println("�Է��Ͻ� ���ڴ� Ȧ���Դϴ�");
		}
		System.out.println("���α׷� ����");
		
		
		
	}
}
