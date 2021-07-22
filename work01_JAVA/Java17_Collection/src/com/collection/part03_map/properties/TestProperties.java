package com.collection.part03_map.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {
	
	public void testProp() {

		
	Properties prop = new Properties();
	
	prop.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
	prop.setProperty("url", "jdbc.oracle.thin:@127.0.0.1:1521:xe");
	prop.setProperty("user", "student");
	prop.setProperty("password", "student");
	
	//Property 안에 키와 밸류값은 String String 타입의 인자값만 넣을 수 있다.
//	prop.setProperty(1, "hi");
	
	System.out.println(prop);

	try {
		prop.store(new FileOutputStream("driver.properties"), "jdbc driver");
		prop.store(new FileWriter("driver.txt"), "jdbc driver");
		prop.storeToXML(new FileOutputStream("driver.xml"), "jdbc driver");
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	
	
	}
	
	public void testProp2() {
		Properties prop = new Properties();
		try {
			//prop.load(new FileInputStream("driver.properties"));
			prop.loadFromXML(new FileInputStream("driver.xml"));
			
			
			System.out.println(prop.getProperty("driver"));
			System.out.println(prop.getProperty("url"));
			System.out.println(prop.getProperty("user"));
			System.out.println(prop.getProperty("password"));
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
