package com.test01.after;

import java.util.Date;

public class Computer extends Product {
	//스마트폰과 데스크탑의 공통 속성
	private String cpu;
	private int hdd;
	private int ram;
	private String os;
	
	
	//기본생성자
	public Computer(){}

	//매개변수 생성자 (부모(Product)클래스 필드값포함)
	public Computer(String brand, String productNumber, String productCode, String productName, int price, Date date,
			String cpu, int hdd, int ram, String os) {
		super(brand, productNumber, productCode, productName, price, date);
		this.cpu = cpu;
		this.hdd = hdd;
		this.ram = ram;
		this.os = os;
	}


	public String getCpu() {
		return cpu;
	}


	public void setCpu(String cpu) {
		this.cpu = cpu;
	}


	public int getHdd() {
		return hdd;
	}


	public void setHdd(int hdd) {
		this.hdd = hdd;
	}


	public int getRam() {
		return ram;
	}


	public void setRam(int ram) {
		this.ram = ram;
	}


	public String getOs() {
		return os;
	}


	public void setOs(String os) {
		this.os = os;
	}

	
	public String prn() {
		
		return super.prn() + ", " +this.cpu + "," + this.hdd + ", " + this.ram + "," +this.os;
	}
	
	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
