package com.inherit.chap01.before.model.dto;

import java.util.Date;

public class Desktop {
	private String brand; //제조사
	private String productNumber; 	//상품번호
	private String productCode;  	//상품코드
	private String productName;  	//상품명
	private String cpu;			 	//cpu
	private int hdd;				//하드디스크
	private int ram;				//메모리
	private String os;				//운영체제
	private int price;				//가격
	private Date date;				//제조일자
	private boolean allInone;		//일체형 여부

	//생성자(기본,매개변수)
	public Desktop () {}
	public Desktop (String brand, String poroductNumber, String productCode, String productName,
			String cpu, int hdd, int ram, String os, int price, Date date, boolean allInone) {
		this.brand = brand;
		this.productNumber = productNumber;
		this.productCode = productCode;
		this.productName = productName;
		this.cpu = cpu;
		this.hdd = hdd;
		this.ram = ram;
		this.os = os;
		this.price = price;
		this.date = date;
		this.allInone = allInone;
	}
	//getter && setter
	  public String getBrand() {
	      return brand;
	   }
	   public void setBrand(String brand) {
	      this.brand = brand;
	   }
	   public String getProductNumber() {
	      return productNumber;
	   }
	   public void setProductNumber(String productNumber) {
	      this.productNumber = productNumber;
	   }
	   public String getProductCode() {
	      return productCode;
	   }
	   public void setProductCode(String productCode) {
	      this.productCode = productCode;
	   }
	   public String getProductName() {
	      return productName;
	   }
	   public void setProductName(String productName) {
	      this.productName = productName;
	   }
	   public String getCpu() {
	      return cpu;
	   }
	   public void setCpu(String cpu) {
	      this.cpu = cpu;
	   }
	   public int getHdd() {
	      return hdd;
	   }
	   public void setHdd(int hdd) {
	      this.hdd = hdd;
	   }
	   public int getRam() {
	      return ram;
	   }
	   public void setRam(int ram) {
	      this.ram = ram;
	   }
	   public String getOs() {
	      return os;
	   }
	   public void setOs(String os) {
	      this.os = os;
	   }
	   public int getPrice() {
	      return price;
	   }
	   public void setPrice(int price) {
	      this.price = price;
	   }
	   
	   public Date getDate() {
	      return date;
	   }
	   
	   public void setDate(Date date) {
	      this.date = date;
	   }
	   
	   public boolean getAllInOne() {
	      return allInone;
	   }
	   public void setAllInOne(boolean allInone) {
	      this.allInone = allInone;
	   }
	   
	   
	   //information
	   public void information() {
	      System.out.println( brand + ", " + productNumber +", " + productCode + ", " + productName +
	            ", " + cpu +", " + hdd + ", " + ram + ", " + os + ", "+ price + ", " + date + ", " + allInone);
	   }
}
