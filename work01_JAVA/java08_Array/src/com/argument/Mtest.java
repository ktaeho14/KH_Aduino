package com.argument;

public class Mtest {

	public static void main(String[] args) {
		//main의 매개변수 args로 값 전달 확인
		System.out.println("전달값 갯수: " + args.length);
		
		for(int i = 0;i<args.length; i++) {
			System.out.println(i+ "번째 값: " + args[i]);
		}
		
		System.out.println(args[0] + args[1]);
		
		//parsing : 기본자료형으로 변경
		//문자열->숫자
		int no1 = Integer.parseInt(args[0]);
		int no2 = Integer.parseInt(args[1]);
		
		System.out.println(no1+no2);
		
		System.out.println(Double.parseDouble(args[0]));
		
		
	}
	
	
	

}
