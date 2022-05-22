package com.silsub2.point.main;

import com.silsub2.point.model.vo.Circle;
import com.silsub2.point.model.vo.Rectangle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle(1,2,3);
		Rectangle r1 = new Rectangle(1,2,3,4);
		
		System.out.println(c1.draw());
		System.out.println(r1.draw());
	}

}
