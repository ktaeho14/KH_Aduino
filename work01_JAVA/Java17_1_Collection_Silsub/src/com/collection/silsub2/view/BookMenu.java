package com.collection.silsub2.view;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.collection.silsub2.controller.BookManager;
import com.collection.silsub2.model.vo.Book;
//화면에 보이는부분
public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookManager bm = new BookManager();
	
	
	
	//기본생성자
	public BookMenu() {}
	
	
	//도서관리 프로그램에 해당하는 메인 메뉴 출력
	//각 메뉴에 해당하는 BookManager 클래스의 메소드 실행->반복출력
	public void mainMenu() {
		
		while(true) {
			System.out.println("***도서 관리 프로그램 ***");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서정보 정렬 후 출력");
			System.out.println("3. 도서 삭제");
			System.out.println("4. 도서 검색출력");
			System.out.println("5. 전체 출력");
			System.out.println("6. 끝내기");
		
			System.out.println("메뉴선택: ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			case 1:
				//inputBook()을 매개변수로 넘겨주자
				//BookManager의 addBook은 매개변수를 Book타입을하라고되어있다.
				Book b = inputBook();
				bm.addBook(b);
				break;
			case 2:
				bm.printBookList(bm.sortedBookList());
				break;
				
			case 3:
				int result = bm.deleteBook(inputBookNo());
				
				if(result == 1) {
					System.out.println("성공적으로 삭제되었습니다");
				}else {
					System.out.println("삭제할 Book이 존재하지 않습니다");
				}
				break;
			case 4:
				int index = bm.searchBook(inputBookTitle());
				
				if(index == -1) {
					System.out.println("조회한 Book이 존재하지 않습니다");
				}else {
					System.out.println(bm.selectBook(index));
				}
				
				break;
				
				
				
			case 5:
				ArrayList<Book> list = bm.selectALL();
				if(list.isEmpty()) {
					System.out.println("도서가 없습니다.");
				}else {
					Iterator it = list.iterator();
					while(it.hasNext()) {
						System.out.println(it.next());
						
					}
				}
				
				break;
				
			case 6:
				System.out.println("프로그램을 종료합니다");
				return;
			}
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
	}
	
	


	//Book 객체의 필드 값을 키보드로 입력 받아 초기화 하고 객체 리턴
	public Book inputBook() {
		System.out.println("제목: ");
		String title = sc.nextLine();
		System.out.println("장르(1.인문/ 2.자연과학/ 3.의료/ 4.기타) 숫자로 입력: ");
		int category = sc.nextInt();
		sc.nextLine();
		System.out.println("저자: ");
		String author= sc.nextLine();
		//북객체로 리턴받기 Book클래스 순서 확인
		return new Book(category, title, author);
	}
	
	
	public int inputBookNo() {
		System.out.println("도서번호: ");
		int no = sc.nextInt();
		return no;
		
	}
	
	public String inputBookTitle() {
		System.out.println("도서제목: ");
		String title = sc.nextLine();
		return title;
	}
	
}


