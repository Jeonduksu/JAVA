package com.collection.silsub1.view;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.collection.silsub1.controller.BookManager;
import com.collection.silsub1.model.dto.Book;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookManager bm = new BookManager();
	
	public BookMenu() {}
	
	public void mainMenu() {
		//�������� 1>5>4>3>2
		//�߰� add �˻� get ���� remove
		while(true) {
			System.out.println("***���� ���� ���α׷� ***");
			System.out.println("1.�� ���� �߰�");
			System.out.println("2.�������� ���� �� ���");
			System.out.println("3.���� ����");
			System.out.println("4.���� �˻����");
			System.out.println("5.��ü ���");
			System.out.println("6.������");
			
			System.out.println("�޴� ��ȣ ����: ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			case 1:
				Book b = inputBook();
				bm.addBook(b);
				break;
			case 2:
				bm.printBookList( bm.sortedBookList() );
				break;
			case 3:
				int result = bm.deleteBook(inputBookNo());
				if(result>0) {
					System.out.println("���������� �����Ǿ����ϴ�.");
				}else {
					System.out.println("������ ���� �������� �ʽ��ϴ�.");
				}
				break;
				
			case 4:
				//�ΰ��� ���
				//å ��� ���� Ȯ��
				 int index = bm.searchBook(inputBookTitle());
				 
				 //index��ȣ�� ���� ���!
				 if(index == -1) {
					 System.out.println("��ȸ�� ���� �������� �ʽ��ϴ�.");
				 }else {
					 System.out.println(bm.selectBook(index) );
				 }
				 break;
			case 5:
				ArrayList<Book> list = bm.selectAll();
				if(list.isEmpty()) {		//isEmpty true���� �ƴ��� Ȯ��
					System.out.println("������ �����ϴ�.");
				}else {
					//Iterator�� ���
					Iterator<Book> it= list.iterator();
					while(it.hasNext()) {
						System.out.println(it.next());
					}
				}
				break;
			case 6:
				System.out.println("���α׷��� �����մϴ�.");
				return;			//return�� �ؾ� �޼ҵ尡 ������
			
			}
			
		}
	}
	
	public Book inputBook() {
		System.out.print("���� : ");
		String title = sc.nextLine();
		System.out.print("�帣(1.�ι�/2.�ڿ�����/3.�Ƿ�/4.��Ÿ) ���ڷ� �Է� : ");
		int category = sc.nextInt();
		sc.nextLine();						//�Է¹ް� ����Ű ������ nextLine���� �ް� �Ѿ��
		System.out.print("����: ");
		String author = sc.nextLine();
		
		return new Book(category, title, author);
	}
	public int inputBookNo() {
		System.out.println("���� ��ȣ: ");
		int no = sc.nextInt();
		sc.nextLine();
		
		return no;
	}
	public String inputBookTitle() {
		System.out.print("���� ����: ");
		String title = sc.nextLine();
		
		return title;
	}
}