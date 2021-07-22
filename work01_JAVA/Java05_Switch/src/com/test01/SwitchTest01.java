package com.test01;

import java.util.Scanner;

public class SwitchTest01 {
	public void test() {
		
		int i=2;
		
		switch(i) {
		case 1:
			System.out.println("1입니다");
			break;
			
		case 2:
			System.out.println("2입니다");
			break;
			
		case 3:
			System.out.println("3입니다");
			break;
			
		default:
			System.out.println("1,2,3 모두 아닙니다, 다른 숫자입니다");
			
			
			
		}
		
	}


	public void test2() {
		char ch = 'f';
		
		switch(ch) {
		
		case 'a':
			System.out.println("a입니다");
			
			break;
		case 'b':
			System.out.println("b입니다");
			break;
		
		case 'c':
			System.out.println("c입니다");
			break;
			default:
				System.out.println("아무것도 아닙니다.");
		}
		
	}
	
	
	public void test3() {
		int i = 1;
		
		
		switch(i) {
		
		case 1:
		case 3:
			System.out.println("홀수입니다");
			break;
		case 4:
			System.out.println("4입니다");
		case 2:
			System.out.println("짝수입니다");
			break;
		default:
			System.out.println("다른 숫자 입니다");
		}
	}

	
	
	
		public void test4() {
			String s = "한국";
			
			switch(s) {
			
			
			case "한국":
				System.out.println("korea");
			
				break;
			
			case "영국":
				System.out.println("UK");
			
				break;
			
			case "미국":
				System.out.println("USA");
				break;
				
			default:
				System.out.println("다른 나라 입니다");
			
			
			
			
			}
			
			
			
		}
	
	public void test5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월 입력");
		int month = sc.nextInt();
		
		
		switch(month) {
		
		case 1:	
		case 2:
		case 12:
			System.out.println("겨울");
			break;
			
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
			
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
			
		default:
			System.out.println("해당 하는 계절이 없습니다");
	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
