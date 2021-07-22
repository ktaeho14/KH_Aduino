package com.test01;

public class ArrayTest02 {
	public static void main(String[] args) {
		//1. a~z 출력
		char[] ch = new char[26];
		
		
		//
		for(int i =0; i<26; i++) {
			ch[i] = (char)((int)'a'+i);
		}
		//ArrayTest02.prn(ch);
		//ArrayTest02.reverse(ch);
		
		
		
		
		//2. 1번에서 만든 배열을 거꾸로 출력
		ArrayTest02.reverse(ch);
		//3. 1번에서 만든 배열을 대문자로 바꾸어 출력
		ArrayTest02.upper(ch);
	}
	
	public static void prn(char[] ch) {
		for(int i =0; i<ch.length; i++) {
			System.out.print(ch[i] + " ");
			if(i%6 == 5) {
				System.out.println();
			}
		
		}
		System.out.println("\n");
	
	}
	
	
	
	
	public static void reverse(char[] ch) {
//		for(int i=ch.length-1; i>=0; i--) {
//			System.out.print(ch[i] + " ");
//		}
		
		
		int cnt = 0;
		char re[] = new char[26];
		for(int i=ch.length-1; i>=0; i--) {
			re[cnt] = ch[i];
			cnt++;
		}
		ArrayTest02.prn(re);
		
		
	}
	
	
	public static void upper(char[]ch) {
		
		for(int i =0; i<ch.length; i++) {
//			ch[i] = (char)(int)(ch[i]-32);
			ch[i] = Character.toUpperCase(ch[i]);
		}
		
		
		
		
		ArrayTest02.prn(ch);
		
		
		
		
	}
	
	
	
	
	
}
