package com.test.chap01;
//�ۺ� Ŭ���� Ŭ������
public class Score {
	//�ʵ�
	//��� ����
	private String name = "������";
	private int kor = 90;
	private int eng = 86;
	private int math = 97;
	
	//�޼ҵ�� �߰�ȣ�� �����ִ�
	//������
	public Score() {}
	
	//������ ���� ����ϴ� ���
	public void sum() {
		int s;		
		s = kor + eng + math;
		System.out.println("�հ� : " + s);
	}
	//����� ���� ����ϴ� ���
	public void avg() {
		double a;
		a = kor + eng + math / 3.0;
		System.out.println("��� : " + a);
	}
	//���� ���� ������ ���� ������ ã�� ����ϴ� ���
	public void max() {
		int b;
		b = kor;
		if(b<eng) {
			if(eng> math) {
				b = eng;
			}
		}else if(math > eng) {
			if(math > b) {
				b = math;
			}
		}else {
			b = kor;
		}
		System.out.println("�ִ� : " + b);
	}
	//�ʵ尪 Ȯ���Ҽ� �ִ� ���
	public void prn() {
		System.out.println(name+ "�л��� �������� : " + kor + "��������" + eng
				+ "��������" + math +"�̴�.");
	}
	
}
