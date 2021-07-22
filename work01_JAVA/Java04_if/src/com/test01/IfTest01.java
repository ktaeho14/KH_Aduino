package com.test01;

import java.util.Scanner;

public class IfTest01 {
	//단독 if문
	//조건식의 결과값이 true면 { }안에 있는 코드를 실행,
	//조건식의 결과괎이 false면 { }안에 있는 코드를 무시.
	
	public void testIf() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력");
		int num = sc.nextInt();
	
		//짝수인지 조건을 확인함
		if(num%2 == 0) {
			//true 일때 수행
			System.out.println("입력하신 숫자는 짝수!!");
		} 
		
		//짝수가 아닌지 조건을 확인 한 후 
		//조건이 참이면"홀수입니다!"라고 출력
		if(num%2 != 0) {
			System.out.println("홀수 입니다!!");
		}
		System.out.println("메소드 종료");
	
	}





}
