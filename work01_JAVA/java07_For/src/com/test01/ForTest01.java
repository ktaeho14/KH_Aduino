package com.test01;

import java.util.Scanner;

public class ForTest01 {
	public static void main(String[] args) {
		//ForTest01.testFor();
		//ForTest01.testFor2();
		//ForTest01.testFor3();
		//ForTest01.testFor4();
		//ForTest01.testFor5();
		//ForTest01.testFor6();
	}
	
	public static void testFor() {
		//0~10출력 for(초기식; 조건식; 증감식){}
		for(int i=0; i<=10; i++) {
			System.out.println(i);
		}
	}
	
	
	public static void testFor2() {
		//역순
		
		for(int i = 100; i>=1; i--) {
			
			if(i%10 == 0) {
			System.out.println();
		}
			System.out.print(i+" ");
	}
}
	
	public static void testFor3() {
		//증감식은 반드시 1씩 증감할 필요 없음
		for(int i = 1; i<10; i+=2) {
			System.out.println(i);
		}
		
		//초기식과 증감식은 1개 이상 기입 가능
		for(int i=0,j=10; i<10 && j>0; i++,j--) {
			System.out.println(i+" : " + j);
		}
		//int가 아닌 char를 활용하면?
		for(char ch= 'a'; ch<='z'; ch++) {
			System.out.println(ch);
		}
		
	
	}
	
	
	
	public static void testFor4() {
		//정수 하나를 입력 받아 그 수가 양수 일때만 그 수의 구구단을 출력
		//양수가 아니면 "반드시 1~9 사이의  양수를 입력하세요!" 출력
		System.out.print("정수하나를 입력[1~9]");
	
		int dan = new Scanner(System.in).nextInt();
		
		if(dan >=1 && dan<=9) {
			for(int i = 1; i<10; i++) {
				System.out.println(dan + " * " +  i + " = " + (dan*i));
			}
			
			
		}else {
			System.out.println("반드시 1~9사이의 양수를 입력하세요!");
		}
		
	
		
		
		
		
		
	}
	public static void testFor5(){
	//1부터 100사이의 숫자 중 임의의 난수를 구해
	//1~난수까지의 합계를 구하여 출력
	int random = (int)(Math.random()*100)+1;	
		
	int sum = 0;
	for(int i =1; i<=random; i++) {
		sum += i;
		
		}
	System.out.println("1부터 " + random + "까지 정수들의 합계" + sum);
	
	}
	
	/*public static void testFor6() {
		//정수 두개 입력 후
		//작은수 ~ 큰수 까지의 합
		System.out.println("두개의 정수를 입력");
		
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		
		int sum = 0;
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a>b) {
			for(;a>b;b++) {
				sum += a+b;
			}
			System.out.println("a가 b보다 클경우"+ sum);
		}else {
			for(;a<b;a++) {
				sum += a+b;
				
			}
		}System.out.println("b가a보다 클경우"+sum);
		
		
	}
	*/
	public static void testFor6() {
		//정수 두개 입력 후
		//작은수 ~ 큰수 까지의 합
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수: ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수: ");
		int num2 = sc.nextInt();
		
		int sum = 0, max, min;
		
		
		
		if(num1>num2) {
			max = num1;
			min = num2;
		}else {
			max = num2;
			min = num1;
		}
		
		for(int i=min; i<=max; i++) {
			sum += i;
		}System.out.println(min + "에서" + max + "까지의 정수들의 합 : " + sum);
		
		
		
		
		
		
		
		
		
	}
	
}