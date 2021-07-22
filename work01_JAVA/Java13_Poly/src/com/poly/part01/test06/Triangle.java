package com.poly.part01.test06;

import java.util.Scanner;

public class Triangle extends AreaImpl {

	@Override
	public void make() {
		Scanner sc = new Scanner(System.in);
		System.out.println("밑변을 입력: ");
		int x = sc.nextInt();
		
		System.out.println("높이를 입력: ");
		int h = sc.nextInt();
		
		double res = (double)x * h /2;
		
		super.setResult(String.format("삼각형의 %.2f", res));
		
	}
	

}
