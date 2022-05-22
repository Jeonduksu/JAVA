package com.collection.silsub1.model.dao;

import java.util.ArrayList;

import com.collection.silsub1.model.comparator.AscCategory;
import com.collection.silsub1.model.dto.Book;

public class BookDao {
	private ArrayList<Book> bookList;
	
	public BookDao() {
		bookList = new ArrayList<Book>();
	}
	public BookDao(ArrayList<Book> list) {
		bookList = list;
	}
	
	//마지막 도서 번호 리턴
	//인덱스번호 -1이란거 이해!!
	public int getLastBookNo() {
		//size()-1 마지막 객체를 가져온다!
		return bookList.get(bookList.size()-1).getbNo();
	}
	//새 도서 추가
	public void addBook(Book book) {
		bookList.add(book);
	}
	public int deleteBook(int no) {
		int res = 0;
		for(int i=0; i<bookList.size(); i++) {
			if(bookList.get(i).getbNo() == no) {
				bookList.remove(i);
				res=1;    //삭제를 성공했을땐 1를 출력
			}
		}
		return res;
	}
	public int searchBook(String title) {
		int index = -1; 	//기본세팅
		for(int i=0; i<bookList.size(); i++) {
			if(bookList.get(i).getTitle().contains(title)) {
				index=i;
				break;
			}
		}
		return index;
	}
	//해당 인덱스 값을 이용한 book 객체 리턴
	public Book selectBook(int index) {
		return bookList.get(index);  //인덱스번호를 가져온다
	}
	//잔체 출력
	public ArrayList<Book> selectAll() {
		return bookList;
	}
	public ArrayList<Book> sortedBookList() {
//		bookList.sort(new AscCategory());
//		return bookList;
		ArrayList<Book> cList = new ArrayList<>();
		for(int i=0; i<bookList.size(); i++) {
			cList.add(bookList.get(i));
		}
		cList.sort(new AscCategory());
		return cList;
	}
	
	
	
	
	
}
