package com.test02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Myclient {
	public static void main(String[] args) throws IOException {
		//소켓
		DatagramSocket ds = new DatagramSocket();
		System.out.println("클라이언트");
		
		//보낼 data
		//문자열이 byte배열로 바뀐다.
		byte[] buff = "연습입니다.".getBytes();
		
		//보낼주소를 패킷에다가 적는다
		//데이터 패킷 생성 ( 담아서)
		//이걸 넘겨준다.
		DatagramPacket sendp = 
				new DatagramPacket(buff, buff.length, InetAddress.getByName("localhost"),9999);
		
		//보낸다
		ds.send(sendp);
		
		//닫아주자
		ds.close();
		ds.disconnect();
	}
}
