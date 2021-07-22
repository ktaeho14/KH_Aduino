package com.silsub1.book.model.vo;

public class Book {
	
	public static Book clone;
	//필드
	private String title;	//책제목
	private String author;	//저자명
	private int price;		//가격

	//기본생성자
	public Book() {}
	//매개변수 생성자

	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	
	
	//getter & setter 메소드
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return title + "," + author + ", " + price;
	}

	
	//ex   b1.equals(b3);
	@Override
	public boolean equals(Object obj) {     
		if(this == obj) {       //this(b1)      obj(b3)
			return true;
		}
		if(obj == null) {
			return false;
	}
/////////////////////////////////
			Book other = (Book)obj;     //Book 으로 형변환을 시켜줌
			if(title == null) {			
				if(other.title!=null) {
					return false;
				}
			}else if(!title.equals(other.title) ) {   //b1과 b3의 문자열을 비교     왜냐하면 if(title ==null)이아니기때문에 else if가 실행이됨
				return false;
			}
/////////////////////////////////
			if(author==null) {
				if(other.author !=null) {
					return false;
				}
			}else if(!author.equals(other.author)) {
				return false;
			}
	////////////////////////////////		
			if(price !=other.price) {
				return false;
			}











		return true;
	}
	
	@Override
	public int hashCode() {
		return (author+title+price).hashCode();
	}
}

