package com.coleection.silsub2.model.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.coleection.silsub2.vo.Book;

public class BookDao {
	
	private HashMap<String,Book> bookMap = new HashMap<String,Book>();
	private Book bk = new Book();
	
	public BookDao() {}
	public BookDao(HashMap<String, Book> bookMap) {
		super();
		this.bookMap = bookMap;
	}
	
	public int getLastBookNo() {
		
		return 0;
	}
	
	public void addBook(Book book) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		bookMap.put(str, book);
	}
	
	public Book deleteBook(String key) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		return bookMap.remove(str);
	}
	
	public String serachBook(String title) {
		return null;
	}
	
	public Book selectBook(String key) {
		return null;
	}
	
	public HashMap<String,Book> selectAll(){
		
		
		return ;
	}
	public ArrayList<Book> sortedBookList(){
		return null;
	}
	











}
