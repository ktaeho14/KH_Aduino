package com.test01;
import java.util.Scanner;
public class Operator04 {
	//삼항연산자
	// (조건식) ? 참일때 : 거짓일때;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 하나 입력: ");
		int no = scan.nextInt();
		
		//String res = (no>0) ? "양수다" : "양수가 아니다";
		
		//(조건식)? 참일때 : (조건식)<거짓 ? 참일때 : 거짓일때;
		String res = (no>0) ? "양수다" : (no==0) ? "0이다" : "음수다";
		
		System.out.println(res);
		
		
		
		
		
	}
}
