package com.test01;

import java.util.Scanner;

public class ForTest02 {
	public static void main(String[] args) {
		//ForTest02.testFor1();
		ForTest02.testFor2();
		//ForTest02.testFor3();
		//ForTest02.testFor4();
		//ForTest02.testFor5();
	}
	
	public static void testFor1() {
		for(int i=0; i<10; i++) {
			System.out.println("반복" + i);
			
			for(int j=0; j<10 ;j++ ) {
				System.out.println("i: " + i +", j: " + j);
			}
			System.out.println();
			
		}
		
		
		
	}
	
	public static void testFor2() {
		//구구단을 2단부터 9단까지 출력
		
		for(int dan =2; dan<10; dan++) {
			System.out.println(dan+"단");
		
			for(int su =1; su<10; su++) {
				System.out.println(dan+" * " +su +" =" + (dan*su));
			}System.out.println();
		
		
		}
	}
	

	public static void testFor3() {
	/*
	 	*****
	 	*****
	 	*****
	 */
		for(int i=0; i<3; i++) {
			
			for(int j=0; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		//
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇줄? ");
		int row = sc.nextInt();
		System.out.println("몇칸? ");
		int col = sc.nextInt();
	
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print("^");
			}
			System.out.println();
		}
		
		
	
	}
	
	public static void testFor4() {
		//한 줄에 별표 문자를 입력된 줄수와 칸수만큼 출력
		/*
		 *  1**** 0,0
		 *  *2*** 1,1
		 *  **3** 2,2
		 *  ***4* 3,3
		 *  ****5 4,4
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("줄 수를 입력하세요");
		int a = sc.nextInt();
		System.out.println("칸 수를 입력하세요");
		int b = sc.nextInt();
		
		for(int i =0; i<a; i++) {
			for(int  j = 0; j<b; j++) {
				if(i==j) {
					System.out.print(i+1);
				}else {
					System.out.print("*");
				}
				
				
			}
			System.out.println();
		}
		
		
	}
	
	public static void testFor5() {
		//한 줄에 별표 문자를 입력된 줄수와 칸수만큼 출력
		/*
		 *  1**** 0,0
		 *  *2*** 1,1
		 *  **3** 2,2
		 *  ***4* 3,3
		 *  ****5 4,4
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("줄 수를 입력하세요");
		int a = sc.nextInt();
		System.out.println("칸 수를 입력하세요");
		int b = sc.nextInt();
		
		if(a<0) {
			System.out.println("양수가 아닙니다");
			
		}else if(b<0) {
			System.out.println("양수가 아닙니다");
		}else {
		for(int i =0; i<a; i++) {
			for(int  j = 0; j<b; j++) {
				if(i==j) {
					System.out.print(i+1);
				}else if(i>j) {
					System.out.print("*");
				}
				
			}System.out.println();
			}
			
		}
		
		
	}
}
	
	
	

