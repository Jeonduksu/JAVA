package com.silsub2.point.model.vo;

public class Circle extends Point{
	private int radius;
	
	public Circle () {}

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String draw() {
		return super.draw() + ", " +(Math.round(Math.PI*1)/1.0) * radius * radius + "," + 2 * (Math.round(Math.PI*10)/10.0) * radius ; 
	}
	
	
}
