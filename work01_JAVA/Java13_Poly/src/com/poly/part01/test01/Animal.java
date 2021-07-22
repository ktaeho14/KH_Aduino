package com.poly.part01.test01;

public abstract class Animal {
	//abstaract 추상클래스
	
	public void eat(String animal) {
		System.out.println(animal+ "먹는다");
	}
	
	//추상메소드 -> 상속받는 클래스가 반드시 구현
	public abstract void bark();
	
}
