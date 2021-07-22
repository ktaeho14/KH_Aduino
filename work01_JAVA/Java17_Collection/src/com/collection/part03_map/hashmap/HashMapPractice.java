package com.collection.part03_map.hashmap;

import java.util.HashMap;

public class HashMapPractice {

	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<String, String>();
		
		PracticeMenu pm =new PracticeMenu();
		
		pm.setName("sooho");
		pm.setNumber("11");
		map.put(pm.getName(), pm.getNumber());
		System.out.println(map);
		
		pm.setName("sooho");
		pm.setNumber("11");
		map.put(pm.getName(), pm.getNumber());
		System.out.println(map);
	}

}
