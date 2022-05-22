package singleton;

public class Singleton {
	
	//[1]
	/*private Singleton() {
		
	}*/
	
	//[2]
	//new �����ڷ� ���Ӱ� ������
	//new �����ڸ� �̿��Ͽ� ������ü�� �ƴϴ�
	/*
	private Singleton() {}
	public static Singleton getInstance() {
		return new Singleton();
	}*/

	//[3]
	//���ο� ���� �Ҵ� �޴µ� �׻��ο� ���� ��� ����Ǿ� 
	//��ü�� ���� �� ������ �ǳĸ� static ������ �����̵ȴ�
	private static Singleton one;
	
	private Singleton() {}

	public static Singleton getInstance() {
		if(one == null) {
			one = new Singleton();
		}
		return one;
	}




}
