package com.collection.silsub2.model.vo;
//vo = value object 
//필요데이터를 저장하는곳 model
//dto 여러개의 데이터를 묶어둔곳
//조건 : 1. 필드private , 2.기본생성자,매개변수 생성자가있어야한다 , 3.getter,setter메소드존재
public class Book {
	private int bNo;
	private int category;
	private String title;
	private String author;
	
	
	public Book() {}


	public Book(int category, String title, String author) {
		
		this.category = category;
		this.title = title;
		this.author = author;
	}


	public int getbNo() {
		return bNo;
	}


	public void setbNo(int bNo) {
		this.bNo = bNo;
	}


	public int getCategory() {
		return category;
	}


	public void setCategory(int category) {
		this.category = category;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	@Override
	public String toString() {
		String str = "";
		
		if(category ==1) {
			str ="인문";
			
		}else if(category == 2) {
			str = "자연과확";
		}else if(category ==3) {
			str ="의료";
		}else if(category == 4) {
			str ="기타";
		}
		
		
		return "도서번호: "+bNo+" 분류:"+str+"제목: " +title+ " 저자: "+author;
	}
	
	
	
	
}
