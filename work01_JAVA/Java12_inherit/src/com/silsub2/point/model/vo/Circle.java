package com.silsub2.point.model.vo;

public class Circle extends Point {
	//필드
	private int radius;

	//기본생성자
	public Circle() {}
	//매개변수생성자 (부모클래스의 매개변수도 불러와야한다)
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	
	
	
	//원의 x,y좌표 면적과 둘레 계산 출력 java.lang.Math.PI 사용
	@Override
	public void draw() {
		super.draw();
		System.out.println("원의 면적: " +(Math.PI * radius * radius));
		System.out.println("원의 둘레: " + (Math.PI * radius *2));
	
	}
	
	
	
	
}
