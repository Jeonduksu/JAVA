package com.inherit.chap01.after.model.dto;

import java.util.Date;

public class Desktop extends Computer{
	
	private boolean allInone;
	
	public Desktop() {}

	public Desktop(String brand, String productNumber, String productCode, String productName, int price, Date date,
			String cpu, int hdd, int ram, String os, boolean allInone) {
		super(brand, productNumber, productCode, productName, price, date, cpu, hdd, ram, os);
		this.allInone = allInone;
	}

	public boolean isAllInone() {
		return allInone;
	}

	public void setAllInone(boolean allInone) {
		this.allInone = allInone;
	}
	
	@Override
	public String information() {
		return super.information() + ", " + this.allInone;
	}
	
}
