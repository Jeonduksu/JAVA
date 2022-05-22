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
		//0~10 출력
		//for(초기식;조건식;증감식)
		for(int i=0; i<=10 ; i++) {
			System.out.println("i = " + i);
		}
	}
	public static void testFor2() {
		//역순
		for(int i =100; i > 0; i--) {
			System.out.println(i + " ");
            if(i%10 ==1) {
				System.out.println();
			}
		}
	}	
	public static void testFor3() {
		//for문을 while처럼
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
		//정수하나를 입력받아 그 수가 양수일때만 그 수의 구구단을 출력
		//양수가 아니면 "반드시 1~9 사이의 양수를 입력 " 출력
		//for문 사용
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 하나 입력 : ");
		int no = sc.nextInt();
		
		if(no>=1 && no<=9) {
			//구구단 출력
			for(int i=1; i<=9; i++) {
				System.out.println(no + "*" + i + "=" + (no*i));
			}
		}else {
			System.out.println("반드시 1~9 사이의 양수를 입력");
		}
	}
    public static void testFor5 () {
    	//1~100사이의 난수를 구하고
    	// 1부터 구한 난수까지의 합을 출력
    	//Math.random() 만 가져오면 double의 변수가 가져온다 그래서 100을 곱하게되고
    	//0~99까지 밖에 안나와서 0~100까지 하기 위해 +1 하게된다
    	//앞에(int)는 강제형변환이다
    	int random = (int)(Math.random()*100) +1;
    	
    	int sum = 0;
    	
    	for(int i =1; i<=random; i++) {
    		sum += i;
    	}
    	System.out.println("1부터 " + random + " 까지의 합계 : " + sum);
    }
    public static void testFor6 () {
    	//키보드로 정수 두개 입력
    	//작은수 ~ 큰수 까지의 합
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("정수 1번쨰 입력 : ");
    	int a = sc.nextInt();
    	
    	System.out.println("정수 2번쨰 입력 : ");
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
    	}System.out.println("최댓값 : " + max + "최솟값 : " + min + "합계 : " + sum);
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
