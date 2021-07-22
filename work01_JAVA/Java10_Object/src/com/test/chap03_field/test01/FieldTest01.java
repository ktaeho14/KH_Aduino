package com.test.chap03_field.test01;


//변수 선언 위치에 따른 구분
public class FieldTest01 {//클래스영역의 시작
	//필드 == 멤버변수(클래스가 가지는 멤버라는 의미) == 전역변수(클래스 전역에서 사용 가능한 변수)
	private int globalNum;
	
	public void testMethod(int num) {//메소드영역의 시작
		//지역변수
		int localNum;
		
		System.out.println(num);
		
		//System.out.println(localNum);
		
		
		
		System.out.println(globalNum);
		
		
	}//메소드영역의 끝
	
	public void testMethod2() {
		//System.out.println(localNum);
		System.out.println(globalNum);
	}
	
	
	
	
	
	
	
}//클래스영역의 끝
