package com.io.part01_byte;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestByteStream {
	
	public void fileSave() {
		FileOutputStream fout = null;
		
		try {
			fout = new FileOutputStream("sample.txt"); //텍스트 생성
			fout.write(97);	//문자를 출력하겠다
			byte[] bar = {98,99,100,101,102,10}; //바이트 배열에 문자를 담는다
			fout.write(bar);
			fout.write(bar,1,3);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

	public void fileOpen() {
		FileInputStream fin = null;
		//여기서 외부자원은 == 파일 경로!
		try {
			fin = new FileInputStream("sample.txt");
			//file 사이즈는 원래 long이기 떄문에 int로 강제형변환 해준다
			/* 	byte타입을 이용한 1번째 방법
			int fileSize = (int)new File("sample.txt").length();
			
			byte[] bar = new byte[fileSize];
			
			fin.read(bar);
			
			for(int i=0; i<bar.length; i++) {
				System.out.print(bar[i] + " ");
			}
			*/
			//2 int를 이용한 2번째 방법
			int val=0;
			while((val=fin.read()) != -1) { 		//read가 return해줄때가 있다
				System.out.print((char)val+ " ");
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally { 			//마무리단계 finally 하고 close로 닫는다!
			try {
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void fileOpen2() {
		//try with resource
		try(FileInputStream fin = new FileInputStream("sample.txt")) {
			
			int size = (int)new File("sample.txt").length();
			byte[] bar = new byte[size];
			
			fin.read(bar);
			
			for(int i=0; i<bar.length; i++) {
				System.out.println(bar[i] + " ");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
