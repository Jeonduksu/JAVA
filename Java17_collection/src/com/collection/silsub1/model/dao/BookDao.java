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
	
	//������ ���� ��ȣ ����
	//�ε�����ȣ -1�̶��� ����!!
	public int getLastBookNo() {
		//size()-1 ������ ��ü�� �����´�!
		return bookList.get(bookList.size()-1).getbNo();
	}
	//�� ���� �߰�
	public void addBook(Book book) {
		bookList.add(book);
	}
	public int deleteBook(int no) {
		int res = 0;
		for(int i=0; i<bookList.size(); i++) {
			if(bookList.get(i).getbNo() == no) {
				bookList.remove(i);
				res=1;    //������ ���������� 1�� ���
			}
		}
		return res;
	}
	public int searchBook(String title) {
		int index = -1; 	//�⺻����
		for(int i=0; i<bookList.size(); i++) {
			if(bookList.get(i).getTitle().contains(title)) {
				index=i;
				break;
			}
		}
		return index;
	}
	//�ش� �ε��� ���� �̿��� book ��ü ����
	public Book selectBook(int index) {
		return bookList.get(index);  //�ε�����ȣ�� �����´�
	}
	//��ü ���
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
