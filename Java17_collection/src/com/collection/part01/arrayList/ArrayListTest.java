package com.collection.part01.arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class ArrayListTest {

	public void testArrayList() {
		//ArrayList �迭 ������
		//ArrayList ��ü 
		
		ArrayList alist = new ArrayList();	 
		
		List list = new ArrayList();
		Collection clist = new ArrayList();
		
		//list�� ��ü�� ����
		alist.add("apple");
		alist.add(123);
		alist.add(45.67);
		alist.add(new Date());
		
		System.out.println("alist: " + alist);
		
		
		//ArrayList�� length�� �ƴ� size�� ���� ����
		//get�̶�� �޼ҵ带 �̿��Ͽ� ����Ѵ�
		for(int i=0; i<alist.size(); i++) {
			System.out.println(i + " : " + alist.get(i));
		}
		
		//�ߺ�Ȯ��
		alist.add("apple");
		//�տ� ���ڸ� ������ �� ������ ������ ���� �ε�����ȣ!!
		alist.add(1,"banana");
		System.out.println("alist: " + alist);
		
		//����
		alist.remove(2);
		
		System.out.println("alist: " + alist);
		
		//��ü�� �־��ش�
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
		
		//�������� ����
		Collections.sort(list);
		System.out.println("listsort: " + list);
		
		
	}
}
