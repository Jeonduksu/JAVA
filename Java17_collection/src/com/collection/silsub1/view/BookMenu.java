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
		//구현순서 1>5>4>3>2
		//추가 add 검색 get 삭제 remove
		while(true) {
			System.out.println("***도서 관리 프로그램 ***");
			System.out.println("1.새 도서 추가");
			System.out.println("2.도서정보 정렬 후 출력");
			System.out.println("3.도서 삭제");
			System.out.println("4.도서 검색출력");
			System.out.println("5.전체 출력");
			System.out.println("6.끝내기");
			
			System.out.println("메뉴 번호 선택: ");
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
					System.out.println("성공적으로 삭제되었습니다.");
				}else {
					System.out.println("삭제할 글이 존재하지 않습니다.");
				}
				break;
				
			case 4:
				//두가지 방법
				//책 등록 유무 확인
				 int index = bm.searchBook(inputBookTitle());
				 
				 //index번호에 따라 출력!
				 if(index == -1) {
					 System.out.println("조회한 글이 존재하지 않습니다.");
				 }else {
					 System.out.println(bm.selectBook(index) );
				 }
				 break;
			case 5:
				ArrayList<Book> list = bm.selectAll();
				if(list.isEmpty()) {		//isEmpty true인지 아닌지 확인
					System.out.println("도서가 없습니다.");
				}else {
					//Iterator로 출력
					Iterator<Book> it= list.iterator();
					while(it.hasNext()) {
						System.out.println(it.next());
					}
				}
				break;
			case 6:
				System.out.println("프로그램을 종료합니다.");
				return;			//return을 해야 메소드가 끝난다
			
			}
			
		}
	}
	
	public Book inputBook() {
		System.out.print("제목 : ");
		String title = sc.nextLine();
		System.out.print("장르(1.인문/2.자연과학/3.의료/4.기타) 숫자로 입력 : ");
		int category = sc.nextInt();
		sc.nextLine();						//입력받고 엔터키 떄문에 nextLine으로 받고 넘어간다
		System.out.print("저자: ");
		String author = sc.nextLine();
		
		return new Book(category, title, author);
	}
	public int inputBookNo() {
		System.out.println("도서 번호: ");
		int no = sc.nextInt();
		sc.nextLine();
		
		return no;
	}
	public String inputBookTitle() {
		System.out.print("도서 제목: ");
		String title = sc.nextLine();
		
		return title;
	}
}
