package com.chap04_wrapperClass;

public class Run {
	//boxing	: 기본자료형 + String을 Wrapper 클래스로 바꾸는법
	//unboxing	: Wrapper 클래스  -> 기본자료형
	public static void main(String[] args) {
		
		//Boxing
		Integer i = new Integer(10);
		Integer i2 = new Integer(15);
		Double d = new Double(10.0);
		
		System.out.println(i.equals(i2));
		System.out.println(i.compareTo(i2));
		//0은 비교해서 같을때, 양수면 i가 클때, 음수면 i2가 클때
		
		//AutoBoxing
		Short i3 = 10;
		Integer i4 = 5;
		Double d2 = 5.0;
		
		
		//UnBoxing
		int pi = i.intValue();
		double pd = d.doubleValue();
		
		//AutoUnBoxing
		int a = i;
		int b = i2;	//a+b =25(정수)
		abox(a+b);	//int >> (autoBoxing)>> Integer >> (다형성) >> Object
		
		
		
		
	}
	
	public static void abox(Object obj) {
		System.out.println((Integer)obj);
	}
	
	
	

}
