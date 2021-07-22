package com.test01;

public class MethodTest02 {
	public static void main(String [] args) {
		//메소드 호출방법
		//static  :  class.method();
		
		MethodTest01.publicMethod();
		MethodTest01.protectedMethod();
		MethodTest01.defaultMethod();
		//MethodTest01.privateMethod();
		
		//nonstatic : class 변수명 = new calss();
		//					변수명.method();
		MethodTest01 mt01 = new MethodTest01();
		mt01.NonStaticMethod();
	}
}
