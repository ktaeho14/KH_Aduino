package com.collection.part01_list_arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {

	public static void main(String[] args) {
		
		
		
		
		
		//객체 생성
		ArrayList alist = new ArrayList();
		
		//다형성 적용 객체생성
		List list = new ArrayList();
		
		//추가해주는 메소드 add(자료형);
		list.add("sooho");
		list.add(123);
		list.add(4.5);
		
		
		alist.add("babo");
		alist.add("hye");
		alist.add(28);
		
		System.out.println("list: " + list);
		System.out.println("alist: " + alist);
	
		//안의 값을 하나씩 확인해보고 싶을때
		for(int i =0; i<list.size(); i++) {
			System.out.println("list: " + list.get(i));
		}
	
		//데이터 중복 저장을 허용한다
		list.add("sooho");
		System.out.println("sooho추가 list: " + list);
	
		//숫자를 추가시켜 중간에 집어넣어보자
		list.add(1, "sooho1");
		System.out.println("index1번에 sooho1추가 list : " + list);
		
		
		//remove(index) 지우는 메소드
		list.remove(1);
		System.out.println("index 1번에 sooho1을 지우는 remove사용 list: " + list);
		
		
		//원하는 위치의 객체를 수정하는 메소드 alist.set(index, element);
		alist.set(0, new String("hyewon"));
		System.out.println("set을 사용한 index 1의 123을 hyewon이라는 String 객체로 수정 list : " + list);
	}
	
	
	

}
