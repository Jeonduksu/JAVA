package com.inherit.chap02.override;

public class Book {
	
	private String title;
	private String writer;
	private int price;
	
	public Book() {
		//super() 생략
	}
	
	//super()는 부모호출 인데 여기서 부모가 없으므로 자동으로 object가 된다
	public Book(String title, String writer, int price) {
		super();
		this.title = title;
		this.writer = writer;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return title + "," + writer + "," + price;
	}
	
	//오버라이딩으로 인한 메소드
	//매개변수에 변수명은 달라도된다
	//그안에 내용들을 비교한다
	//매개변수 안에 있는건 b4 이다
	//객체의 주소가 같으면 같은 객체
	//this == b1 obj == b4
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		//전달받은 객체가 null
		if(obj == null) {
			return false;
		}
		//필드값 비교( 다른경우)
		//other = b4
		//obj = b4
		//title = b1
		Book other = (Book)obj; 
		//title 비교
		if(title==null) {
			if(other.title !=null) {
				return false;
			}
			//두 객체의 title값이 서로 다르면 false 리턴
		}else if(!title.equals(other.title)) {
			return false;
		}
		//writer 비교
		if(writer == null) {
			if(other.writer != null) {
				return false;
			}
		}else if(!writer.equals(other.writer)) {
			return false;
		}
		//price 비교
		if(price != other.price) {
			return false;
		}
		//모든 조건 통과하면 두 객체는 같은 객체
		return true ;
	}
	
	@Override
	public int hashCode() {
		return(writer + price + title).hashCode();
	}
	
	
	
}
