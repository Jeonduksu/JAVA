package silsub2.model.vo;

public class Product {

	//필드
	private String pName;
	private int price;
	private String brand;
	
	//생성자
	public Product() {}
	
	//getter&setter
	public void setPName(String pName) {
		this.pName = pName;
	}
	public String getPName() {
		return pName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	
	public String information() {
	
		return "pName= " + pName  + "price= "+price + "brand="+brand;
	}	
}
	
