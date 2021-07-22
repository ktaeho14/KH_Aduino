package com.test01;

public class Operator02 {
	public static void main(String[] args) {
		Operator02 ot = new Operator02();
		ot.opTest();
		ot.opTest2();
		
		//new Operator02.optest2();
		
	}
	public void opTest() {
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + (num1 * num2));
	
		System.out.println("num1 / num2 = " + (num1 / num2));
		System.out.println("num1 % num2 = " + (num1 % num2));
	
	}
	
	/*
	 * 비교 연산자
	 * 비교 연산자는 조건을 만족하면 true, 만족하지 못하면 false
	 * 
	 * < 	, a<b 	a가 b보다 작은가?
	 * > 	, a>b 	a가 b보다 큰가?
	 * == 	, a==b	a와b가 같은가?
	 * != 	, a!=b	a와b가 다른가?
	 * <=	, a<=b	a가 b보다 작거나 같은가?
	 * >=	, a>=b	a가 b보다 크거나 같은가?
	 */
	
	public void opTest2() {
		int a = 10, b=20;
		boolean res1, res2, res3;
		res1 = (a == b);
		res2 = (a <= b);
		res3 = (a > b);
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		
	}






}

