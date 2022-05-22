package com.test01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetTest {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress addr = InetAddress.getLocalHost();
		
		//내컴퓨터정보/ 로컬호스트(ip주소)
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
