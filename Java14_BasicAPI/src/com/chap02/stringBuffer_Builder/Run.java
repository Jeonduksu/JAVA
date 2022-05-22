package com.chap02.stringBuffer_Builder;

public class Run {

	public static void main(String[] args) {
		//Run.method1();
		Run.method2();
	}
	
	public static void method1() {
		StringBuilder sb = new StringBuilder("�ƾ� ������ħ?");
		System.out.println(sb);
	
	
	
		//���ڿ��� �������°� �ƴ϶� ���ο� �Ҵ��� �Ǵ°��̴�!
		String str = "�ȳ��ϼ���!";
		System.out.println("str ����: " + str + ",�ּ�: " + System.identityHashCode(str));
		
		str += "���� ��â���Դϴ�.";
		System.out.println("str �߰� ��: " + str + ",�ּ�: " + System.identityHashCode(str));
		
		StringBuffer sf = new StringBuffer("��ħ�� ����");
		System.out.println("sf ���� : " + sf + ",�ּ� : " + sf.hashCode()+System.identityHashCode(sf));
		
		//���ڿ� �߰��Ҷ� append()�޼ҵ� ���
		sf.append("�ҽ��ϳ׿�!");
		System.out.println("sf �߰� �� : " + sf + ",�ּ�" + sf.hashCode()+System.identityHashCode(sf));
			
	}
	
	public static void method2() {
		//StringBuilder sb = new StringBuilder("�� ");
		StringBuffer sb = new StringBuffer("�� ");
		
		//append
		sb.append("Ŀ�� �Ծ�").append("~!");
		System.out.println(sb);
		
		//length
		System.out.println(sb.length());
		//insert
		sb.insert(2, "���� ���� ��");
		System.out.println(sb);
		
		//delete
		sb.delete(0,8);
		System.out.println(sb);
		
		//reverse
		sb.reverse();
		System.out.println(sb);
		
		
		
		
	}

}
