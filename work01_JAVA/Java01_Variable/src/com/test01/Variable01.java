package com.test01;

public class Variable01 {
	
	//main 메소드, 프로그램 진입점
	//메소드 = 기능
	public static void main(String[] args) {
		
		// 타입 변수명 = 값;
		//타입 : 생성할 변수에 어떠한 종류의 값이 들어갈지 지정
		//변수명: 변수의 이름
		//값: 리터럴, 변수에 들어갈 데이터
		
		//메소드 사용
		
		//준비!!
		//--클래스명 변수명 = new 클래스()
		Variable01 test = new Variable01();
		
		//메소드 실행
		//변수명.메소드명();
		test.declareVariable();
		
		//--------------------
		//준비
		Variable01 test2 = new Variable01();
		//실행
		test2.initVariable();
		
		
		
	}
	
	//메소드 = 기능, 실습 메소드(변수 생성, 값 대입, 값 확인)
	public void declareVariable() {
		//정수형
		byte bnum;
		short snum;
		int inum;
		long lnum;
		
		//실수
		float fnum;
		double dnum;
		
		//논리형
		boolean isTrue;
		
		//문자형
		char ch;
		
		//문자열(참조형)
		String str;
		
		//-------------------
		
		//대입 & 출력
		bnum = 1;
		snum = 2;
		inum = 4;
		lnum = 8L;
		
		fnum = 4.0f;
		dnum = 8.0;
		
		isTrue = true;
		
		ch = 'A';
		str = "A";
		
		//변수에 저장된 값 콘솔창에 출력하기
		System.out.println(bnum);
		System.out.println(snum);
		System.out.println(inum);
		System.out.println(lnum);
		System.out.println();
		System.out.println(fnum);
		System.out.println(dnum);
		System.out.println();
		System.out.println(isTrue);
		System.out.println();
		System.out.println(ch);
		System.out.println(str);
	}
	
	public void initVariable() {
		//변수 선언과 동시에 초기화
		byte bnum = 1;
		int inum = 4;
		float fnum = 4.0f;
		double dnum = 8.0;
		
		char ch = 'A';
		String str = "안녕하세요";
		
		//변수값 출력하기
		System.out.println(bnum);
		System.out.println(inum);
		System.out.println(fnum);
		System.out.println(dnum);
		System.out.println(ch);
		System.out.println(str);
	}
	

		

}
