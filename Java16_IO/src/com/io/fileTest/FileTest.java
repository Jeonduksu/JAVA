package com.io.fileTest;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		File file = new File("person.txt");
		//기반 스트림 = new 기반스트림 (외부차원)
		
		System.out.println("파일명: " + file.getName());
		//정확히 어디에 있는지 알고 싶으면 AbsolutePath()메소드 사용
		System.out.println("저장경로: " + file.getAbsolutePath());
		//상대경로라고 생각
		System.out.println("저장경로: " + file.getPath());
		System.out.println("용량: " + file.length());
		//상위폴더란 저장됬는지 알수있다.
		System.out.println("상위폴더: " + file.getParent());
		
		try {
			boolean b = file.createNewFile();
			
			System.out.println(b);
			
			//파일이 없으면 삭제가 안되고 false가 나온다
			boolean b1 = file.delete();
			System.out.println(b1);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
