package com.test01;

public class MethodTest02 {
	public static void main(String [] args) {
		//�޼ҵ� ȣ����
		//static  :  class.method();
		
		MethodTest01.publicMethod();
		MethodTest01.protectedMethod();
		MethodTest01.defaultMethod();
		//MethodTest01.privateMethod();
		
		//nonstatic : class ������ = new calss();
		//					������.method();
		MethodTest01 mt01 = new MethodTest01();
		mt01.NonStaticMethod();
	}
}