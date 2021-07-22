package com.test01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Variable03 {
	//java.io 패키지에서 제공되는 클래스들을 이용
	public static void main(String[] args) {
		//클래스명 변수명 = new 클래스명();
		Variable03 test = new Variable03();
		//test.input1();
		
		test.input2();
		
		
	}
	public void input1() {
		//현재 위치한 패키지 외의 다른 패키지에 속한 클래스를 사용할 때 import를 해줘야 한다.(불러와야한다)
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		 System.out.print("정수 한 개 입력: ");
		 
		 try {
			 
			 String value = br.readLine();
		 
			 //System.out.println(value*3);	
			 int number = Integer.parseInt(value);
			 System.out.println(number*3);
			 
		 }catch(IOException e) {
			 e.printStackTrace();
		 }
	
	
	}
	public void input2() {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("이름: ");
		String name = sc.nextLine();
		//한줄로 전체다 읽어오고 싶다 라면 nextLine을 사용한다
		
		System.out.print("나이: ");
		int age = sc.nextInt();
		
		System.out.print("시력: ");
		double eyesight = sc.nextDouble();
		
		System.out.println(name+":"+age+" : " + eyesight);
	}
	
	
	
	
	
}
