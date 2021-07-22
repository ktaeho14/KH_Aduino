package com.collection.part03_map.hashmap;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMap {
	
	public void testHashMap() {
		HashMap hmap = new HashMap();
		
		hmap.put("one", new Date());
		hmap.put(12, "red apple");
		hmap.put(33,123);
		//autoboxing처리 : 12 => new Integer(12);
		
		System.out.println("hmap: " + hmap);
		
		hmap.put(12,"yellow banana");
		System.out.println("hmap: " + hmap);
		
		
		//키는 중복 저장되지않음(set) : 최근 키로 덮어씀
		//벨류는 중복 저장됨(List)와 같은 특징을 가지고있다
		hmap.put(11,"yellow banana");
		hmap.put(19,"yellow banana");
		System.out.println("hmap: " + hmap);
		
		
		System.out.println("키 19에 대한 객체: " + hmap.get("one"));
		
		
		//삭제
		hmap.remove(19);
		System.out.println("hmap: " + hmap);
		
		System.out.println("hmap에 저장된 객체 수: " + hmap.size());
		
		
	}
	
	public void testHashMap2() {
		
		HashMap hmap = new HashMap();
		hmap.put("one","java");
		hmap.put("two","oracle");
		hmap.put("three","jdbc");
		hmap.put("four","html5");
		hmap.put("five","css3");
		
		
		//Map에 저장된 객체 정보를 연속 처리 테스트
		
		//1. keySet()을 이용하여 key만 set으로 만든 다음
		//iterator()로 키에 대한 목록을 만든다.
		
		Set keys = hmap.keySet();
		Iterator keyIter = keys.iterator();
		
		while(keyIter.hasNext()) {
			String key = (String)keyIter.next();
			String value = (String) hmap.get(key);
			System.out.println(key + "=" + value);
		}
		
		
		//2. 저장된 value 객체들만 values()로 collection으로 만든다.
		Collection values = hmap.values();
		
		//2-1. Iterator()
		Iterator  valueIter = values.iterator();
		while(valueIter.hasNext()) {
			System.out.println(valueIter.next());
		}
		
		//2-2 배열로 만들어서 처리 toArray()
		Object[] valueArr = values.toArray();
		for(int i=0; i<valueArr.length; i++) {
			System.out.println(i+ " : " +valueArr[i]);
		}
		
		//3. Map 내부 클래스인 Entry를 이용한 entrySet() 활용
		Set set = hmap.entrySet();
		//Entry : 키&벨류 를 쌍으로 묶은 것
		
		Iterator entryIter = set.iterator();
		while(entryIter.hasNext()) {
			Map.Entry entry = (Map.Entry)entryIter.next();
		
			System.out.println(entry.getKey()+ ": " + entry.getValue());
		
		
		
		
		
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
