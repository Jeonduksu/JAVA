package com.io.part02_char;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamTest {
	public void fileSave() {
		//new 보조스트림(다른 스트림);
		//new 보조스트림(new 기반스트림(외부차원))
		
		//기반 스트림 변수명 =
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("sample2.txt");	//sample2.txt라는걸 새로 만든다
			
			fw.write("우리나라 대한민국"); // 문자열 출력
			fw.write('A'); //문자도 가능
			char[] car = {'a','p','p','l','e'};
			fw.write(car);
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
				System.out.println("저장 완료");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void fileOpen() { 	//읽어오는거
		FileReader fr = null;
		
		try {
			fr = new FileReader("sample2.txt");
			
			int val = 0;
			while( (val=fr.read()) != -1) {
				System.out.print((char)val);
			}
			
			System.out.println("==========");
			for(int i=0; i<50; i++) { 
				System.out.println(fr.read());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
		try {	
			fr.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
		}
	}

}
