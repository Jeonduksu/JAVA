package com.inherit.chap01.before.run;

import java.util.Date;

import com.inherit.chap01.before.model.dto.Desktop;
import com.inherit.chap01.before.model.dto.SmartPhone;
import com.inherit.chap01.before.model.dto.Television;

public class Mtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop d = new Desktop("¾ÖÇÃ","01","m-01234", "¾ÆÀÌ¸Æ", "m1", 500, 32, "macOs"
				, 300, new Date(), true);
		
		SmartPhone s = new SmartPhone("»ï¼º","02","s-4321","°¶·°½Ã","Ä÷ÄÄ", 100, 16
				, "android", 120, new Date(), "KT");
		
		Television t = new Television("LG","03","t-22334","LGTV", 500, new Date(), 65);
		
		d.information();
		s.information();
		t.information();
	
	
	}

}
