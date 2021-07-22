package com.test01;

public class Variable02 {
	
	public static void main(String[] args) {
		//상수
		int age;
		final int AGE; 
		
		age = 19;
		AGE = 19;
		
		//출력
		System.out.println("age: " + age);
		System.out.println("AGE: " + AGE);
	
		//변수의 값 변경
		age = 30;
		//AGE = 30;
		//에러 발생, 상수값 변경 불가
		
		System.out.println("변경 후age: " + age);
		System.out.println("변경 후AGE: " + AGE);
		System.out.println("상수 값은 한번 기록 후 변경이 불가능");
	}

}
