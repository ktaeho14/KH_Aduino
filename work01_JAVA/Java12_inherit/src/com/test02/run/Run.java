package com.test02.run;

import com.test02.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		
		Book b1 = new Book("시간을 멈추는 법","매트헤이그",100);
		Book b2 = new Book("로스트심벌","댄브라운",200);

		//toString();
//		System.out.println("b1 =" + b1.toString());
//		System.out.println("b2 =" + b2.toString());
		
		System.out.println("b1= " +b1);
		System.out.println("b2= " +b2);
	
		//Book 객체 비교
		System.out.println("b1과 b2는 같은 객체?: " + b1.equals(b2));
		
		//얕은복사
		Book b3 = b1;
		System.out.println("b1과 b3는 같은객체? : " + b1.equals(b3));
		
		//b1과 값이 동일한 b4 객체 만들어 비교
		Book b4 = new Book("시간을 멈추는 법","매트헤이그",100);
		
		//equals() 오버라이딩을 통해 동등성 확보
		System.out.println("b1과 b4는 같은 객체? : " + b1.equals(b4));
		//주소값은 다르지만 값이 같은 객체를 동등객체
		//주소값 까지 같은 객체 동일객체
		
	//	System.out.println(b1.hashCode());
	//	System.out.println(b4.hashCode());
		
		
		//hashcode() 오버라이딩을 통해 동일성 확보
		System.out.println(b1.hashCode());
		System.out.println(b4.hashCode());
		
		
		
	
	
	
	
	
	}
	
	
	

}
