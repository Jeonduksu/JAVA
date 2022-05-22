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
			fout = new FileOutputStream("sample.txt"); //�ؽ�Ʈ ����
			fout.write(97);	//���ڸ� ����ϰڴ�
			byte[] bar = {98,99,100,101,102,10}; //����Ʈ �迭�� ���ڸ� ��´�
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
		//���⼭ �ܺ��ڿ��� == ���� ���!
		try {
			fin = new FileInputStream("sample.txt");
			//file ������� ���� long�̱� ������ int�� ��������ȯ ���ش�
			/* 	byteŸ���� �̿��� 1��° ���
			int fileSize = (int)new File("sample.txt").length();
			
			byte[] bar = new byte[fileSize];
			
			fin.read(bar);
			
			for(int i=0; i<bar.length; i++) {
				System.out.print(bar[i] + " ");
			}
			*/
			//2 int�� �̿��� 2��° ���
			int val=0;
			while((val=fin.read()) != -1) { 		//read�� return���ٶ��� �ִ�
				System.out.print((char)val+ " ");
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally { 			//�������ܰ� finally �ϰ� close�� �ݴ´�!
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
