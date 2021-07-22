package com.chap02_StringBuffer_StringBuilder;

public class Run {

	public static void main(String[] args) {
		Run.method();
		//Run.method1();
	}

	
	public static void method() {
	
		StringBuilder sb = new StringBuilder("아아 하나둘");
		System.out.println(sb.length());
		System.out.println(sb);
		
		System.out.println("=================");
		System.out.println("sb 기존: +" + sb + ", 주소: " + sb.hashCode());
		sb.append("하나둘 들리나요~");
		System.out.println("sb 변경후:  +" + sb + ", 주소: " +sb.hashCode());
		
		System.out.println("---------------------------");
		
		StringBuffer sf = new StringBuffer("안녕!");
		System.out.println("sf 기존: " + sf + ", 주소:" + sf.hashCode() );
		sf.append(" 나는 StringBuffer야");
		System.out.println("sf 변경후: "+sf+", 주소: "+sf.hashCode());
		
		
		
	}
	
		public static void method1() {
			StringBuilder sb = new StringBuilder("3교시 ");
			
			//append
//			sb.append(" 수업 중 입니다");
//			sb.append("~~!");
			sb.append("수업 중 입니다").append("~~!");	//메소드 체이닝
			
			System.out.println(sb);
			
			//insert()
			sb.insert(0, "화요일 ");
			System.out.println(sb);
			
			//delete()
			sb.delete(0, 4);
			System.out.println(sb);
			
			
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
