package com.silsub1;

import java.util.Scanner;

public class Munjae {
	public void test1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� : ");
		int a = sc.nextInt();
		
		System.out.println("���� : ");
		int b = sc.nextInt();
		
		System.out.println("���� : ");
		int c = sc.nextInt();
		
		int s = a+b+c;
		int f = a+b+c/3;
		
		if(a>=40 && b>= 40 && c>= 40 && f>=60) {
			System.out.println("����" + a + "����" + b + "����" + c + "�հ�" + s + "���" + f);			
		}else {
			System.out.println("���հ�");
		}
	}
    public void test2() {
    	Scanner sc = new Scanner (System.in);
    	System.out.println("*** �ʱ� �޴� ***");
    	System.out.println("1.�Է�");
    	System.out.println("2.����");
    	System.out.println("3.��ȸ");
    	System.out.println("4.����");
    	System.out.println("7.����");
    	System.out.println("�޴���ȣ �Է� : ");
    	int a = sc.nextInt();
    	
    	switch(a) {
    	case 1 : 
    		System.out.println("�Է¸޴��� ���õǾ����ϴ�.");
    		break;
    	case 2 :
    		System.out.println("�����޴��� ���õǾ����ϴ�.");
    		break;
    	case 3 :
    		System.out.println("��ȸ�޴��� ���õǾ����ϴ�.");
    		break;
    	case 4 :
    		System.out.println("�����޴��� ���õǾ����ϴ�.");
    		break;
    	case 7 : 
    		System.out.println("���α׷��� ����˴ϴ�.");
    		break;
    		default : 
    			System.out.printf("��ȣ�� �߸� �ԷµǾ����ϴ�.\n �ٽ� �Է��Ͻʽÿ�");
    	}
    }
    public void test3() {
    	Scanner sc = new Scanner (System.in);
    	
    	System.out.println("���� �ϳ� �Է� : ");
    	int a = sc.nextInt();
    	
    	if(a>=0) {
    		System.out.println("�����");
    	}else {
    		System.out.println("����� �ƴϴ�");
    	}
    }
    public void test4() {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("���� �ϳ� �Է� : ");
    	int a = sc.nextInt();
    	
    	if(a > 0) {
    		String sr = (a % 2 ==0)?"¦����":"Ȧ����";
    		System.out.println(sr);
    	}else {
    		System.out.println("�߸��� �����̴�");
    	}
    }
    public void inputTest() {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("�̸� : ");
    	String name = sc.nextLine();
    	
    	System.out.println("���� : ");
    	int a = sc.nextInt();
    	
    	System.out.println("Ű : ");
    	double b = sc.nextDouble();
    	
    	if(a>=0 && b>=0) {
    		if(name != null && name.length()>0) {
    			System.out.println("Ȯ�� : " + name + "��" + "���̴�" + a + "���̰�," + "Ű��" + b + "cm �̴�");
    		}else {
    			System.out.println("�߸��� �Է��Դϴ�");
    		}
    	}
    	//���� Ǯ��
    	//if(name != null && name.length()>0 && age >0 && heigth>0) {
    	//
    }
    public void test6() {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("ù��° ���� : ");
    	int a = sc.nextInt();
    	
    	System.out.println("�ι�° ���� : ");
    	int b = sc.nextInt();
    	
    	int s = a + b;
    	int c = a - b;
    	int x = a * b;
    	int y = a / b;
    	int z = a % b;
    	if(a>0 && b>0) {
    		System.out.printf("%d + %d = %d\n",a,b,s);
    		System.out.printf("%d - %d = %d\n",a,b,c);
    		System.out.printf("%d * %d = %d\n",a,b,x);
    		System.out.printf("%d / %d = %d\n",a,b,y);
    		System.out.printf("%d %% %d = %d\n",a,b,z);
    	}else {
    		System.out.println("���ڸ� �ٽ� �Է����ֽʽÿ�.");
    	}
    }
    public void test7() {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("���� �Է� : ");
    	int a = sc.nextInt();
    	
    	String c = "";
    	
    	if(a >= 0) {
    		if(a >= 90) {
    			c="A";
    		}else if(a >= 80) {
    			c="B";
    		}else if(a >= 70) {
    			c="C";
    		}else if(a >= 60) {
    			c="D";
    		}else {
    			c="F";
    		}
    	}System.out.println("������ " + a + "������ " + c + "����Դϴ�.");
    }

}
