package com.test.chap03.test02;

public class InitBlock {
	//선언과 동시에 초기화
	private String name="아이폰";
	private int price=200;
	private static String brand="애플";
	
	//이런식으로도 초기화가 가능하다
	//기본 초기화
	{
		name="갤럭시";
		price = 300;
		brand = "삼성";
		System.out.println("초기화 블럭");
	}	
	//static은 돌아가면서 초기화
	//static이 있으면 초기화 가능
	
	static {
		//name="베가";
		brand="LG";
	}
	//생성자
	//public 클래스명() {}
	//매개변수가 없는 생성자
	public InitBlock () {}
	//매개변수 있는 생성자
	public InitBlock (String name,int price, String brand) {
		this.name = name;
		this.price = price;
		InitBlock.brand = brand;
	}
	
	public void information() {
		System.out.println(name + "," + price + "," + brand);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
}
