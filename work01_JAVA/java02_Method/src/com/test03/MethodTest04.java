package com.test03;

public class MethodTest04 {
	public static void main(String [] args) {
		MethodTest04 mt = new MethodTest04();
		mt.test();
		
		//int inum = mt.test1(2);
			//System.out.println("test1 method 호출 후 inum:" +inum);

		char ch = mt.test2('a');
		System.out.println("test2 method 호출 후 ch:" +ch);
		
		double dnum =mt.test3(2.9);
		System.out.println("test3 method 호출 후 dnum" + dnum);
		
		String str = mt.test4("abc");
		System.out.println("test4 method 호출 후 str :" + str);
	}
	
	public void test() {
		System.out.println("test method");
	}
	
	
	
		
	public char test2(char ch) {
		System.out.println("return char method");
		return ++ch;
	}
	
	public double test3(double d) {
		System.out.println("return double method");
		return d+1;
	}
	
	public String test4(String s) {
		System.out.println("return String method");
		return s+"def";
	}
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

