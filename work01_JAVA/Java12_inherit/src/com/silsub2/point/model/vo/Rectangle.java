package com.silsub2.point.model.vo;

public class Rectangle extends Point {
	
	//필드
	private int width;
	private int height;
	
	//기본 생성자
	public Rectangle(){}

	//매개변수 생성자
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	
	//getter & setter
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public void draw() {
		super.draw();
		System.out.println("사각형의 면적: " + (width * height));
		System.out.println("사각형의 둘레: " + ( ( width + height )*2) );
		
		
	}
	
}
