package com.silsub1.book.main;

import com.silsub1.book.model.vo.Book;

public class Main {

	public static void main(String[] args) {
		Book b1 = new Book("자바의 정석","김수호",10000);
		Book b2 = new Book("c언어의 정석","김태호",15000);

		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
		System.out.println(b1.equals(b2));
		
		
		//얕은 복사
		Book b3 = b1;
		Book b4 = b2;
		
		//깊은 복사
		
		Book b5 = new Book("자바의 정석","김수호",10000).clone;
		Book b6 = new Book("c언어의 정석","김태호",15000).clone;
		
		//b1과 b3 , b2와 b4가 동등성을 가지는가??
		System.out.println("b1과 b3가 동등성을 가지는가?: " +b1.equals(b3));
		System.out.println("b2와 b4가 동등성을 가지는가?: " +b2.equals(b4));
		
		//b1과 b3가 동일성을 가지는가?
		System.out.println("b1의 hashcode: " + b1.hashCode());
		System.out.println("b3의 hashcode: " + b3.hashCode());
		//b2와 b4가 동일성을 가지는가?
		System.out.println("b2의 hashcode: " + b2.hashCode());
		System.out.println("b4의 hashcode: " + b4.hashCode());
	}

}
