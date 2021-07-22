package com.uni;

public class Human {
	//필드
	protected String name;
	protected int age;
	protected int height;
	protected int weight;
	
	//기본생성자
	public Human(){}

	//매개변수 생성자
	public Human(String name, int age, int height, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	//getter & setter&
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public String printInformation() {
		return name + ", " + age + ", " + height + ", " + weight;
	}
	
}
