package com.test04;

import java.util.Scanner;


public class MyCalcMain {

	public static void main(String[] args) {
		MyCalc test = new MyCalc();
		
		System.out.println("10+15 = ");
		test.sum(10, 15);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 2개 입력: ");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int sub = test.sub(num1, num2);
		System.out.println(num1+" - "+num2+" = "+ sub);
	
	
		double mul = test.mul(num1, num2);
		System.out.println(num1+" * "+num2+" = "+ mul);
	
		test.div(num1, num2);
		
	}
	
	
	
	
	
	
	
}
