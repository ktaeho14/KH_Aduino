package com.chap01_runtime;

import java.util.Scanner;

public class RunException {
	Scanner sc = new Scanner(System.in);
	
	
	
	
	//ArithmeticException 예시 (if문을 사용하여 처리) --0으로 나눴을경우 생기는 예외
	public void ArithEx() {
		int ran =0;
		double result = 0.0;
		
		System.out.println("정수 하나 입력: "); //제수: 나누는 수, 피제수: 나눠지는 수
		int inputNum = sc.nextInt();
		
		if(inputNum == 0) {
			System.out.println("0을 입력하였습니다. 계산이 불가능 합니다.");
		}else {
			ran = (int)(Math.random()*10)+1;
			result = ran/ (double)inputNum;
			System.out.println(ran+ " / " + inputNum + " = " +result);
		
		}		
	
	
	
	//try - catch로 처리
		
//		try {
//			ran = (int)(Math.random()*10)+1;
//			result = ran/ (double)inputNum;
//	
//			
//			System.out.printf("%d / %d = %.2f\n", ran,inputNum,result);
//		
//			
//		}catch(ArithmeticException e) {
//			System.out.println("예외 발생!!!");
//		}
	
	
	
	
	}
	
/*	public void ClassNArrayEx() {
		//ClassCastException 형변환시 생기는 예외
		
		
		
		
		
		
		Object obj = 'a'; //char로 변경이되고 다형성을 이용하여 Object class의 obj안에 들어간다
		System.out.println(obj);
		String str = (String)obj; //String으로 강제형변환
		//java.lang.Character cannot be cast to java.lang.String 라는 오류가 나왔고
		//Character는 String 으로 형변환을 할 수 없다라는 의미이다.
		//at com.chap01_runtime.RunException.ClassNArrayEx(RunException.java:53)
		//at com.chap01_runtime.MTest.main(MTest.java:9)
		//ClassNArrayEx메소드의 53번째줄이 에러가났기때문에 MTest에서도 오류가 이어졌다. 
		
		System.out.println(obj);
		
		
	}
	*/
	
	public void ClassNArrayEx() {
		try {
			//ClassCast	Exception 	catch~try를 사용
//			Object obj = 'a';
//			System.out.println(obj);
//			String str = (String)obj;
//			System.out.println(str);
			
			//Arithmetic Exception 	catch~try를 사용
//			int no1 = 10;
//			int no2 = 0;
//			System.out.println(no1/no2);
		
			//Nullpointer 	Exception
//			String str = null;
//			int length = str.length();
		
//			ArrayIndexOutOfBounds Exception
			int[] arr = new int[2];
			arr[0] = 1;
			arr[1] = 2;
			
			arr[2] = 3;
			System.out.println("출력????");
			
			
//		}catch(ClassCastException e) {
//		//System.out.println("예외발생");
//			e.printStackTrace();
//		}catch(ArithmeticException e1) {
//			System.out.println("예외발생1");
//			e1.printStackTrace();
//		}catch(NullPointerException e2) {
//			System.out.println("예외발생2");
//			e2.printStackTrace();
//		}catch(ArrayIndexOutOfBoundsException e3) {
//			System.out.println("예외발생3");
//			e3.printStackTrace();
//		}
		
		}catch(ClassCastException | ArrayIndexOutOfBoundsException 
				| NullPointerException | ArithmeticException e) {
			System.out.println("예외발생함.");
			e.printStackTrace();
		}finally {
			System.out.println("무조건 마지막에 실행!!");
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
