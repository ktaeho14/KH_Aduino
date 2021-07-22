package com.arrayPractice1.sample;

public class ArraySample {

	public void test1() {
		
		int[] irr = new int[10];
		int a = 0;
		
		
		for(int i=0; i<irr.length; i++) {
			irr[i] = (int)(Math.random()*100)+1;
			a += irr[i];
			
		}System.out.println(a);
		
	
		
		
	}
	
	public void test2() {
		
		int[] irr = new int[10];
		for(int i =0; i<irr.length; i++) {
		irr[i] = (int)(Math.random()*100)+1;
		
		
		
		}
		
		
	}
	
}
