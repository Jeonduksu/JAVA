package com.test01.model.dto;

public class Book {
	// 객체 배열
	// 필드
	private String title;
	private String author;
	private String publisher;
	private int price;

	// 생성자(기본, 매개변수)
	public Book() {
	}

	public Book(String title, String author, String publisher, int price) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}

	// getter & setter
	// return this.title이 문장 중에 this를 붙여도되고 안붙여도된다
	// get하고 변수명 맨첫문자는 대문자로 사용 !
	// get
	public String getTitle() {
		return title;
	}

	// set
	// return를 쓰지않는다.
	public void setTitle(String title) {
		this.title = title;
	}

	public String getAutor() {
		return author;
	}

	public void setAutor() {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher() {
		this.publisher = publisher;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String information() {
		return "title = " + title + ", author = " + author + ",publisher =" 
					+ publisher + ", price" + price;
	}
}
