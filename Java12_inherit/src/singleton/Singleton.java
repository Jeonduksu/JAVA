package singleton;

public class Singleton {
	
	//[1]
	/*private Singleton() {
		
	}*/
	
	//[2]
	//new 연산자로 새롭게 던진다
	//new 연산자를 이용하여 같은객체가 아니다
	/*
	private Singleton() {}
	public static Singleton getInstance() {
		return new Singleton();
	}*/

	//[3]
	//새로운 값을 할당 받는데 그새로운 값이 계속 저장되어 
	//객체가 같다 왜 저장이 되냐면 static 때문에 저장이된다
	private static Singleton one;
	
	private Singleton() {}

	public static Singleton getInstance() {
		if(one == null) {
			one = new Singleton();
		}
		return one;
	}




}
