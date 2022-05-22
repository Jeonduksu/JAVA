package com.chap04.wrapperClass;

public class Run {
	
	//Boxing
	//UnBoxing
	public static void main(String[] args) {
		//boxing
		Integer i = new Integer(10);
		Double d = new Double(10.0);
		
		//autoBoxing
		//자동으로 박싱을 해준다.
		Integer i2 = 10;
		Double d2 = 10.0;
		Short i3 = 10;
		
		//unboxing
		//기본타입 데이터로 변경 가능!
		//자료형Value()메소드 사용
		int pi = i.intValue();
		double pd = d.doubleValue();
		
		//autoUnboxing
		int no = i2;
		double no2 = d2;
							//(pi+no)									(int)obj
		abox(pi+no);		//int >>(autoBoxing)>>Integer>>(다형성)>>Object>>int
	
	
		byte b = Byte.parseByte("1");
		int i5 = Integer.parseInt("4");
		//i5 = new Integer("4");
		long l = Long.parseLong("8");
		double d3 = Double.parseDouble("0.4");
		
		i5 = Integer.valueOf("4");
		d3 = Double.valueOf("4.0");
		
		String sb = Byte.valueOf((byte)1).toString();
		//i2를 String 문자열로 변환
		String si = i2.toString();
		//문자열로 변환
		String sd = Double.valueOf(4.0).toString();
	}
	
	public static void abox(Object obj) {
		System.out.println((int)obj);
	}
}
