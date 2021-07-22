package com.collection.silsub2.model.dao;

import java.util.ArrayList;

import com.collection.silsub2.comparator.AscCategory;

//dater accepts object


import com.collection.silsub2.model.vo.Book;

public class BookDao {
	private ArrayList<Book> bookList;
	
	public BookDao() {
		bookList = new ArrayList<Book>();
	}

	public BookDao(ArrayList<Book> list) {
		
		bookList = list;
	}
	
	//마지막 도서의 번호를 리턴
	public int getLastBookNo() {
		
		return bookList.get(bookList.size()-1).getbNo();
	}
	
	
	//새 도서 추가
	public void addBook(Book book) {
		bookList.add(book);
	}
	
	// 도서 삭제
	public int deleteBook(int no) {
		int result = 0;
		for(int i=0; i<bookList.size();i++) {
			if(bookList.get(i).getbNo()==no) {
				bookList.remove(i);
				result = 1;
			}
		}
		
		return result;
	}
	
	// 도서 검색
	public int searchBook(String tilte) {
		int index = -1;
		for(int i=0; i<bookList.size(); i++) {
			if(bookList.get(i).getTitle().contains(tilte)) {
				index= i;
			}
		}
		
		
		
		return index;
	}
	
	//도서 검색
	public Book selectBook(int index) {
		
		return bookList.get(index);
	}
	
	//전체 출력(직접적으로 데이터들에게 접근할예정) (ArrayList에 다담아서 리턴을 해준다)
	public ArrayList<Book> selectAll(){
		
		return bookList;
	}
	
	
	//정렬 (ArrayList에 다담아서 리턴을해준다)
	public ArrayList<Book> sortedBooklist(){
		bookList.sort(new AscCategory());
		
		return bookList;
	}
	
}
