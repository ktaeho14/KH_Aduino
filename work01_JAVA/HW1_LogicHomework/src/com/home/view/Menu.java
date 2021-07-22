package com.home.view;

import java.util.Scanner;

import com.home.controller.Function;

public class Menu {
	public static void displayMenu() {
		Function fu = new Function();
		
		Scanner sc = new Scanner(System.in);
		
		
		
		do {
			System.out.println("1.간단 계산기");
			System.out.println("2.작은수에서 큰수까지 합계구하기");
			System.out.println("3.신상정보 확인하기");
			System.out.println("4.학생정보 확인하기");
			System.out.println("5.별과 숫자 출력하기");
			System.out.println("6.난수까지의 합계 구하기");
			System.out.println("7.구구단");
			System.out.println("8.주사위 숫자 알아맞추기 게임");
			System.out.println("9.프로그램 종료");
			int num1 = sc.nextInt();
			
			switch(num1) {
			case 1: fu.calculator();
			break;
			
			case 2: fu.totalCalculator();
			break;
			
			case 3: fu.profile();
			break;
			
			case 4: fu.sungjuk();
			break;
			
			case 5: fu.printStarNumber();
			break;
			
			case 6: fu.sumRandomNumber();
			break;
			
			case 7: fu.continueGugudan();
			break;
			
			case 8: fu.shutNumber();
			break;
			
			
			
			
			}
			
			if(num1 ==9) {
				break;
			}
		
		
		}while(true);
		
			
		
		
		
		
		
	}
}
