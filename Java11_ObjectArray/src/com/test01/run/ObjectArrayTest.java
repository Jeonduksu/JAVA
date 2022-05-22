package com.test01.run;

import java.util.Scanner;

import com.test01.model.dto.Book;

public class ObjectArrayTest {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		//Book[] bk = new Book[3];
		
		//bk[0] = new Book("이것이 자바다","신용권","한빛미디어",30000);
		//bk[1] = new Book("HTML5 웹 프로그래밍 입문","윤인성","한빛아카데미",26000);
		//bk[2] = new Book("자바 웹을 다루는 기술","이병승","길벗",35000);
		
		Book[] bk = {
				 new Book("이것이 자바다","신용권","한빛미디어",30000),
				 new Book("HTML5 웹 프로그래밍 입문","윤인성","한빛아카데미",26000),
				 new Book("자바 웹을 다루는 기술","이병승","길벗",35000)
		};
		
		/*
		System.out.println(bk);     			//Book[] 주소값
		System.out.println(bk[0]);				//Book 주소값
		System.out.println(bk[0].getPrice());   //int
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("책의 제목을 입력하시오 : ");
		String Title = sc.nextLine();
		
		for(int i=0; i<bk.length; i++) {
			System.out.println(bk[i]);
			if(bk[i].getTitle().equals(Title)) {
				System.out.println(bk[i].information());
			}
		}
	}

}
