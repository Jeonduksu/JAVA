package com.test02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Myclient {
	public static void main(String[] args) throws IOException {
		//����
		DatagramSocket ds = new DatagramSocket();
		System.out.println("Ŭ���̾�Ʈ");
		
		//���� data
		//���ڿ��� byte�迭�� �ٲ��.
		byte[] buff = "�����Դϴ�.".getBytes();
		
		//�����ּҸ� ��Ŷ���ٰ� ���´�
		//������ ��Ŷ ���� ( ��Ƽ�)
		//�̰� �Ѱ��ش�.
		DatagramPacket sendp = 
				new DatagramPacket(buff, buff.length, InetAddress.getByName("localhost"),9999);
		
		//������
		ds.send(sendp);
		
		//�ݾ�����
		ds.close();
		ds.disconnect();
	}
}
