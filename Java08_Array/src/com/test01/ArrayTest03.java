package com.test01;

public class ArrayTest03 {

	public static void main(String[] args) {

		ArrayTest03 test = new ArrayTest03();
		test.deepCopy3();

	}

	public void shallowCopy() {
		// �������� -> �迭�� �ּҸ� �����Ѵ�.

		int[] oArr = { 1, 2, 3, 4, 5 };
		int[] cArr = oArr;

		// �����迭�� ���� str�� �����Ͽ� ���
		String str = "";

		for (int i = 0; i < oArr.length; i++) {
			str += oArr[i] + " ";
		}
		System.out.println(str);

		// ������ �迭�� ���� str�� �����Ͽ� ���;
		str = "";
		for (int i = 0; i < cArr.length; i++) {
			str += cArr[i] + " ";
		}
		System.out.println("2.cArr : " + str);

		// �����迭 �� ����
		oArr[0] = 99;

		// ���� �� ���
		str = "";

		for (int i = 0; i < oArr.length; i++) {
			str += oArr[i] + " ";
		}
		System.out.println("1.oArr : " + str);

		// ���� �� ���
		str = "";
		for (int i = 0; i < cArr.length; i++) {
			str += cArr[i] + " ";
		}
		System.out.println("2.cArr : " + str);

		System.out.println("oArr�� hashcode: " + oArr.hashCode());
		System.out.println("cArr�� hashcode: " + cArr.hashCode());

	}

	public void deepCopy() {
		// ���� ����� ���ο� �迭 �ϳ��� �����ϰ� ���� ����
		int[] oArr = { 1, 2, 3, 4, 5 };
		int[] cArr = new int[5];

		// for�� �̿��� ��������
		for (int i = 0; i < oArr.length; i++) {
			cArr[i] = oArr[i];
		}

		// ���� ���
		String str = " ";

		for (int i = 0; i < oArr.length; i++) {
			str += oArr[i] + " ";

		}
		System.out.println("oArr: " + str);

		// ���纻 ���
		str = "";
		for (int i = 0; i < cArr.length; i++) {
			str += cArr[i] + " ";
		}
		System.out.println("cArr : " + str);

		// �� ����
		oArr[0] = 99;

		str = " ";

		for (int i = 0; i < oArr.length; i++) {
			str += oArr[i] + " ";

		}
		System.out.println("oArr: " + str);

		// �� ���� �� ���
		str = "";
		for (int i = 0; i < cArr.length; i++) {
			str += cArr[i] + " ";
		}
		System.out.println("cArr : " + str);
	}

	public void deepCopy2() {
		// System�� �ִ� arraycopy()

		int[] oArr = { 1, 2, 3, 4, 5 };
		int[] cArr = new int[10];

		// arraycopy(src, srcPos, dest, destPos, length)
		// src:�����迭, srcPos:���������ġ
		// dest:ī�ǹ迭, desPos:�ٿ��ֱ������ġ
		// length: ����� ����

		System.arraycopy(oArr, 0, cArr, 3, oArr.length);
		// ���� ���
		String str = " ";

		for (int i = 0; i < oArr.length; i++) {
			str += oArr[i] + " ";

		}
		System.out.println("oArr: " + str);

		// ���纻 ���
		str = "";
		for (int i = 0; i < cArr.length; i++) {
			str += cArr[i] + " ";
		}
		System.out.println("cArr : " + str);

		System.out.println("oArr�� hashCode : " + oArr.hashCode());
		System.out.println("cArr�� hashcode : " + cArr.hashCode());
	}

	public void deepCopy3() {
		// clone() ��°�� ����
		int[] oArr = { 1, 2, 3, 4, 5 };
		int[] cArr = new int[10];
		System.out.println("�غ�� oArr�� hashcode : " + oArr.hashCode());
		System.out.println("�غ�� cArr�� hashcode : " + cArr.hashCode());

		cArr = oArr.clone();

		System.out.println("����� �迭�� hashcode : " + cArr.hashCode());
		// ���� ���
		String str = " ";

		for (int i = 0; i < oArr.length; i++) {
			str += oArr[i] + " ";

		}
		System.out.println("oArr: " + str);

		// ���纻 ���
		str = "";
		for (int i = 0; i < cArr.length; i++) {
			str += cArr[i] + " ";
		}
		System.out.println("cArr : " + str);

		System.out.println("oArr�� hashCode : " + oArr.hashCode());
		System.out.println("cArr�� hashcode : " + cArr.hashCode());
	}
}
