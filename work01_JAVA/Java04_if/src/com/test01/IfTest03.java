package com.test01;

import java.util.Scanner;

public class IfTest03 {
	//else if 다중 조건을 줄 수 있는 문법
	
	
	public void test() {
		int i = 30;
		int j = 20;
		
		if(i>j) {
			System.out.println(i + "는" + j + "보다 큽니다.");
		}else if(i==j) {
			System.out.println(i + "는" + j + "와 같습니다.");
		}else {
			System.out.println(i + "는" + j + "보다 작습니다.");
		}
		
	}
	
	public void test2() {
	//점수 하나 입력 받아 등급을 나누어 점수와 등급을 출력하시오.
		//등급은 90점 이상은 A 등급
		//90점 미만 80점 이상은 B등급
		//80점 미만 70점 이상은 C 등급
		//70점 미만 60점 이상은 D 등급
		//60점 미만은 F 등급으로 나눈다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		
		int score = sc.nextInt();
		String grade = "";
		
		/*
		if(score>=90) {
			System.out.println(score + ": A등급");
		}else if(score>=80) {
			System.out.println(score + ": B등급");
		}else if(score>=70) {
			System.out.println(score + ": C등급");
		}else if(score>=60) {
			System.out.println(score + ": D등급");
		}else {
			System.out.println(score + ": F등급");
		}
		*/
		
		if(score>=90) {
			grade = "A";
		}else if(score < 90 && score >= 80) {
			grade = "B";
		}else if(score < 80 && score >= 80) {
			grade = "C";
		}else if(score < 70 && score >= 60) {
			grade = "D";
		}else {
			grade = "F";
		}
		
		System.out.printf("당신의 점수는%d 이고, 등급은%s입니다.", score,grade);
		System.out.println("테스트~~~");
		//printf("%형식",값);
		
		//포맷문자
		//%d: 정수
		//%o: 8진수
		//%x: 16진수
		//%f: 실수
		//%c: 문자
		//%s: 문자열
		//%b: 논리형
		
		//5d: 5칸을 확보하고 오른쪽 정렬
		//-5d: 5칸을 확보하고 왼쪽 정렬
		
		//특수문자
		//tap: \t
		//new line: \n
		//작음따옴표: \'
		//큰따옴표: \"
		//역슬래쉬: \\
	}
	
	public void test3() {
		//test2에서 등급별 중간 점수 이상의 경우에는
		//등급에 "+"라는 문자를 추가하여 출력하세요
		//예) 95점 이상은 등급이 A+ 출력 되게 함
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		
		int score = sc.nextInt();
		String grade = "";
	
		if(score>=90) {
			grade = "A";
			if(score>=95) {
				grade += "+";
			}
		}else if(score < 90 && score >= 80) {
			grade = "B";
			if(score>=85) {
				grade += "+";
			}
		}else if(score < 80 && score >= 70) {
			grade = "C";
			if(score>75) {
				grade += "+";
			}
		}else if(score < 70 && score >= 60) {
			grade += "D";
			if(score>=65) {
				grade += "+";
			}
		}else {
			grade = "F";
		}
		
		System.out.printf("당신의 점수는%d 이고, 등급은%s입니다.", score,grade);
		
		
		
		
	}
	
	
	
	
	
	
	
}
