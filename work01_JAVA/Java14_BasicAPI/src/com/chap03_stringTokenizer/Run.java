package com.chap03_stringTokenizer;

import java.util.StringTokenizer;

public class Run {

	public static void main(String[] args) {
		String str = "김수호,27,서울 송파구 삼전동, 남";
		StringTokenizer st = new StringTokenizer(str,",");
		System.out.println(st.countTokens());
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		

	}

}
