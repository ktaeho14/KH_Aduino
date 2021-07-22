package com.test01.run;

import java.util.Scanner;

import com.test01.model.Book;

public class MTest {
	public static void main(String[] args) {
		Book bk1 = new Book("자바의정석", "홍길동","나무",10000);
		Book bk2 = new Book("C언어", "이창진","KH",20000);
		Book bk3 = new Book("프로그래밍","김수호","에스클래스",30000);
		
		//출력
		System.out.println(bk1.prn());
		System.out.println(bk2.prn());
		System.out.println(bk3.prn());
	
		// 도서 검색
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 책 제목: ");
		String searchTitle = sc.nextLine();
	
		if(bk1.getTitle().equals(searchTitle)) {
			System.out.println(bk1.prn());
		}else if(bk2.getTitle().equals(searchTitle)) {
			System.out.println(bk2.prn());
		}else if(bk3.getTitle().equals(searchTitle)) {
			System.out.println(bk3.prn());
		}
		
		
		
		
		
		
	}
}
