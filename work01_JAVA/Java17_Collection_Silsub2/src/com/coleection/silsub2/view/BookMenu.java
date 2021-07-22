package com.coleection.silsub2.view;

import java.util.Scanner;

import com.coleection.silsub2.controller.BookManager;
import com.coleection.silsub2.vo.Book;

public class BookMenu {
	
	private Scanner sc = new Scanner(System.in);
	private BookManager bm = new BookManager();
	
	public BookMenu() {}
	
	public void mainMenu() {
		
		
		while(true) {
			System.out.println("****�������� ���α׷�****");
			System.out.println("1. �� ���� �߰�");
			System.out.println("2. �������� ���� �� ���");
			System.out.println("3. ���� ����");
			System.out.println("4. ���� �˻����");
			System.out.println("5. ���� ��ü���");
			System.out.println("6.������");
			
			
			System.out.println("�޴� ����");
			int num = sc.nextInt();
			
			
			
			switch(num) {
			case 1:
				bm.addBook(null);
				break;
			case 2:
				
				
				break;
			case 3:
				bm.deleteBook(null);
				break;
			case 4:
				break;
			case 5:
				break;
			case 6: 
				return;
				
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public Book inputBook() {
		System.out.println("����: ");
		String title = sc.nextLine();
		System.out.println("����: ");
		String author = sc.nextLine();
		System.out.println("�帣(1.�ι�/ 2.�ڿ�����/ 3.�Ƿ�/ 4.��Ÿ)���ڷ� �Է�: ");
		int category = sc.nextInt();
		
		
		return new Book(category, title, author);
	}
	
	public String inputBookNo() {
		return null;
	}
	
	public String inputBookTitle() {
		return null;
	}
	
	
	
	
	
	
}