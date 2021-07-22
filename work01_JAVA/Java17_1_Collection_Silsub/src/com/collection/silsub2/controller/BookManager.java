package com.collection.silsub2.controller;
//프로그램의 전반적인제어
import java.util.ArrayList;
import java.util.Scanner;

import com.collection.silsub2.model.dao.BookDao;
import com.collection.silsub2.model.vo.Book;

public class BookManager {
	//BookDao를 불러서 사용할거기때문에 BookDao()객체를 미리만들어둔다 (필드에서)
	private BookDao bd =new BookDao();
	private Scanner sc = new Scanner(System.in);
	static int bNum=1;
	
	
	public BookManager() {}
	
	public void addBook(Book book) {
		
//		try {
//		book.setbNo(bd.getLastBookNo()+1);
//		}catch(IndexOutOfBoundsException e) {
//			book.setbNo(1);
//		}
		book.setbNo(bNum);
		bNum++;
		
		bd.addBook(book);
	}
	
	public int deleteBook(int no) {
		return bd.deleteBook(no);
	}
	
	public int searchBook(String title) {
		return bd.searchBook(title);
	}
	
	public Book selectBook(int index) {
		return bd.selectBook(index);
	}
	
	public ArrayList<Book> selectALL(){
		
		return bd.selectAll();
	}
	
	public Book[] sortedBookList() {
		ArrayList<Book> list = bd.sortedBooklist();
		
		Book[] bk = new Book[list.size()];
		for(int i=0; i<bk.length; i++) {
			bk[i] = list.get(i);
		}
		
		
		
		return bk;
	}
	
	public void printBookList(Book[] br) {
		for(Book b : br) {
			System.out.println(b);
		}
	}
}
