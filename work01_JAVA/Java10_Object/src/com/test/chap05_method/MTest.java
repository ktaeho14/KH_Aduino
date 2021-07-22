package com.test.chap05_method;

public class MTest {

	public static void main(String[] args) {
		MethodTest test = new MethodTest();
		
		
		
		//1. 매개변수 없고 반환값 없는 메소드
		//1.
		test.method1();
		
		
		
		
		
		//2. 매개변수 없고 반환값이 있는 메소드
		//2.
		//String result = test.method2();
		//System.out.println(result);
		System.out.println( test.method2());
		
		
		//3. 매개변수가 있고 반환값이 없는 메소드
		//3.
		test.method3(10, 20);
		
		
		
		//4. 매개변수가 있고 반환값도 있는 메소드
		//4.
		int res = test.method4(10, 20);
		System.out.println("res: "+ res);
		//System.out.println("res: " + test.method4(10, 20));
	
	
		////////////////////////////
		//1.매개변수가 없고 리턴값이 없을때 static 메소드
		MethodTest2.sMethod1();
		
		
		//2.매개변수가 없고 리턴값이 있을때 static 메소드
		System.out.println("10과 20의 합은" + MethodTest2.sMethod2()+ " 입니다");
		
		
		//3.매개변수가 있고 리턴값이 없을때 static 메소드
		MethodTest2.sMethod3("sooho");
		
		
		//4.매개변수와 리턴값이 있을때 static 메소드
		System.out.println(MethodTest2.sMethod4("sooho"));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
