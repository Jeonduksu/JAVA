package com.test.chap03.test02;

public class InitBlock {
	//����� ���ÿ� �ʱ�ȭ
	private String name="������";
	private int price=200;
	private static String brand="����";
	
	//�̷������ε� �ʱ�ȭ�� �����ϴ�
	//�⺻ �ʱ�ȭ
	{
		name="������";
		price = 300;
		brand = "�Ｚ";
		System.out.println("�ʱ�ȭ ��");
	}	
	//static�� ���ư��鼭 �ʱ�ȭ
	//static�� ������ �ʱ�ȭ ����
	
	static {
		//name="����";
		brand="LG";
	}
	//������
	//public Ŭ������() {}
	//�Ű������� ���� ������
	public InitBlock () {}
	//�Ű����� �ִ� ������
	public InitBlock (String name,int price, String brand) {
		this.name = name;
		this.price = price;
		InitBlock.brand = brand;
	}
	
	public void information() {
		System.out.println(name + "," + price + "," + brand);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
}
