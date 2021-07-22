package com.test02.controller;

import java.util.Scanner;

import com.test02.model.dto.Person;

public class PersonController {
	private Person[] people = new Person[2];
	Scanner sc = new Scanner(System.in);
	
	public PersonController() {}
	
	
	
	
	/////////
	
	
	//회원 추가
	public void insertPerson() {
		for(int i=0;i<people.length;i++) {
			System.out.println("==회원 정보 입력==");
			
			System.out.print("이름: ");
			String name = sc.next();
			System.out.print("나이: ");
			int age =sc.nextInt();
			System.out.print("재산: ");
			int wealth = sc.nextInt();
		
			people[i] = new Person(name, age, wealth);
			
		}
		
		
	}
	
	//회원 전체 조회
	public void printPerson() {
		
		for(int i=0;i<people.length; i++) {
			System.out.println(people[i].info());
		
		
		
		}
		
	}
	
	//평균 재산 조회
	public void avgWealth() {
		//people에 저장되어 있는 people객체들의 wealth 평균값 구하여 출력
		
		int sum = 0;
		
		for(int i=0; i<people.length; i++) {
			sum += people[i].getWealth();
			
			//people[0].getWealth() + people[1].getWealth() /
			
		}System.out.println("평균 재산: " + (sum/people.length));
		
	}
	
	//회원 이름으로 검색
	
	public void searchPerson() {
		//이름을 입력받아 people배열에 저장되어 회원을 찾아 출력
		System.out.println("찾을 이름을 입력하세요: ");
		String searchname = sc.next();
			for(int i =0; i<people.length; i++) {
				if(people[i].getName().equals(searchname)){
					System.out.println(people[i].info());
					
				}else {
					System.out.println("검색된 회원이 없습니다");
				}
			}
	}
	
	
	
}
