package com.test01;

import java.util.Arrays;

public class WhileTest03 {

		public static void main(String[] args) {
			//1. 1~100 까지의 숫자를 역순으로 출력.
			//WhileTest03.prn01();
			
			//2. 1~100 까지의 숫자중, 2의 배수만 출력
			//WhileTest03.prn02();
			
			//3. 1~100까지의 숫자 중 , 7의 배수의 갯수와 총 합을 출력.
			WhileTest03.prn03();
			
			
		}
		
		
		
		public static void prn01() {
			//1. 1~100 까지의 숫자를 역순으로 출력.
			int num = 100;
			
			while(num>0) {
				System.out.println("1~100의 숫자를역순으로 출력: " + num);
				num--;
			}
		
		}
		
		
		
		
		
		
		public static void prn02() {
			//2. 1~100 까지의 숫자중, 2의 배수만 출력
			int num = 0;
			
			
			while(num<100) {
				num++;
				if((num%2)==0) {
					System.out.println("1~100중 2의 배수 출력: " + num);
					
					
					
				}
			}
			
			
			
			
			
			
		}
		
		
		
		
		
		public static void prn03() {
			//3. 1~100까지의 숫자 중 , 7의 배수의 갯수와 총 합을 출력.
			int num = 1;
			
			int cnt = 0;
			int sum= 0;
			
			while(num<=100) {
				if(num%7==0) {
					System.out.println(num+ " ");
					cnt++;
					sum+=num;
					
				}
				num++;
			}
			System.out.println();
			System.out.println(cnt + " : " + sum);
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
}
