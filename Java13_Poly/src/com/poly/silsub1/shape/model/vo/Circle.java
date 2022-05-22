package com.poly.silsub1.shape.model.vo;

public class Circle extends Shape{
	private double radius;
	
	public static final double PI = 3.14;
	
	public Circle() {}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public static double getPi() {
		return PI;
	}
	
	@Override
	public double area() {
		double area = radius * radius * PI;
		return area;
	}

	@Override
	public double perimeter() {
		return (radius*2)*PI;
	}

}
