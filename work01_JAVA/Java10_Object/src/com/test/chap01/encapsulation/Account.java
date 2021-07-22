package com.test.chap01.encapsulation;

public class Account {
	//필드
	private String name = "김수호";
	private String accNo = "01091967013";
	private String pwd = "1234";
	private int bankCode = 20;
	private int balance = 0;
	
	//생성자 
	public Account() {}
	
	
	//입금을 위한 메소드
	public void in(int money) {
		if(money > 0) {
			balance += money;
			System.out.println(name + "님의 계좌에" + money + "원이 입금되었습니다.");
		}else {
			System.out.println("잘못된 금액이 입력되었습니다");
		}
	}
	
	//출금
	public void out(int money) {
		if(money < balance) {
			balance -= money;
			System.out.println(name+"님의 계좌에" + money + "원이 출금되었습니다");
		}else {
			System.out.println("잔액이 부족합니다. 잔액을 확인하세요.");
		}
	}
	
	//잔액 조회
	public void displayBalance() {
		System.out.println(name + "님의 계좌에 잔액은" + balance + "원 입니다.");
	}
	
}
