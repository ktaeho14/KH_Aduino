package com.test02;



public class Test {
	public void test01(int num) {
		//1. 입력 받은 수가 5의 배수이면 " 5의 배수입니다."를 출력하자
		
		
		
		if(num%5 == 0) {
			System.out.println("5의 배수입니다");
		}
		
		
		
		
	}
	
	public void test02(int num) {
		//2. 입력받은 수가 2의 배수이면서 3의 배수이면 "2와 3의 배수입니다."를 출력
		//	   아니라면, "2와 3의 배수가 아닙니다."를 출력하자.
		
				
		
		
		if( (num%2 ==0) && (num%3 == 0) ) {
			System.out.println("2와 3의 배수 입니다");
		}else {
			System.out.println("2와 3의 배수가 아닙니다");
		}
		
		
	}
	
	public void test03(char a) {
		//3. 입력받은 문자가 소문자라면 "소문자입니다.", "대문자라면 "대문자입니다."를 출력하자
		// Charater class 에서 메소드 사용 
		
		if(Character.isUpperCase(a)){
			System.out.println("대문자 입니다.");
		}else if(Character.isLowerCase(a)) {
				System.out.println("소문자입니다");
			
		}
		
		
		
		
		
		
		
	}
	
}
