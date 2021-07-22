package com.collection.part01_list_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class ArrayListTest {

	public void testArrayList() {
		//ArrayList 객체 생성
		ArrayList alist = new ArrayList();
	
		//다형성 적용
		List list = new ArrayList();
		
		
		//추가해주는 메소드 add(자료형);
		alist.add("apple");
		alist.add(123);
		alist.add(45.67);
		alist.add(new Date());
		
		
		
		System.out.println("alist: " + alist);
		
		for(int i=0; i<alist.size(); i++) {
			System.out.println(i + " : " + alist.get(i));
		}
		
		//데이터 중복 저장을 허용한다
		alist.add("apple");
		System.out.println("alist: " + alist);
		
		//숫자를 추가시켜 중간에 집어넣자
		alist.add(1, "banana");
		System.out.println(alist);
		
		//remove(index) 지우는 메소드
		alist.remove(2);
		System.out.println(alist);
		
		//원하는 위치의 객체를 수정하는 메소드  alist.set(index, element);
		alist.set(1, new Boolean(true));
		System.out.println(alist);
		
		
	}
	
	
	public void testArrayList2() {
		//ArrayList는 오름차순 정렬을 할 수 있도록 sort() 메소드 사용 가능
		ArrayList<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("banana");
		list.add("grape");
		list.add("orange");
		list.add("pear");
		list.add("blueberry");
		
		
		System.out.println("list: " + list);
		
		//정렬 오름차순 Collections.sort(ArrayList변수);
		Collections.sort(list);
		System.out.println("listSort: " + list);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
