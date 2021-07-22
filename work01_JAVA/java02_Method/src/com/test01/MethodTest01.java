package com.test01;
	//접근 제한자
public class MethodTest01 {
	public static void main(String[] args) {
		//클래스명.메소드명();
		MethodTest01.publicMethod();
		MethodTest01.protectedMethod();
		MethodTest01.defaultMethod();
		MethodTest01.privateMethod();
		
		
		MethodTest01 mt01 = new MethodTest01();
		mt01.NonStaticMethod();
	}
	
	
	//public의미 어디서나 접근,참조 가능( + )
	public static void publicMethod() {
		System.out.println("public method");
	}

	//상속일 경우 상속된 곳에서 ( # )
	//상속이 아닌 경우 같은 패키지 내에서
	protected static void protectedMethod() {
		System.out.println("protcted method");
	}
	
	//같은 패키지 내에서(defalut)
	static void defaultMethod() {
		System.out.println("defalut method");
	}
	
	//현재 클래스 내에서만 ( - )
	private static void privateMethod() {
		System.out.println("private method");
		
		MethodTest01.defaultMethod();
		
	}
	
	
	public void NonStaticMethod() {
		System.out.println("non static method");
	}
	
	
	
	
	
	
	
	
	
}

