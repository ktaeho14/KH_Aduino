package com.test01;

public class Operator01 {
	public static void main(String[] args) {
		//static Method 호출
		// 클래스명.메소드명();
		//Operator01.testMethod();
		Operator01.testMethod2();
	}
	// !논리값 :  논리값을 반대로 바꾸는 연산자
	// !true => false, !false => true
	
	public static void testMethod() {
		System.out.println("true의 부정: " + !true);
		System.out.println("false의 부정: " + !false);
	
	
		boolean flag =true;
		System.out.println("flag의 부정: " + !flag);
		System.out.println("flag: " + flag);
	
	}
	
	//증감연산자: 전위,후위
	//++ : 1증가,		++값, 값++ 로 사용
	//-- : 1감소		--값, 값-- 로 사용
	public static void testMethod2() {
		int age = 20;
		
		System.out.println("현재 나이는?: " + age);
		
		++age;
		System.out.println("++age의 결과는?" + age);
		
		age++;
		System.out.println("age++의 결과는?" + age);
		
		--age;
		System.out.println("--의 결과는?" + age);
		
		age--;
		System.out.println("age--의 결과는?" + age);
	
		System.out.println("=================");
		
		int num1 = 20;
		
		int res = num1++ *3;
		//res의 num1의 값을 확인
		
		System.out.println(res+":"+num1);
		
		int num2 = 20;
		
		int res2 = ++num2 *3;
		
		System.out.println(res2+":"+num2);
		
	}
	
	
	
	
	
	
}
