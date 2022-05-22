package com.chap02.stringBuffer_Builder;

public class Run {

	public static void main(String[] args) {
		//Run.method1();
		Run.method2();
	}
	
	public static void method1() {
		StringBuilder sb = new StringBuilder("아아 좋은아침?");
		System.out.println(sb);
	
	
	
		//문자열이 합쳐지는게 아니라 새로운 할달이 되는것이다!
		String str = "안녕하세요!";
		System.out.println("str 기존: " + str + ",주소: " + System.identityHashCode(str));
		
		str += "저는 이창진입니다.";
		System.out.println("str 추가 후: " + str + ",주소: " + System.identityHashCode(str));
		
		StringBuffer sf = new StringBuffer("아침은 아직");
		System.out.println("sf 기존 : " + sf + ",주소 : " + sf.hashCode()+System.identityHashCode(sf));
		
		//문자열 추가할때 append()메소드 사용
		sf.append("쌀쌀하네요!");
		System.out.println("sf 추가 후 : " + sf + ",주소" + sf.hashCode()+System.identityHashCode(sf));
			
	}
	
	public static void method2() {
		//StringBuilder sb = new StringBuilder("난 ");
		StringBuffer sb = new StringBuffer("난 ");
		
		//append
		sb.append("커피 먹어").append("~!");
		System.out.println(sb);
		
		//length
		System.out.println(sb.length());
		//insert
		sb.insert(2, "잠이 덜깨 서");
		System.out.println(sb);
		
		//delete
		sb.delete(0,8);
		System.out.println(sb);
		
		//reverse
		sb.reverse();
		System.out.println(sb);
		
		
		
		
	}

}
