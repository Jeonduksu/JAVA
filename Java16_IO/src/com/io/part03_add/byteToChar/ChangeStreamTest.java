package com.io.part03_add.byteToChar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ChangeStreamTest {
	//기반스트림에 보조스트림을 붙인다
	//기반 byte 타입 보조 char 타입
	//타입을 같은걸로 해야되는데 여기서 보조 스트림을 하나 더만들어 연결한다.
	
	public void input() {
		//보조스트림 변수 = new 보조스트림(new 기반스트림("외부차원"))
		//보조스트림 char  	= new 보조스트림		new	기반스트림 byte 	System.in이면 입력창
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("문자열 입력 : ");
			String val = br.readLine(); 	 //val에 담는다
			
			System.out.println("val : " + val);
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

	public void output() {
		//보조스트림 변수명 = new 보조스트림 (new 기반스트림(출력창));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			bw.write("java good!");
			//flush() 메소드는 밀어서 출력한다 !
			//bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
}
