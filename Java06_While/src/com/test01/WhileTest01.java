package com.test01;

import java.util.Scanner;

public class WhileTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WhileTest01 wt = new WhileTest01();
			wt.testWhile4_1();
		
	}
	public void testWhile() {
		//�ʱ��
		//0���� ����
		int i = 0;
		
		//0,1,2,3,4,5,6,7 �� 8�� �ݺ�
		while(i<8) {
			System.out.println((i+1) + "���� �ݺ��� ������..");
			
			i++;
		}
		
		System.out.println("While�� ����� ���� i �� �� : " + i);
		}
	public void testWhile2() {
		//���ڿ��� �Է¹޾� �ε������� ����(char)�� �������
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڿ� �Է� : ");
		String str = sc.next();
		
		int index = 0;
		while(index < str.length()) {
			char ch = str.charAt(index);
			System.out.println(index+ " : " + ch);
			index++;
			
		}
		
		//���� �ߴ� ����
		/*while(ch<str) {
			System.out.println("���� ��� : ");
			ch++;
		}*/
		
	}
	public void testWhile3() {
		//1���� �Է¹��� �� ������ ���� ������
		
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�Է��Ͻÿ� : ");
		int num = sc.nextInt();
		
		int i = 1;
		
		while(i <= num) {
			//System.out.println("���ϱ� : " + sum);
			//sum++;
			sum += i; //sum = sum + i
			i++;
			
		}
		System.out.println("1���� " +  num + "������ ����" + sum + "�Դϴ�");
	}
    public void testWhile4() {
    	int i = 1;
    	while(i<10) {
    		System.out.println(i);
    		i++;
    		
    		if(i==10) {
    			break;
    		}
    	}
    }
    public void testWhile4_1() {
    	//Ű����� ������ �Է¹޴´�.
    	//�Է¹��� ���ڰ� 4�̸� while�� ����.
    	Scanner sc = new Scanner(System.in);
    	
    	//System.out.println("���� �Է� : ");
    	//int num = sc.nextInt();
    	 
    	while(true) {
    		System.out.println("���� �Է� :");
    		int i = sc.nextInt();
    		
    		if(i == 4) {
    			System.out.println("4�� �ԷµǾ���.����");
    			break;
    		}
    	}
    	/*while(i <= 5) {
    		System.out.println(i);
    		i++;
    		
    		if(num == 4) {
    			break;
    		}
    	}*/
    	
    	/*if(num != 4) {
    		while(a < 10) {
    			System.out.println(a);
    			a++;
    		}if(num == 4){
    			System.out.println("�ý�������");
    		}
    	}*/
    	
    }
}
