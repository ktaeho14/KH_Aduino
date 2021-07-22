package com.test.chap05_method;

public class MethodTest2 {
	//static 메소드
	
	//1.매개변수와 리턴값이 없는 메소드
	public static void sMethod1() {
		int num1 = 10;
		int num2 = 20;
		System.out.println("10과 20의 합은: " + (num1 + num2)+"입니다");
	}
	
	
	//2.매개변수가없고 리턴값이 있는 메소드
	public static int sMethod2() {
		int num1 = 10;
		int num2 = 20;
		
		return num1 + num2;
	}
	
	//3.매개변수가 있고 리턴값이 없는 메소드
	public static void sMethod3(String name) {
		System.out.println(name + "님의 방문을 환영합니다");
	}
	
	
	//4.매개변수가 있고 리턴값도 있는 메소드
	public static String sMethod4(String name) {
		return name+"님의 방문을 환영합니다";
	}
	
	
	
	
	
	
	
}
