package com.test01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetTest {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress addr = InetAddress.getLocalHost();
		
		//����ǻ������/ ����ȣ��Ʈ(ip�ּ�)
		System.out.println(addr);
		System.out.println("localhost: " + addr.getHostAddress());
		System.out.println("host name: " + addr.getHostName());
		System.out.println();
		
		//
		InetAddress[] iArr = InetAddress.getAllByName("www.netflex.com");
		
		for(int i=0; i<iArr.length; i++) {
			System.out.println(iArr[i].getHostName() + " : " + iArr[i].getHostAddress());
		}
		
	}

}
