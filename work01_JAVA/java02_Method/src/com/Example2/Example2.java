package com.Example2;

import java.util.Scanner;

public class Example2 {

		public void example4() {
			
			System.out.println("두 수의 정수를 입력하세요");
			Scanner sc = new Scanner(System.in);
			int no3 = sc.nextInt();
			int no4 = sc.nextInt();
			
			System.out.println("두 수의 합: "+(no3+no4));
			System.out.println("두 수의 차: "+(no3-no4));
			System.out.println("두 수의 곱: "+(no3*no4));
			System.out.println("두 수의 몫: "+(no3/no4));
			System.out.println("두 수의 나머지: "+(no3%no4));
			
		}
		
		public void example5() {
		
		System.out.println("두 실수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		double no5 = sc.nextDouble();
		double no6 = sc.nextDouble();
		
		
		System.out.println("면적: "+(no5*no6));
		System.out.println("둘레: "+(no5+no6)*2);
		
			
			
		}
		
		public void example6() {
			System.out.println("문자열을 입력하세요");
			Scanner sc = new Scanner(System.in);
			String str = sc.next();
			
			System.out.println("첫번째 문자: " +str.charAt(0));
			System.out.println("두번째 문자: " +str.charAt(1));
			System.out.println("세번째 문자: "+str.charAt(2));
		}
		
		
		
}
