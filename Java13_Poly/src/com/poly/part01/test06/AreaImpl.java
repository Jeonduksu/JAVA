package com.poly.part01.test06;

public abstract class AreaImpl implements Area{

	private String result;
	
	public void setResult(String result) {
		this.result = result;
	}
	
	@Override
	public void print() {
		System.out.println(Area.print + result);
	}

	//상속받은걸 구현하기가 싫다
	//추상메소드로 구현 !
	//abstract !! 이걸로 처리!
	@Override
	public abstract void make();

}
