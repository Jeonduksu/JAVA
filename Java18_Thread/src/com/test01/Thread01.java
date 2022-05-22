package com.test01;

public class Thread01 {

	public static void main(String[] args) {
		System.out.println("========main start=====");

//		MyTread m1 = new MyTread();
//		MyTread m2 = new MyTread();
//		m1.run();
//		m2.run();
		
		Thread m1 = new Thread(new MyTread());
		Thread m2 = new Thread(new MyTread());
		
		m1.start();
		m2.start();
		
		
		System.out.println("========main stop =====");
	}
	


}

class MyTread implements Runnable{
	
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println("i= " + i);
		}
	}
}