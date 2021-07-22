package com.example;

import java.util.Scanner;

public class Example {
	
	public void example1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 정수: ");
		int no1 = sc.nextInt();
		System.out.println("두번째 정수: ");
		int no2 = sc.nextInt();
		
		System.out.println(no1+no2);
		System.out.println(no1-no2);
		System.out.println(no1*no2);
		System.out.println(no1/no2);
		System.out.println(no1%no2);
	
	
	
	}
	
	
	public void example2() {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("가로: ");
		Double width = sc.nextDouble();
		System.out.println("세로: ");
		Double height = sc.nextDouble();
		
		System.out.println("면적: " + (width*height));
		System.out.println("둘레ㅣ " + (width+height)*2);
	
	
	}
	
	public void example3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요: ");
		String str = sc.next();
		
		System.out.println("첫번째: "+str.charAt(0));
		System.out.println("두번째: "+str.charAt(1));
		System.out.println("세번째: "+str.charAt(2));
	}
	
	
	
	
}
