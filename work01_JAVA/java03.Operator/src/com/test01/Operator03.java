package com.test01;

import java.util.Scanner;

public class Operator03 {
	public static void main(String[]args) {
		Operator03 ot = new Operator03();
		ot.opTest();
		
		
		
	}
	
	public void opTest() {
		//정수 하나를 키보드로 입력 받아 1~100사이의 정수인지 확인
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 하나 입력");
		int num = sc.nextInt();
		
		System.out.println("1~100 확인: " + (num>=1 && num<=100));
	
		//키보드로 영어 문자 하나를 입력 받아 영어 대문자인지 확인
		//'A' ~ 'Z' => 문자>='A' && 문자<='Z'
		
		System.out.println("문자 하나 입력: ");
		char ch = sc.next().charAt(0);
		//String으로 가지고 온후에 charAt으로 다시 가져와야한다
		
		System.out.println("대문자 확인:" + (ch>='A' && ch<='Z'));
		
		System.out.println("문자 하나 입력");
		char sch = sc.next().charAt(0);
		System.out.println("소문자 확인" + (sch>='a' && sch<='z'));
	
		System.out.println(Character.isUpperCase(ch));
	
		//입력한 문자가 대소문자 상관없이 'y' 'Y' 인지 물어볼 때
		System.out.print("계속 하시려면 y/Y를 입력하세요");
		char ch2 = sc.next().charAt(0);
		
		System.out.println("영문자 y인지 확인: " + (ch2=='y' || ch2=='Y'));
	
	
	}
	
	
	
	
}
