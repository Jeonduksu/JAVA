package com.test01.model.dto;

public class Book {
	// ��ü �迭
	// �ʵ�
	private String title;
	private String author;
	private String publisher;
	private int price;

	// ������(�⺻, �Ű�����)
	public Book() {
	}

	public Book(String title, String author, String publisher, int price) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}

	// getter & setter
	// return this.title�� ���� �߿� this�� �ٿ����ǰ� �Ⱥٿ����ȴ�
	// get�ϰ� ������ ��ù���ڴ� �빮�ڷ� ��� !
	// get
	public String getTitle() {
		return title;
	}

	// set
	// return�� �����ʴ´�.
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
