package com.silsub1;

import java.util.Scanner;

public class example {

	public void printStar1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 한개를 입력하세요");
		
		int a = sc.nextInt();
		
		for(int i=0; i<a; i++) {
			
			for(int j=0; j<a; j++) {
				
				if(i==j && i>0 && j>0) {
					System.out.println(i+1);
				}
			}
		}
		
	}
	
	
	
	
}
