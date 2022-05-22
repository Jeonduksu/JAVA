package com.io.part03_add.buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferStreamTest {
	public void fileSaver() {  	//�ؽ�Ʈ���� ����
		//���ڴ��� ��Ʈ��(������Ʈ��)
//		BufferedWriter bw = null;
//		FileWriter fw =null; 	//��ݽ�Ʈ��
		
		//�⺻���� ���
	//	fw = new FileWriter("sample3.txt"); //��ݽ�Ʈ�� ��ü����
	//	bw = new BufferedWriter(fw); //������Ʈ�� �������
		
		BufferedWriter bw = null; //������Ʈ�� ���� !
		
		try {
			bw = new BufferedWriter(new FileWriter("sample3.txt")); //������Ʈ�� ���� = new ������Ʈ��(new ��ݽ�Ʈ��("�ܺ�����"))
			
			bw.write("�ȳ��ϼ���\n");
			bw.write("�ݰ����ϴ�\n");
			
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

	public void fileOpen() { 	//�о���°�
		
		try (BufferedReader br = new BufferedReader(new FileReader("sample3.txt"));){
		
			String tmp = null;
			
			while( (tmp = br.readLine()) != null) { 		//String �̶� null���� �ƴ��� ����.
				System.out.println(tmp);
			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
