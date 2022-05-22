package silsub2.run;

import silsub2.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product pro = new Product();
		pro.setPName("Àü´ö¼ö");
		pro.setPrice(300);
		pro.setBrand("ÆÏ»§");
		
		System.out.println(pro.information());
	}

}
