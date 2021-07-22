package com.test01;

public class Operator05 {
//산술대입 연산자(복합대입연산자)	//+=, -=, *= ,/=, %=
	public static void main(String [] args) {
		int num = 12;
		
		System.out.println("num: " + num);
		
		num = num+3;
		System.out.println("num: " + num);
		
		num += 3;
		System.out.println("num: " + num);
				
		num -= 5; //num = num-5
		System.out.println("num: " + num);
		
		num *= 2; //num값 2배 증가
		System.out.println("num: " + num);
		
		num /= 2; //num값 2배 감소
		System.out.println("num: " + num);
		
		num %= 5; //num = num % 5
		System.out.println("num: " + num);
	}
	
	
	
}
