package com.silsub2.point.model.vo;

public class Point {
	//필드
	protected int x;
	protected int y;
	
	//기본생성자
	public Point(){}
	//매개변수 생성자
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	//getter & setter 메소드
	
	public void draw() {
		System.out.println("x: " + x + ",y: " + y);
	}
	
	
	
}
