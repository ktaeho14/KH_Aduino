package com.test01;

import java.util.Scanner;

public class WhileTest02 {

	public static void main(String[] args) {
		//WhileTest02.testDoWhile();
		WhileTest02.testDoWhile2();
		
		
	}
	public static void testDoWhile() {
		int i = 10;
		
		do {
			System.out.println(i);
			i++;
		}while(i<10);
		
		System.out.println("do while 실행 후 i: " + i);
		
		
		
		
	}
	
	public static void testDoWhile2() {
		//"end"라는 문자열을 입력할때 까지 반복
		//ctrl + shift + m : import
		//ctrl + shift + o : 페이지 내 모두 import
		Scanner sc = new Scanner(System.in);
		
		String str = "";
		
		do {
			System.out.println("문자열 입력: ");
			str = sc.next();
			if(str.equals("end")) {
				break;
			}
			System.out.println("str: " + str);
			
		}while(true);
		
	}
	
	
	
	
	
	
}
