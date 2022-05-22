package com.collection.part01.arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class ArrayListTest {

	public void testArrayList() {
		//ArrayList 배열 같은거
		//ArrayList 객체 
		
		ArrayList alist = new ArrayList();	 
		
		List list = new ArrayList();
		Collection clist = new ArrayList();
		
		//list는 객체만 저장
		alist.add("apple");
		alist.add(123);
		alist.add(45.67);
		alist.add(new Date());
		
		System.out.println("alist: " + alist);
		
		
		//ArrayList는 length가 아닌 size로 길이 구별
		//get이라는 메소드를 이용하여 출력한다
		for(int i=0; i<alist.size(); i++) {
			System.out.println(i + " : " + alist.get(i));
		}
		
		//중복확인
		alist.add("apple");
		//앞에 숫자를 넣으면 이 숫자의 순서에 들어간다 인덱스번호!!
		alist.add(1,"banana");
		System.out.println("alist: " + alist);
		
		//삭제
		alist.remove(2);
		
		System.out.println("alist: " + alist);
		
		//객체를 넣어준다
		alist.set(1,true);
		System.out.println("alist: " + alist);
		
	}
	
	public void testArrayList2() {
		ArrayList list = new ArrayList();
		list.add("apple");
		list.add("orange");
		list.add("mango");
		list.add("grape");
		list.add("melon");
		
		System.out.println("list: " + list);
		
		//오름차순 정렬
		Collections.sort(list);
		System.out.println("listsort: " + list);
		
		
	}
}
