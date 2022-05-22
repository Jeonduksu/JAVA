package com.collection.part03.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
	public void test1() {
	//Properties
		Properties prop = new Properties();
	
		prop.setProperty("id", "student");
		prop.setProperty("password", "1234");
		
		System.out.println(prop);
		//			기반 스트림
		try {
			
			prop.store(new FileOutputStream("ippw.properties"), "id/pw");
			//txt생성
			prop.store(new FileWriter("ippw.txt"), "id/pw");
			prop.storeToXML(new FileOutputStream("driver.xml"),"id/pw");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	
	public void test2() {
		Properties prop = new Properties();
		System.out.println(prop.getProperty("id"));
		
		//읽어와서 properties에 저장
		try {
			//prop.load(new FileInputStream("idpw.properties"));
			//prop.load(new FileReader("ippw.txt"));
			prop.loadFromXML(new FileInputStream("driver.xml"));
			
			System.out.println(prop.getProperty("id"));
			System.out.println(prop.getProperty("password"));
			System.out.println(prop.getProperty("name"));
			
			prop.list(System.out);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
