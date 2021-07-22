package com.test02.model.vo;

public class Book  {
	
	//필드
	private String title;
	private String writer;
	private int price;
	
	//기본생성자
	public Book() {}
	
	//매개변수 생성자
	public Book(String title, String writer, int price) {
		
		this.title = title;
		this.writer = writer;
		this.price = price;
	}

	
	//getter , setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	//toString
	
//	@Override
	public String toString() {
		return title + ", " + writer + " + , " + price;
		
		
	}
	
	
	//equals()
	// ex - b1.equals(b4)
	@Override
	public boolean equals(Object obj) {
		//객체의 주소가 같으면 같은 객체이다.
		if(this == obj) {
			return true;
		}
		//전달받은 객체가 null인 경우는 무조건 다른 객체
		if(obj == null) {
			return false;
		}
		
		
		//////////////////////
		//전달받은 객체를 형변환 하여 필드별로 비교
		Book other = (Book)obj;
		
		//b1의 제목이 null이면 b4의 제목도 null, 그렇지 않으면 false리턴하자!
		if(title ==null) {
			if(other.title!=null) {
				return false;
			}
			//두 객체의 이름이 서로 다른 경우에도 false리턴
		}else if( !title.equals(other.title) ) {
			return false;
		}
		
		//작가
		if(writer ==null) {
			if(other.writer !=null) {
				return false;
				
			}
		}else if(!writer.equals(other.writer)) {
			return false;
		}
		
		//기본 자료형
		//price
		if(price != other.price) {
			return false;
		}
		
		
		
		return true;
	}
	
	
	//hashCode()
	@Override
	public int hashCode() {
		
		return (writer+price+title).hashCode();
	}
	
	
	
	
	
	
	
	
	
}
