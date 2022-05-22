package com.io.part03_add.buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferStreamTest {
	public void fileSaver() {  	//텍스트파일 생성
		//문자단위 스트림(보조스트림)
//		BufferedWriter bw = null;
//		FileWriter fw =null; 	//기반스트림
		
		//기본적인 방법
	//	fw = new FileWriter("sample3.txt"); //기반스트림 객체생성
	//	bw = new BufferedWriter(fw); //보조스트림 생성방식
		
		BufferedWriter bw = null; //보조스트림 변수 !
		
		try {
			bw = new BufferedWriter(new FileWriter("sample3.txt")); //보조스트림 변수 = new 보조스트림(new 기반스트림("외부차원"))
			
			bw.write("안녕하세요\n");
			bw.write("반갑습니다\n");
			
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

	public void fileOpen() { 	//읽어오는거
		
		try (BufferedReader br = new BufferedReader(new FileReader("sample3.txt"));){
		
			String tmp = null;
			
			while( (tmp = br.readLine()) != null) { 		//String 이라서 null인지 아닌지 본다.
				System.out.println(tmp);
			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
