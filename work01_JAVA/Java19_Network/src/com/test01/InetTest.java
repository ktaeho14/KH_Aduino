package com.test01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetTest {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress addr = InetAddress.getLocalHost();
		
		System.out.println(addr);
		System.out.println("localhost: " + addr.getHostAddress());
		System.out.println("host name: " + addr.getCanonicalHostName());
	
		InetAddress[] arr = InetAddress.getAllByName("www.naver.com");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].getHostAddress()+" : " + arr[i].getHostName());
		}
	
	
	
	
	
	
	
	
	}

}
