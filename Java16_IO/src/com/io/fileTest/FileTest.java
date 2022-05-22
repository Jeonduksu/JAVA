package com.io.fileTest;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		File file = new File("person.txt");
		//��� ��Ʈ�� = new ��ݽ�Ʈ�� (�ܺ�����)
		
		System.out.println("���ϸ�: " + file.getName());
		//��Ȯ�� ��� �ִ��� �˰� ������ AbsolutePath()�޼ҵ� ���
		System.out.println("������: " + file.getAbsolutePath());
		//����ζ�� ����
		System.out.println("������: " + file.getPath());
		System.out.println("�뷮: " + file.length());
		//���������� �������� �˼��ִ�.
		System.out.println("��������: " + file.getParent());
		
		try {
			boolean b = file.createNewFile();
			
			System.out.println(b);
			
			//������ ������ ������ �ȵǰ� false�� ���´�
			boolean b1 = file.delete();
			System.out.println(b1);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
