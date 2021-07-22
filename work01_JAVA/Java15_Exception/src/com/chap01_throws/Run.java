package com.chap01_throws;

import java.io.IOException;

public class Run {

	public static void main(String[] args) /* throws IOException */{
		try {
		methodA();
		System.out.println("main의 try");
		}catch(IOException e) {
			System.out.println("main()에서 처리");
		}
		
		System.out.println("으아아아아아아아");
		
		//
		
		
		
		
		
	}
	
	
	public static void methodA() throws IOException {
		
		
		methodB();
		
		}
	
	public static void methodB() throws IOException {
		
		methodC();
		
	}
	
	public static void methodC() throws IOException {
		throw new IOException();
		
	}
	
	
	
	
}
