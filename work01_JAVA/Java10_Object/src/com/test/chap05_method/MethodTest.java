package com.test.chap05_method;

public class MethodTest {
	//1. 매개변수 없고 반환값 없는 메소드
	public void method1() {
		System.out.println("매개변수와 반환값이 둘다 없는 메소드");
		return;
	}
	
	//2. 매개변수 없고 반환값이 있는 메소드
	public String method2() {
		
		return "매개변수가 없지만 반환값이 있는 메소드";
	}
	
	//3. 매개변수가 있고 반환값이 없는 메소드
	public void method3(int num1, int num2) {
		int sum = num1+num2;
		System.out.println("sum: " + sum);
		
		
		return;
	}
	
	//4. 매개변수가 있고 반환값도 있는 메소드
	public int method4(int num1, int num2) {
		
		return num1+num2;
	}
	
	
	
}
