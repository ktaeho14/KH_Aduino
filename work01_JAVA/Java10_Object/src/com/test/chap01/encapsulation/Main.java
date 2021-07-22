package com.test.chap01.encapsulation;

public class Main {

	public static void main(String[] args) {
		Account ac = new Account();
		
		//잔액조회
		ac.displayBalance();
		
		//100만원 입금
		ac.in(1000000);
		ac.displayBalance();
		
		//150만원 입금
		ac.in(1500000);
		ac.displayBalance();

		//50만원 출금
		ac.out(500000);
		ac.displayBalance();
		
		
		
		
		//ac.balance -= 2000000;
		//ac.displayBalance();
		
		ac.out(1000000);
		ac.displayBalance();
	}

}
