package com.test01;

import java.util.Random;

public class DeArrayTest2 {

		public void test01() {
			//구구단을 2차원 배열에 넣어보자
			int[][] arr = new int[8][9];
			
			for(int i = 0;i< arr.length; i++ ) {
				System.out.println("======="+(i+2)+"=========");
				for(int j=0; j<arr[i].length; j++ ) {
					arr[i][j] = (i+2)*(j+1);
					System.out.println( (i+2) + " * " + (j+1) + " = " + arr[i][j] );
				
				
				
				
				}
			}
			
			
			
			
		}
//		- 메소드명 : public void munjae1()
//		 - 구현내용 : 
//		   1. 4행4열 2차원배열 선언 및 생성
//		   2. 0행0열부터 2행2열까지 1부터 100사이의 임의의 정수값 기록해 넣음
//		   3. 아래의 내용처럼 처리함
//		      0열   1열   2열   3열   
//		   0행   값  	 값 	  값    0행 값들의 합계
//		   1행   값 	 값 	  값   1행 값들의 합계
//		   2행   값  	 값  	 값   2행 값들의 합계
//		   3행   0열합계   1열합계   2열합계   가로+세로합계
//		
	
		public void munjae() {
			int[][] iarr = new int[4][4];
			
			
			//값기록
			for(int i =0; i<iarr.length-1; i++) {
				for(int j=0; j<iarr[i].length-1; j++) {
					iarr[i][j] = (int)(Math.random()*100) +1;
				}
			}
		
			
			
			//계산출력
			for(int i =0; i<iarr.length-1;i++) {
				for(int j =0; j<iarr.length-1; j++) {
					
					iarr[i][3] += iarr[i][j];
					iarr[3][i] += iarr[j][i];
					
					
				}
				iarr[3][3] += iarr[i][3]+iarr[3][i];
			}
			
			
			
			
			
			
			
			//출력
			for(int i=0;i<iarr.length;i++) {
				for(int j=0; j<iarr.length; j++) {
					System.out.print(iarr[i][j] + "\t");
				}
				System.out.println();
				
				
			}
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
}
		
		
		
		
		
		/*	
		public void munjae1() {
		int[][] arr = new int[4][4];
		
		for(int i =0;i<arr.length-1; i++) {
			for(int j=0; j<arr[i].length-1; j++) {
				arr[i][j] =(int)(Math.random()*100)-1;
				System.out.print("\t" + arr[i][j]);
				
				
			}System.out.println();
		
			}
		
		}
}
		*/
		
		
		
		
		
		
		/*
		munjaeprn(arr);
		
		}
		
		public  void munjaeprn(int[][] arr) {
			for(int i=0; i<arr.length; i++) {
				for(int j =0;j<arr[i].length; j++) {
					System.out.print("\t"+arr[i][j]);
				
				
				
				
				}System.out.println("\n");
			}
		}
		
}
*/