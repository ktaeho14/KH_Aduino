package com.test;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URI02 {

	public static void main(String[] args) throws Exception {
		URLConnection urlc = new URL("http://www.google.com").openConnection();

		BufferedInputStream buff = new BufferedInputStream(urlc.getInputStream());
		
		int byteRead=0;
		
		while((byteRead =buff.read()) != -1) {
			System.out.print((char)byteRead);
		}
		
		buff.close();
		
		
	}

}
