package com.collection.part04_generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestGenerics {

	public void testGenerics() {
		List list = new ArrayList();
		
		list.add(new String("generics test"));
		list.add(new Book());
		list.add(new Student());
		list.add(new Car());
		
		System.out.println("저장된 객체 수: " + list.size());
		System.out.println("list: " + list);
		
		//저장된 객체를 하나 씩 꺼내보자
		for(int i=0; i<list.size(); i++) {
			Object obj = list.get(i);
			
			
			//instanceof를 통해 obj가 어떤 객체인지 확인을하고
			//객체에 맞게 Object타입의 obj를 형변환을 시켜 .메소드 를 실행한것
			
			
			if(obj instanceof Book) {
				((Book)obj).printBook();
				
			}
			if(obj instanceof Student) {
				((Student)obj).score();
			}
			
			if(obj instanceof Car) {
				((Car)obj).printCar();
			}
		}
		
		
		
	}
	
	public void testGenerics2() {
		
		List<Book> list = new ArrayList<Book>();
		
		//Generics 가 Book타입으로 설정되어있어서 String타입의 값은 들어갈 수 없다.
		//list.add("Test");
		list.add(new Book());
		list.add(new Book());
		
		for(Book b : list) {
			b.printBook();
		}
		for(int i=0; i<list.size(); i++) {
			Book b =list.get(i);
			b.printBook();
		}
		
		
		
		//Generics 를 사용하지 않으면 두 객체를 비교한 후에 형변환 작업까지 해야하는 불편함이 생긴다.
		System.out.println("============");
		ArrayList list2 = new ArrayList();
		list2.add(new Book());
		list2.add(new Car());
		
		for(int i =0; i<list2.size(); i++) {
			Object obj = list2.get(i);
			
			if(obj instanceof Book) {
				((Book)obj).printBook();
			}
			
		}
		
		
		
		
	}
	
	
	public void testGeneric3() {
		HashMap<String,Book> map = new HashMap<String,Book>();
		map.put("one", new Book("java"));
		map.put("two", new Book("oracle"));
		map.put("three", new Book("jdbc"));
		
		System.out.println(map);
		
		
		//Map.Entry를 이용하여 Iterator를 생성하고 키 벨류를 동시에 처리
		//entrySet();
		
		Set<Map.Entry<String, Book>> entry = map.entrySet();
		
		Iterator<Map.Entry<String, Book>> iter = entry.iterator();
		
		while(iter.hasNext()) {
			Map.Entry<String, Book> ent = iter.next();
			String key = ent.getKey();
			Book value = (Book)ent.getValue();
			
			System.out.println(key + ":" + value);
		}
		
		
		//key만 추출하여 Iterator 생성
		//keySet();
		
		Set<String> keys = map.keySet();
		Iterator<String> keyIter = keys.iterator();
		
		
		while(keyIter.hasNext()) {
			String key = keyIter.next();
			Book b = map.get(key);
			
			System.out.println(key + "=" + b);
		}
	}
	
	
}


//한 클래스 파일 안에 여러개의 클래스 정의가능
//접근제한자는 1개의 클래스에만 붙일 수 있다
//default

class Book{
	private String title;
	
	public Book() {}
	public Book(String title) {
		this.title = title;
	}
	public void printBook() {
		System.out.println("printBook() call...");
	}
	@Override
	public String toString() {
		return "Book";
	}
	
}


class Student{
	public Student() {}
	
	public void score() {
		System.out.println("score() call....");
	}
	@Override
	public String toString() {
		return "Student";
	}
	
	
}

class Car{
	public Car() {}
	public void printCar() {
		System.out.println("printCar() call...");
	}
	@Override
	public String toString() {
		return "Car";
	}
}













