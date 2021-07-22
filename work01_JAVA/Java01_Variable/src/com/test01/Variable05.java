package com.test01;

public class Variable05 {
	//형변환(cast)
	//자동형변환, 강제형변환(명시적형변환)
	//		  (바꿀자료형)값 or (바꿀자료형)변수
	
	public static void main(String[] args) {
		//준비
		Variable05 test = new Variable05();
		//실행
		//test.rule1();
		//test.rule2();
		test.rule3();
	}
	
	
	public void rule1() {
		boolean flag = true;
		//형변환 예외
		
		
		//자료형이 다르더라도 작은 크기의 변수 타입은 큰 변수 타입으로 저장 가능(자동 형변환, 목시적형변환,upcasting)
		//큰변수타입은 작은변수타입으로 자동형변환 되지 않기 때문에 형변환을 명시(강제형변환,명시적형변환,downcating)
		
		int num = 'a';
		System.out.println("num: " + num);
		
		char ch = 65;
		System.out.println("ch:" + ch);
		//char ch2 = -96; 음수값은 저장 불가능
		
		//int 자료형 변수의 값은 강제형변환이 필요
		char ch2 = (char)num;
		System.out.println("ch2: " + ch2);
		
		int num2 = -97;
		char ch3 = (char)num2;
		System.out.println("ch3: " + ch3);
	}
	
	public void rule2(){
		
		int inum = 10;
		long lnum = 100;
		
		//int isum = inum + lnum;
		
		//방법1.
		int isum =(int)(inum+lnum);
		System.out.println("isum:" + isum);
	
		//방법2.
		int isum2 = inum + (int)lnum;
		System.out.println("isum2: " + isum2);
		
		//방법3.
		long lsum = inum + lnum;
		System.out.println("lsum: " + lsum);
	}
	
	public void rule3() {
		long lnum = 100;
		
		float fnum = lnum;
		
		System.out.println("fnum: " + fnum);
		
		double dnum = 10.2;
		
		//실수는 정수로 변경할 때 강제 형변환
		int inum = (int)dnum;
		
		System.out.println("inum: " + inum);
	
		System.out.println("inum을 실수로:: " + (double)inum);
	
	}
	
	
	
	
	
	
}
