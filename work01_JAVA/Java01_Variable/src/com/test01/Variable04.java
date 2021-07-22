package com.test01;

public class Variable04 {
	public static void main(String[] args) {
		//준비
		Variable04 test = new Variable04();
		
		//실행
		//test.printVarSize();
		test.testOverflow();
	}
	
	//변수의 사이즈 출력용 메소드
	public void printVarSize() {
		//변수사이즈
		System.out.println("byte의 크기: " + Byte.BYTES + "byte");
		System.out.println("short의 크기: " + Short.BYTES + "byte");
		System.out.println("int의 크기: " + Integer.BYTES + "byte");
		System.out.println("long의 크기: " + Long.BYTES + "byte");
	
		System.out.println("float의 크기:" + Float.BYTES + "byte");
		System.out.println("double의 크기: " + Double.BYTES + "byte");
		
		System.out.println("char의 크기: " + Character.BYTES + "byte");
	
	}

	public void testOverflow() {
		//byte : 127~ 128
		//byte bnum = 128; 에러, 범위를 벗어난 값
		
		byte bnum = 127;
		bnum = (byte)(bnum + 1);
		
		System.out.println("bnum " + bnum);
	}









}
