package com.test.chap05_method;

public class OverloadingTest {
	public int test() {
		return 0;
	}
	
	public int test(int a) {
		return 0;
	}
	
	
	public int test(int a, int b) {
		return 0;
	}
	
	public int test(int a, String s) {
		return 0;
	}
	
	//에러발생
//	public int test(int b, int a) {
//		return 0;
//	}
	
	public String test(int a, int b, String str) {
		
		return null;
	}
	
	//에러발생
//	public int test(int a, int b , String str) {
//		return 0;
//	}
	
	
	//에러발생
//	private String test(int a, int b, String str) {
//		return null;
//	}
	
	
	
	
	
	
	
}
