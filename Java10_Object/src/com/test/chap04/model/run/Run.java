package com.test.chap04.model.run;

import java.util.Date;

import com.test.chap04.model.dto.User;

public class Run {

	public static void main(String[] args) {
		//�⺻�����ڷ� ��ü ����
		User u1 = new User();
		u1.information();
		
		//�Ű������ִ� �����ڷ� ��ü ����
		User u2 = new User("user01","pass01", "������");
		u2.information();
		
		User u3 = new User("user02","pass02","������",new Date());
		u3.information();
	}

}
