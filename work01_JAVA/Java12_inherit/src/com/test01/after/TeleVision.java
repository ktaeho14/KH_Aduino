package com.test01.after;

import java.util.Date;

public class TeleVision extends Product {
	private int inchType;
	
	
	
	
	public TeleVision(){
	/*	super(); */
	}

	public TeleVision(String brand, String productNumber, String productCode, String productName
						,int price, Date date , int inchType) {
		
		super(brand,productNumber,productCode,productName,price,date);
		
		this.inchType=inchType;
		
		System.out.println("Product를 상속받은 Television 생성자 호출 완료");
	}

	public int getInchType() {
		return inchType;
	}

	public void setInchType(int inchType) {
		this.inchType = inchType;
	}
	
	public String prn() {
		return super.prn() + " " + this.inchType;
	}

	
	
	
	
	
	
	
	
	
	
	
}
