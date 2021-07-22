package com.home.controller;

import java.util.Scanner;

public class Function {
//메뉴에서 실행시킬 메소드들을 작성함 : 모두 non-static 메소드로 작성할 것
//	=> 키보드 입력을 위한 Scanner 클래스에 대한 레퍼런스 변수를 필드로 선언함
	public void calculator() {
		System.out.println("정수 두 개와 연산문자 한개를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int num1 =sc.nextInt();
		int num2 =sc.nextInt();
		char ch = sc.next().charAt(0);
		
		switch(ch) {
		
		case '+':
			System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
			break;
		case '-':
			System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
			break;
		case 'X':
		case 'x' :
			System.out.println(num1 + "*" + num2 + "=" + (num1*num2));
			break;
		
		case '/' :
			System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
			if(num2==0) {
				System.out.println("0으로 나눌 수 없습니다");
			}
			break;
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
	
	}
	
	public void totalCalculator() {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 두개를 입력하세요");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int sum1 = 0;
		
		if(num2>=num1) {
		for(int i = num1; i<=num2; i++) {
			sum1 += i;
			System.out.print(i+"+");
		}
		System.out.println("\n"+num1+"에서"+num2+"까지의 합계"+"="+sum1);
			
		}else if(num1>=num2) {
			for(int j=num2; j<=num1; j++) {
				sum1 += j;
				System.out.print(j+"+");
			}System.out.println("\n"+num2+"에서"+num1+"까지의 합계"+"="+sum1);
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	/*public void totalCalculator() {
		System.out.println("정수 두개를 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int sum = 0;
		
		if(num2<num1){
		for(int i = 0; i<=num1; i++) {
			sum += i;
			}
		}else if(num1<num2) {
			for(int i = 0; i<=num2; i++) {
				sum += i;
		}
	}
		System.out.println(sum);
		
		
		
		
		
		
		
		
	}
	*/
	public void profile() {
		String name = "홍길동";
		
		int age = 26;
		
		String sex = "남자";
		
		String per = "고집불통";
		
		System.out.println("이름: "  + name);
		
		System.out.println("나이: " + age);
		
		System.out.println("성별 : " + sex);
		
		System.out.println("성격: " + per);
	}
	
	
	public void sungjuk() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름, 학년, 반, 번호, 성별(M or F) 학점을 순서대로입력해주세요");
		
		String name = sc.nextLine();	//이름
		int sy = sc.nextInt();	//학년
		int cl = sc.nextInt();	//반
		int num = sc.nextInt();	//번호
		String sex2 = sc.next();	//성별
		double gr = sc.nextDouble();	//성적
		char cr = ' '; 	//학점
		String gr2 = String.format("%.2f", gr);
		
		String m = "남학생";
		String f = "여학생";
		
				
		String sex = (sex2.charAt(0)== 'M' ? m  : f  );
		
		
		
		if(gr>=90.00) {
			cr='A';
		}else if(gr>=80 && gr<90) {
			cr='B';
		}else if(gr>=70 && gr<80) {
			cr='C';
		}else if(gr>=60 && gr<70) {
			cr='D';
		}else {
			cr='F';
		}
		
		System.out.printf(sy+"학년 "+cl+"반 "+num+"번 "+ sex+""+name+"의 점수는 "+gr2+"이고, "+ cr+"학점입니다.");
		
		
		
		
		
	}
	
	
	public void printStarNumber() {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num<0) {
			System.out.println("양수가 아닙니다");
		}
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				if(i==j) {
					System.out.print(i+1);
				}else if(i>j) {
					System.out.print("*");
				}
			}System.out.println();
		}
		
		
		
	}
	
	public void sumRandomNumber() {
		int sum = 0;
		int num2 = (int)(Math.random()*100)+1;
		System.out.println("발생한 난수" + num2);
		for(int i=0; i<num2; i++) {
			sum += i;
			System.out.println("1~발생한난수까지의 값 합산"+sum);
		}
	}
	
	
	public void continueGugudan() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원하는 숫자를 입력해주세요");
		
		int num = sc.nextInt();
		
		if(num>0) {
			for(int i=2;i<=num;i++) {
				for(int j=1;j<9;j++) {
					if(num==i) {
						System.out.println(i+"*"+j+"="+(i*j));
					
						continue;
					}
				}
			}
		}else {
			System.out.println("양수가 아닙니다");
		}
		
		
		
		
	}
	
	public void shutNumber() {
		Scanner sc = new Scanner(System.in);
		
		
		
		int num1 =0;
		int num2 =0;
		
		int sum2 = 0;
		char ch =' '; 		
		do {
			System.out.println("두 주사위의 합을 예상한 값을 입력하세요: ");
			sum2 =sc.nextInt();
			num1 = (int)(Math.random()*6)+1;
			num2 = (int)(Math.random()*6)+1;
			int sum = num1 + num2;
			System.out.println("첫번째 주사위: "+ num1);
			System.out.println("두번째 주사위: " +num2);
			
			if(sum==sum2) {
				System.out.println("맞췄습니다");
				System.out.println("계속 하시겠습니까?(y/n): ");
				ch = sc.next().charAt(0);
				if(ch=='n') {
					System.out.println("프로그램을 종료합니다");
						break;
				}else if(ch=='N') {
					System.out.println("프로그램을 종료합니다");
					break;
				}
			}else {
				System.out.println("틀렸습니다");
			
			}
			
			
			
			
		}while(true);
		
	}
	
}
