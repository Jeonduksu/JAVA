package com.silsub1;

import java.util.Scanner;

public class Munjae {
	public void test1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 : ");
		int a = sc.nextInt();
		
		System.out.println("영어 : ");
		int b = sc.nextInt();
		
		System.out.println("수학 : ");
		int c = sc.nextInt();
		
		int s = a+b+c;
		int f = a+b+c/3;
		
		if(a>=40 && b>= 40 && c>= 40 && f>=60) {
			System.out.println("국어" + a + "영어" + b + "수학" + c + "합계" + s + "평균" + f);			
		}else {
			System.out.println("불합격");
		}
	}
    public void test2() {
    	Scanner sc = new Scanner (System.in);
    	System.out.println("*** 초기 메뉴 ***");
    	System.out.println("1.입력");
    	System.out.println("2.수정");
    	System.out.println("3.조회");
    	System.out.println("4.삭제");
    	System.out.println("7.종료");
    	System.out.println("메뉴번호 입력 : ");
    	int a = sc.nextInt();
    	
    	switch(a) {
    	case 1 : 
    		System.out.println("입력메뉴가 선택되었습니다.");
    		break;
    	case 2 :
    		System.out.println("수정메뉴가 선택되었습니다.");
    		break;
    	case 3 :
    		System.out.println("조회메뉴가 선택되었습니다.");
    		break;
    	case 4 :
    		System.out.println("삭제메뉴가 선택되었습니다.");
    		break;
    	case 7 : 
    		System.out.println("프로그램이 종료됩니다.");
    		break;
    		default : 
    			System.out.printf("번호가 잘못 입력되었습니다.\n 다시 입력하십시오");
    	}
    }
    public void test3() {
    	Scanner sc = new Scanner (System.in);
    	
    	System.out.println("정수 하나 입력 : ");
    	int a = sc.nextInt();
    	
    	if(a>=0) {
    		System.out.println("양수다");
    	}else {
    		System.out.println("양수가 아니다");
    	}
    }
    public void test4() {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("정수 하나 입력 : ");
    	int a = sc.nextInt();
    	
    	if(a > 0) {
    		String sr = (a % 2 ==0)?"짝수다":"홀수다";
    		System.out.println(sr);
    	}else {
    		System.out.println("잘못된 숫자이다");
    	}
    }
    public void inputTest() {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("이름 : ");
    	String name = sc.nextLine();
    	
    	System.out.println("나이 : ");
    	int a = sc.nextInt();
    	
    	System.out.println("키 : ");
    	double b = sc.nextDouble();
    	
    	if(a>=0 && b>=0) {
    		if(name != null && name.length()>0) {
    			System.out.println("확인 : " + name + "의" + "나이는" + a + "세이고," + "키는" + b + "cm 이다");
    		}else {
    			System.out.println("잘못된 입력입니다");
    		}
    	}
    	//강사 풀이
    	//if(name != null && name.length()>0 && age >0 && heigth>0) {
    	//
    }
    public void test6() {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("첫번째 정수 : ");
    	int a = sc.nextInt();
    	
    	System.out.println("두번째 정수 : ");
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
    		System.out.println("숫자를 다시 입력해주십시오.");
    	}
    }
    public void test7() {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("점수 입력 : ");
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
    	}System.out.println("점수는 " + a + "학점은 " + c + "등급입니다.");
    }

}
