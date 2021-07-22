package com.test;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URI01 {
	public static void main(String[] args) throws IOException {
		byte[] b = new byte[1];
		
		URL url = new URL("http://www.ntoday.co.kr/news/photo/201410/25106_6962_169.png");
	
		
		URLConnection urlConnection = url.openConnection();
	
		//url로 부터 이미지를 읽어올 스트림
		DataInputStream di = new DataInputStream(urlConnection.getInputStream());
	
		//이미지파일로 출력할 스트림
		FileOutputStream fo = new FileOutputStream("a.jpg");
		
		while(di.read(b, 0 , 1)!= -1) {
			fo.write(b,0,1);
		}
		System.out.println("완료");
		di.close();
		fo.close();
	
	
	
	
	
	
	
	
	
	
	
	}
}
