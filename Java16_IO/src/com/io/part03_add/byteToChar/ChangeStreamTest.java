package com.io.part03_add.byteToChar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ChangeStreamTest {
	//��ݽ�Ʈ���� ������Ʈ���� ���δ�
	//��� byte Ÿ�� ���� char Ÿ��
	//Ÿ���� �����ɷ� �ؾߵǴµ� ���⼭ ���� ��Ʈ���� �ϳ� ������� �����Ѵ�.
	
	public void input() {
		//������Ʈ�� ���� = new ������Ʈ��(new ��ݽ�Ʈ��("�ܺ�����"))
		//������Ʈ�� char  	= new ������Ʈ��		new	��ݽ�Ʈ�� byte 	System.in�̸� �Է�â
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("���ڿ� �Է� : ");
			String val = br.readLine(); 	 //val�� ��´�
			
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
		//������Ʈ�� ������ = new ������Ʈ�� (new ��ݽ�Ʈ��(���â));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			bw.write("java good!");
			//flush() �޼ҵ�� �о ����Ѵ� !
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
