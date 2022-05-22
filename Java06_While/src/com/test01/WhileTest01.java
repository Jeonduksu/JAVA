package com.test01;

import java.util.Scanner;

public class WhileTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WhileTest01 wt = new WhileTest01();
			wt.testWhile4_1();
		
	}
	public void testWhile() {
		//초기식
		//0부터 시작
		int i = 0;
		
		//0,1,2,3,4,5,6,7 총 8번 반복
		while(i<8) {
			System.out.println((i+1) + "번쨰 반복문 수행중..");
			
			i++;
		}
		
		System.out.println("While이 종료된 후의 i 의 값 : " + i);
		}
	public void testWhile2() {
		//문자열을 입력받아 인덱스별로 문자(char)를 출력하자
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열 입력 : ");
		String str = sc.next();
		
		int index = 0;
		while(index < str.length()) {
			char ch = str.charAt(index);
			System.out.println(index+ " : " + ch);
			index++;
			
		}
		
		//내가 했던 내용
		/*while(ch<str) {
			System.out.println("문자 출력 : ");
			ch++;
		}*/
		
	}
	public void testWhile3() {
		//1부터 입력받은 수 까지의 합을 구하자
		
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력하시오 : ");
		int num = sc.nextInt();
		
		int i = 1;
		
		while(i <= num) {
			//System.out.println("더하기 : " + sum);
			//sum++;
			sum += i; //sum = sum + i
			i++;
			
		}
		System.out.println("1부터 " +  num + "까지의 합은" + sum + "입니다");
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
    	//키보드로 정수를 입력받는다.
    	//입력받은 숫자가 4이면 while문 종료.
    	Scanner sc = new Scanner(System.in);
    	
    	//System.out.println("정수 입력 : ");
    	//int num = sc.nextInt();
    	 
    	while(true) {
    		System.out.println("숫자 입력 :");
    		int i = sc.nextInt();
    		
    		if(i == 4) {
    			System.out.println("4가 입력되었다.종료");
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
    			System.out.println("시스템종료");
    		}
    	}*/
    	
    }
}
