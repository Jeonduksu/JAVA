package com.chap02.throwsPrac;

import java.io.IOException;

public class Run {

	public static void main(String[] args) throws IOException{
		try {
		methodA();
		}catch(IOException e) {
			System.out.println("main()���� ó��");
		}
	}
	
	public static void methodA() throws IOException{
		
		methodB();
	}
	public static void methodB() throws IOException{
		
		methodC();
		
	}
	//throw ���ܹ߻��ϴ°����� ����ó���� �ؾߵȴ�.
	//throw ������ �ű⼭ ����ó���� �ϸ� �ȴ�.
	public static void methodC() throws IOException {
		/*
		try {
			throw new IOException();
		}catch(IOException e) {
			System.out.println("���ܹ߻�");
		}*/
		throw new IOException();
		
	}
}
