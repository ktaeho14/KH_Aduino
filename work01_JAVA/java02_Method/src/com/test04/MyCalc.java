package com.test04;

public class MyCalc {

	public void sum(int i, int j) {
		int res = i+j;
		System.out.println(res);
	}
	
	public int sub(int i, int j) {
		int res = i - j;
		return res;
	}
	
	
	public double mul(double i, double j) {
		double res = i * j;
		return res;
	}
	
	//정수 두개를 매개변수로 받아서, 나눈후의 몫과 나머지를 각각 구해 출력하는 메소드 div
	// '/' : 나눈 후의 몫
	// '%' : 나눈 후의 나머지
	public void div(int i,int  j) {
		int div1 = i/j;
		int div2 = i%j;
		System.out.println(i+" / "+j+"의 몫: " + div1);
		System.out.println(i+" / "+j+"의 나머지: " + div2);
	}
	
	
	
	
}
