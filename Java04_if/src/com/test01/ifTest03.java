package com.test01;

import java.util.Scanner;

public class ifTest03 {
	//else if 구믄은 다중 조건을 줄 수 있다.
	
	public void test() {
		int i = 10;
		int j = 20;
		
		if(i > j) {
			System.out.println(i + " 은" + j + " 보다 큽니다.");
		}else if(i == j){
			System.out.println(i + "은" + j + " 와 같습니다.");
		}else if(i < j) {
			System.out.println(i + "은" + j + "보다 작습니다.");
		}
	}
	public void test2() {
		//점수를 하나 입력받아 등급을 나누어 점수와 등급을 출력
		//등급은, 90점 이상은 A등급
		//90 미만 80 이상 B
		//80 미만 70 이상 C
		//70 미만 60 이상 D
		//60 미만 F
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 입력 : ");
		int a = sc.nextInt();
		
		if(a >= 90) {
			System.out.println("A등급");
		}else if(a<90 && a>=80) {
			System.out.println("B등급");
		}else if(a<80 && a>=70) {
			System.out.println("C등급");
		}else if(a<70 && a>=60) {
			System.out.println("D등급");
		}else if(a<60) {
			System.out.println("F등급");
		}
		
		
	}
    public void test3() {
    	//위의 문제에 각 등급별 중간 정수 이상인 경우에는
    	//등급에 "+"라는 문자를 추가하여 출력
    	//예)95점 이상이면 등급이 A+출력
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("점수 입력 : ");
    	int point = sc.nextInt();
    	
    	String grade = "";
    	
    	if(point >= 90) {
    		grade = "A";
    		if(point>=95) {
    			grade += "+";
    		}
    	}else if(point >= 80) {
    		grade = "B";
    		if(point>=85) {
    			grade += "+";
    		}
    	}else if(point >= 70) {
    		grade = "C";
    		if(point>=75) {
    			grade += "+";
    		}
    	}else if(point >= 60) {
    		grade = "D";
    		if(point>=65) {
    			grade +="+";
    		}
    	}else {
    		grade = "F";
    	}
    	
    	System.out.printf("당신의 점수는 %d 이고, 등급은 %입니다.",point,grade);
    }


}
