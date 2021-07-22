package com.test01.run;

import java.util.Scanner;

import com.test01.model.Book;

public class ObjectArrayTest {
	public static void main(String[] args) {
		//1. 기본자료형 배역
		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		
		//ctrl + space
//		System.out.println(arr);
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
	
		//2.객체배열
		//클래스명[] 변수명 = new 클래스명[]
		
		//선언 및 할당
		Book[] bk = new Book[3];
		
		//초기화
		bk[0] = new Book("자바의 정석", "홍길동", "나무", 10000);
		bk[1] = new Book("C언어의 정석", "이창진", "KH", 20000);
		bk[2] = new Book("프로그래밍","김수호","케이에이치",30000);
	
		//System.out.println(bk);
		//System.out.println(bk[0]);
		//System.out.println(bk[0].getPrice());
		
		//bk      			   =>Book[]      (주소값)
		//bk[index] 		   => Book 객체	 (주소값)
		//bk[index].getPrice() => int		 (실제값)
		
		System.out.println("도서 개수: " + bk.length);
		
		//도서들 출력
		//System.out.println(bk[0].prn());
		//System.out.println(bk[1].prn());
		//System.out.println(bk[2].prn());
		
		for(int i=0; i<bk.length; i++) {
			System.out.println(bk[i].prn());
		}
		
		//도서 검색
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 도서를 입력하세요: ");
		String searchTitle = sc.nextLine();
		
		
		for(int i=0; i<bk.length; i++) {
			if(bk[i].getTitle().equals(searchTitle)) {
				System.out.println(bk[i].prn());
			}
		
		
		}
	}
}
