package com.collection.part04.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GenericsTest {
	public void test1() {
		List list = new ArrayList();
		
		list.add(new String("Orange"));
		list.add(new Book());
		list.add(new Car());
		list.add(new Student());
		
		System.out.println("저장된 객체 수: " + list.size());
		System.out.println("list: " + list);
		
		//어떤객체인지 확인해보고 거기에 있는 주소값을 불러온다 !!
		for(int i=0; i<list.size(); i++) {
			Object obj = list.get(i); //obj라는 변수에 담는다
			System.out.println(obj);
			
			if(obj instanceof Book) {
				((Book) obj).printBook(); 	//한줄로표현
				//Book b = (Book)obj; 		//풀어쓰면 두줄표현
				//b.printBook();
			}
			if(obj instanceof Student) {
				((Student) obj).score();
			}
			if(obj instanceof Car) {
				((Car) obj).printCar();
			}
		}
	}
	
	public ArrayList<Book> test2() {
		//Generics 초기값 설정 ! <>
		//<Book>이라는 객체만 가져온다!
		//ArrayList 비교하기 위해 2개 만든다
		ArrayList<Book> list = new ArrayList<Book>();
		ArrayList list2 = new ArrayList();
		
		list.add(new Book());
		list.add(new Book());
		//list.add("test Book");
		
		list2.add(new Book());
		list2.add(new Book());
		//list2.add("test Book");  //Book으로 꺼내오는데 다른 객체가 있어서 에러가 뜬다
		
		//형성된 for문 list에 있는걸  하나씩 꺼내서 b에다 담는다 
		for(Book b: list) {
			b.printBook();    //Generics가 있으면 형변환 필요없다
		}
		
		for(Object ob: list2) {
			((Book) ob).printBook(); //Generics가 없으면 형변환 해줘야된다
		}
		
		return list;   //list2도 가능
	}

	public void test3() {
		//<key, value> Generics에 객체		객체 생성시에도 생략해도 자동생성 되는데 명확하게 표현하기 위해 작성
		HashMap<String, Book> map = new HashMap<String, Book>();
		
		map.put("one", new Book("java"));
		map.put("two", new Book("html"));
		map.put("three", new Book("spring"));
		
		System.out.println(map);
		
		// entryset(), Iterator
		Set<Map.Entry<String,Book>> entry = map.entrySet();
		Iterator<Map.Entry<String,Book>> iter = entry.iterator();
		
		while(iter.hasNext()) {
			Map.Entry<String, Book> ent = iter.next();
			String key = ent.getKey();
			Book value = ent.getValue();
			System.out.println(key + " : " + value);
		}
	}

}

//접근제한자 생략 
//이클래스 안에서만 사용 가능

class Book{
	private String title;
	public Book() {}
	public Book(String title) {
		this.title = title;
	}
	public void printBook() {
		System.out.println("printBook() call...");
	}
	@Override
	public String toString() {
		return "Book";
	}
}

class Student {
	public Student() {}
	public void score() {
		System.out.println("score() call..");
	}
	@Override
	public String toString() {
		return "Student";
	}
}

class Car {
	public Car() {}
	public void printCar() {
		System.out.println("printCar() call...");
	}
	@Override
	public String toString() {
		return "car";
	}
}