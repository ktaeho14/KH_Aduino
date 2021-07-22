package com.test01;

import java.util.Scanner;

public class WhileTest01 {
	public static void main(String[] args) {
		//WhileTest01.testWhile();
		//WhileTest01.testWhile2();
		//WhileTest01.testWhile3();
		//WhileTest01.testWhile4();
		WhileTest01.testWhile4_2();
		
		
	}
	
	public static void testWhile() {
		int i = 1;
		while(i<10) {
			System.out.println(i+" 번째!");
			i++;
		}
	
	
	}
	public static void testWhile2() {
		//문자열을 입력 받아 인덱스 별로 문자를 출력
		String str = "changjin";
		int index = 0;
		
		
		while(index < str.length() ) {
			char ch =str.charAt(index);
			System.out.println(index + " : " + ch);
			index++;
			
		}
		
		
		
		
	}
	
	
	public static void testWhile3() {
		//1부터 입력받은 수 까지의 정수들의 합
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		System.out.println("정수 하나 입력");
		int num = sc.nextInt();
		
		int i = 1;
			
		while(i <= num) {
			sum += i;
			
			i++;
		}
		System.out.println("sum: " + sum);
	}
	
	
	
	public static void testWhile4() {
		int  i =1;
		
		while(true) {
			System.out.println(i);
			i++;
			
			if(i==10) {
				break;	
		}
		
	}
		
		
		
		
		
		
		
	}
	
	public static void testWhile4_2() {
		//키보드로 4를 입력 받을때 까지 반복,
		//4가 입력되면 while문 종료.
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			
			System.out.println("숫자입력[1~10]: ");
			int no = sc.nextInt();
			
			
			if(no==4) {
				System.out.println("4입력!!! 종료!!");
				break;
			}
		}
		
		
		
		
		
		
	}
	
	
	
}
