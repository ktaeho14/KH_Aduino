package com.silsub2.practice;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		Practice pr = new Practice();
		pr.printStar2();
	}

	
	public void printStar() {
		System.out.println("정수하나 입력:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i=0; i<a; i++) {
			for(int j =0; j<a; j++) {
				if(i==j) {
					System.out.print(j+1);
				}else if(i>j){
					System.out.print("*");
				}
			}
			System.out.println();
			
		}
		
		
	}
	
	public void printStar2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력줄: ");
		int a = sc.nextInt();
		System.out.println("입력칸: ");
		int b = sc.nextInt();
		
		
		for(int i=0; i<a; i++) {
			for(int j=0; j<b; j++) {
				if(i==j) {
					System.out.print(i+1);
					
				}else if(i>j) {
					System.out.print("*");
				}
				
				
			}
			System.out.println();
		}
		
		
	}
	
	
}
