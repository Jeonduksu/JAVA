package com.silsub1.objArr.run;

import com.silsub1.objArr.model.vo.Student;


public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student test1 = new Student(3, 1, 1,"È«±æµ¿");
		Student test2 = new Student(4, 3, 2, "À¯°ü¼ø");
		Student test3 = new Student(2, 7, 5, "À±ºÀ±æ");
		
		Student[] atArr = new Student[3];
		atArr[0] = test1;
		atArr[1] = test2;
		atArr[2] = test3;
		
		for(int i=0; i<atArr.length; i++) {
			System.out.println(atArr[i].information());
		}
		
	}

}
