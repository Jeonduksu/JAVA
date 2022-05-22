package com.test03;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Functional03 {
	public static void main(String[] args) {
		func03();
	}
	
	public static void func01() {
		//Function �Ű����� o, ��ȯ�� o
		//apply()
		Function<Integer, String> ti = n -> (n<10)?"0"+n : ""+n;
		System.out.println(ti.apply(1));
		System.out.println(ti.apply(6));
		System.out.println(ti.apply(10));
	}
	
	public static void func02() {
		//BiFunction Bi��� ���� ������ �Ű������� ������
		//															int�� ��ȯ
		BiFunction<String, String, Integer> sum = (i,j) -> Integer.parseInt(i) + Integer.parseInt(j);
		
		System.out.println(sum.apply("10", "20"));
		
	}
	
	public static void func03() {
		//supplier �������ش�!
		Supplier<Integer> rnu = () -> (int)(Math.random()*45)+1;
		System.out.println(rnu.get());
		
		//consumer : �Ű����� O, ��ȯ X
		Consumer<String> hello = (name) -> System.out.println("hello, " + name);
		hello.accept("Lambda");
		
	}
}
