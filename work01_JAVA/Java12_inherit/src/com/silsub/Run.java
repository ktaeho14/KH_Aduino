package com.silsub;

public class Run {

	public static void main(String[] args) {
		Car s1 = new SportsCar("³ë¶õ");
		s1.accelPedal();
		System.out.println(s1.toString());
		s1.accelPedal();
		s1.accelPedal();
		s1.breakPedal();
		s1.breakPedal();
		s1.breakPedal();
		s1.breakPedal();
		s1.breakPedal();
		
		System.out.println(s1.toString());
	
		Car s2 = new SUV("»¡°­");
		s2.accelPedal();
		s2.accelPedal();
		s2.accelPedal();
		System.out.println(s2);
		s2.breakPedal();
		s2.breakPedal();
		s2.breakPedal();
		s2.breakPedal();
		s2.breakPedal();
		
		System.out.println(s2);
	
		
		
	
	
	
	
	
	
	
	
	
	}

}
