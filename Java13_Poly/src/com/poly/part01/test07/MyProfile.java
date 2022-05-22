package com.poly.part01.test07;

//인터페이스 : display
//추상 : Profile
public class MyProfile extends Profile implements Display, Job {
	private String loc;
	
	public MyProfile() {}
	
	public MyProfile(String name,String phone) {
		super(name,phone);
	}
	
	//하는일은 getter랑 같다
	//메소드만 다를뿐
	@Override
	public void jobLoc(String loc) {
		this.loc = loc;
	}

	//
	@Override
	public void display() {
		super.printProfile();
		System.out.println("회사 주소: " + loc);
		System.out.println("회사 직종: " + jobId);
	}

}
