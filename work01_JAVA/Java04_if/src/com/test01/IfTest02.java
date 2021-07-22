package com.test01;

import java.util.Scanner;

public class IfTest02 {
	//if else문
	//둘 중 한개를 선택하는 조건문,
	//조건이 참인 경우와 거짓인 경우 수행하는 명령을 따로 작성
	
	
	public void test() {
		int i = 21;
		
		if(i%2 == 0) {
			//조건이 참일 때 수행할 구문
			System.out.println(i+"는 짝수다!");
		}else{
			//조건이 거짓일 때 수행할 구문
			System.out.println(i+"는 홀수다!");
		}
		
	}
	
	public void test2() {
		//키보드로 정수 하나를 입력 받아
		//50보다 큰수라면,짝수인지 홀수인지 출력 "50보다 큰 수"
		//50보다 작으면 "50보다 작은 수"라고 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("0보다  큰 정수 입력");
		
		int no = sc.nextInt();
		
		if(no>=50) {
			if(no%2 == 0) {
				System.out.println("50보다 큰 짝수");
			}else {
				System.out.println("50보다 큰 홀수");
			}
		}else {
			System.out.println("50보다 작은 수");
		}
		
	}
	
	public void test3() {
		//숫자를 하나 입력 받아 양수인지 음수인지 출력
		//단, 0이면 "0입니다"라고 출력
		
		//선생님이 푼거
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		
		int num = sc.nextInt();
		
		if(num == 0) {
			System.out.println("0입니다");
		}else {
			if(num>0) {
				System.out.println("양수입니다");
			}else {
				System.out.println("음수입니다");
			}
		}
		/* 내가푼거
		 
		if(num>0) {
			System.out.println("양수입니다");
		}if(num==0){
			System.out.println("0입니다");
		}else if(num<0) {
			System.out.println("음수입니다");
		}
		*/
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
