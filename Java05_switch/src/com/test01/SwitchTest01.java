package com.test01;

import java.util.Scanner;

public class SwitchTest01 {
	//Switch
	//���ǽ��� ���� ���� case���� ã�� ������ ����
	//brack�� ������ ��� ����
	public void test() {
		int i = 2;
		
		//case ������ ����̾���
		//break���� �־�� case�� �����
		//�ǵ�ġ�ʰ� break ���� ������ ��ӽ���Ǵ� ����
		
		switch(i) {
		case 1: 
			System.out.println("1�Դϴ�!");
			break;
		case 2:
			System.out.println("2�Դϴ�!!");
			break;
		case 3:
			System.out.println("3�Դϴ�!!!");
			break;
		default :
			System.out.println("1,2,3, ��� �ƴմϴ�.");		
		}
		
		
		char ch = 'a';
		switch(ch) {
		case 'a' :
			System.out.println("a!!");
			break;
		case 'b' :
			System.out.println("b!!");
			break;
		case 'c' :
			System.out.println("c!!!!!!!!!");
			break;
		default :
			System.out.println("no!!");
			
		}
		
		
		String s = "��";
		switch(s) {
		case"��" :
			System.out.println("���̴�");
			break;
		case"��" :
			System.out.println("���̴�");
			break;
		case"����" :
			System.out.println("�����");
			break;
		default :
			System.out.println("��");
				
		}
		
		//����
		//¦���� ����
		int no = 2;
		
		switch(no) {
		case 1:
		case 3:
			System.out.println("Ȧ���Դϴ�.");
			break;
		case 2:
		case 4:
			System.out.println("¦���Դϴ�.");
			break;
		default:
			System.out.println("�ٸ�����!");
		}
		
		
		
		
	}
	
	public void test2() {
		//Ű����� ���� �ϳ� �Է�
		//�������� 12,1,2 => �ܿ�
		//       3,4,5 => ��
		//       6,7,8 => ����
		//       9,10,11 ==>����
		//switch�̿��Ͽ� �ۼ�
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Է� : ");
		int a = sc.nextInt();
		
		switch(a) {
		case 1 :
		case 2 :
		case 12 :
			System.out.println("�ܿ�");
			break;
		case 3 :
		case 4 :
		case 5 :
			System.out.println("��");
			break;
		case 6 :
		case 7 :
		case 8 :
			System.out.println("����");
			break;
		case 9 :
		case 10 :
		case 11 :
			System.out.println("����");
			break;
		default :
				System.out.println("������ �ƴϴ�");
			
		}
		
		
		
	}
    public void test3() {
    	//���� �ΰ��� �����ȣ(+,-,*,/) 1���� �Է¹޾�,
    	//�����ȣ�� �ش��ϴ� ����� �����ϰ� ���
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("���� �Է� : ");
    	int a = sc.nextInt();
    	
    	System.out.println("���� �Է� : ");
    	int b = sc.nextInt();
    	
    	System.out.println("���� ��ȣ �Է� : ");
    	char o = sc.next().charAt(0);
    	
    	
    	int res = 0;
    	
    	switch(o) {
    	case '+':
    		res = a + b;
    		break;
    	case '-':
    		res = a - b;
    		break;
    	case '*':
    		res = a * b;
    		break;
    	case '/':
    		res = a / b;
    		break;
    	}
    	
    	System.out.println(a + " " + o + " " + b + " = " + res );
    	
    	
    	
    	
    }


}