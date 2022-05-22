package com.test.chap01;

public class Main {

	public static void main(String[] args) {
		//Account 타입의 객체 주소값만 들어갈 수 있다.
		//클래스에 저장된 객체 (이름,계좌번호,비밀번호)
		Account my = new Account();
		Account your = new Account();
		//현재 잔액 조회
		my.display();
		
		//입금
		my.in(100);
		my.display();
		your.display();
		
		my.in(150);
		my.display();
		
		//출금
		my.out(50);
		my.display();
		
		//my.balance -= 200;
		
		my.out(50);
		my.display();
	}

}
