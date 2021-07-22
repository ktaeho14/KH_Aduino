package com.test02;

public class Student {
	public static void main(String[] args) {
		String name = "이창진";
		int kor = 100;
		int eng = 84;
		int math = 40;
		
		
		//클래스명 변수명 = new 클래스명();
		Score sc = new Score();
		double avg = sc.getAvg(kor,eng, math);
		
		String res = sc.getGrade(avg);
		
		System.out.println(name+" 님의 등급은 "+res+"입니다");
		
	}
}
