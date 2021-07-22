package com.poly.part01.test06;

import java.util.Scanner;

public class Circle extends AreaImpl {

	@Override
	public void make() {
		Scanner sc = new Scanner(System.in);
		System.out.println("반지름을 입력해 주세요");
		
		int r = sc.nextInt();
		
		double res = r*r*Math.PI;
		
		
		setResult(String.format("%.2f", res));
		
	}
	
	@Override
	public void print() {
		System.out.print("원의");
		super.print();
	}
	

}
