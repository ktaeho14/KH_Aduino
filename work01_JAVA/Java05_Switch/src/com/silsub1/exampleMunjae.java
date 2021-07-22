package com.silsub1;


import java.util.Scanner;

public class exampleMunjae {

		public void test1() {
		Scanner sc = new Scanner(System.in);	
			
		System.out.println("국어, 영어, 수학 점수를 입력하세요");
		
			int kor = sc.nextInt();
			int eng = sc.nextInt();
			int math = sc.nextInt();
			
			int sum = kor+eng+math;
			System.out.println("국어,영어,수학 점수 합계: " + sum);
			
			
			int avg = sum/3;
			System.out.println("3과목의 평균점수: " + avg);
			
			if(avg>=60) {
				if(kor>=40) {
					if(eng>=40) {
						if(math>=40) {
							System.out.println("합격    " +"국어: "+kor+ "영어: "+eng +"수학: "+math + "합계: "+sum+"평균: " + avg);
										}else {
									System.out.println("불합격");
								}
							}else {
							System.out.println("불합격");
						}
					}else {
						System.out.println("불합격");
				}
			}else {
				System.out.println("불합격");
	}
			
}
		
		public void test2() {
			Scanner sc = new Scanner(System.in);
			
			while(true) {
			
			System.out.println("원하시는 번호를 입력해주세요");
			System.out.println("***초기 메뉴***");
			System.out.println("1. 입력");
			System.out.println("2. 수정");
			System.out.println("3. 조회");
			System.out.println("4. 삭제");
			System.out.println("7. 종료");
		
			int st = sc.nextInt();
			
			switch(st) {
			case 1: 
				System.out.println("입력메뉴가 선택되었습니다");
			break;
			
			case 2:
				System.out.println("수정메뉴가 선택되었습니다");
			break;
			
			case 3:
				System.out.println("조회메뉴가 선택되었습니다");
			break;
			
			case 4:
				System.out.println("삭제메뉴가 선택되었습니다");
			break;
			
			case 7:
				System.out.println("프로그램이 종료됩니다");
			return;
			
			default:
				System.out.println("번호가 잘못 입력되었습니다."  +"\n다시 입력하십시오");
		
				}
			
			}
		
		}
		public void test3() {
			Scanner sc = new Scanner(System.in);
	
			System.out.println("숫자 한 개를 입력하세요: ");
			int num = sc.nextInt();
			
			if(num>0) {
				System.out.println("양수다");
			}else {
				System.out.println("양수가 아니다");
			}
			
		}
		
		public void test4() {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("정수를 한 개를 입력하세요: ");
			
			int num = sc.nextInt();
			String str = "짝수다";			
			String str2 = "홀수다";
			
			
			if(num>0 && num%2==0) {
				System.out.println(str);
			}else {
				System.out.println(str2);
			}
			
			
			
		}
		
		public void test5() {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("이름: " + "나이: " + "키: " +"를 입력하세요");
			
			
			String name = sc.next();
			int age = sc.nextInt();
			double hei = sc.nextDouble();
			
			if(name!=null && name.length()>0) {
				
			}if(age>0) {
				
			}if(hei>0) {
				System.out.println(name + "의 나이는" + age + "이 고, 키는" + hei + "cm이다.");
			}else {
				System.out.println();
			}
			
			
			
			
		}
		
		public void test6() {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("두 개의 정수를 입력하세요");
			
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
		
			
			int num3 = num1 + num2;
			int num4 = num1 - num2;
			int num5 = num1 * num2;
			int num6 = num1 / num2;
			int num7 = num1 % num2;
			
			
		System.out.println("첫번쨰 정수: " + num1);
		System.out.println("두번쨰 정수: " + num2);
			
		
		if(num1>0 && num2>0) {
			System.out.println(num1+ " + " + num2 + " = " + num3);
		}		 if(num1>0 && num2>0) {
			System.out.println(num1 + " - " + num2 + " = " + num4);
				}if(num1>0 && num2>0) {
			System.out.println(num1 + " * " + num2 + " = " + num5);
				}if(num1>0 && num2>0) {
			System.out.println(num1 + " / " + num2 + " = " + num6);					
				}if(num1>0 && num2>0) {
			System.out.println(num1 + " % " + num2 + " = " + num7);		
				}
			
		}
		public void test7() {
			Scanner sc = new Scanner(System.in);
			System.out.println("점수를 입력하세요");
			
			int score = sc.nextInt();
			
			String grade = "ABCDF";
			
			if(score>=90) {
				System.out.println("점수: " + score + "학점" + grade.charAt(0));
			} if(score>=80 && score<90) {
				System.out.println("점수: " + score + "학점" + grade.charAt(1));
			} if(score>=70 && score<80) {
				System.out.println("점수: " + score + "학점" + grade.charAt(2));
			} if(score>=60 && score<70) {
				System.out.println("점수: " + score + "학점" + grade.charAt(3));
			} else if(score<60)  {
				System.out.println("점수: " + score + "학점" + grade.charAt(4));
			}
			
			
		
		
		
		}
		
		public double test8(double b) {
			
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b1 = (int)b;
			System.out.println(a+b1);
			
			return b;
			
		}
}
