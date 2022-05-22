package com.test01;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class URI02 {

	public static void main(String[] args) throws IOException {
		byte[] b = new byte[1];
		
		URL url = new URL("https://blog.kakaocdn.net/dn/s2lgA/btq5MoiuW18/SMwkcZ2Lc1H44TlyjKwKwK/img.png");
		
		URLConnection urlConn = url.openConnection();
		urlConn.connect();
		
		//File이라는 안붙어서 보조스트림 !
		//입력 & 타입변경 !!
		DataInputStream di = new DataInputStream(urlConn.getInputStream() );
		
		//출력
		FileOutputStream fs = new FileOutputStream("a.png");
		
		//반복해서 읽다가 저장
		while(di.read(b, 0, 1) != -1) {
			fs.write(b,0,1);
		}
		System.out.println("완료!");
		di.close();
		fs.close();
	}

}
