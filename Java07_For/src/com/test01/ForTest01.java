package com.test01;

import java.util.Scanner;

public class ForTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ForTest01.testFor();
		//ForTest01.testFor2();
		ForTest01.testFor6();
	}
	public static void testFor() {
		//0~10 ���
		//for(�ʱ��;���ǽ�;������)
		for(int i=0; i<=10 ; i++) {
			System.out.println("i = " + i);
		}
	}
	public static void testFor2() {
		//����
		for(int i =100; i > 0; i--) {
			System.out.println(i + " ");
            if(i%10 ==1) {
				System.out.println();
			}
		}
	}	
	public static void testFor3() {
		//for���� whileó��
		int i =1;
		for( ; ;) {
			System.out.println(i+ " ");
			i++;
			if(i==10) {
				break;
			}
		}
	}
	public static void testFor4 () {
		//�����ϳ��� �Է¹޾� �� ���� ����϶��� �� ���� �������� ���
		//����� �ƴϸ� "�ݵ�� 1~9 ������ ����� �Է� " ���
		//for�� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �ϳ� �Է� : ");
		int no = sc.nextInt();
		
		if(no>=1 && no<=9) {
			//������ ���
			for(int i=1; i<=9; i++) {
				System.out.println(no + "*" + i + "=" + (no*i));
			}
		}else {
			System.out.println("�ݵ�� 1~9 ������ ����� �Է�");
		}
	}
    public static void testFor5 () {
    	//1~100������ ������ ���ϰ�
    	// 1���� ���� ���������� ���� ���
    	//Math.random() �� �������� double�� ������ �����´� �׷��� 100�� ���ϰԵǰ�
    	//0~99���� �ۿ� �ȳ��ͼ� 0~100���� �ϱ� ���� +1 �ϰԵȴ�
    	//�տ�(int)�� ��������ȯ�̴�
    	int random = (int)(Math.random()*100) +1;
    	
    	int sum = 0;
    	
    	for(int i =1; i<=random; i++) {
    		sum += i;
    	}
    	System.out.println("1���� " + random + " ������ �հ� : " + sum);
    }
    public static void testFor6 () {
    	//Ű����� ���� �ΰ� �Է�
    	//������ ~ ū�� ������ ��
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("���� 1���� �Է� : ");
    	int a = sc.nextInt();
    	
    	System.out.println("���� 2���� �Է� : ");
    	int b = sc.nextInt();
    	
    	int sum = 0, min=0, max=0;
    	
    	if(a > b) {
    		max = a;
    		min = b;
    	}else {
    		max = b;
    		min = a;
    	}
    	for(int i = min; i <= max; i++) {
    		sum += i;
    	}System.out.println("�ִ� : " + max + "�ּڰ� : " + min + "�հ� : " + sum);
    	/*if(a > b) {
    	    	for(int i= 1; i>a && b>i; i++) {
    			sum += i;
    		}else if(b > a){
    			for(int i = 1; a>i && i>b i++) {
    			sum += i;
    			}
    		}
    	}System.out.println();
    	*/
    }
}
