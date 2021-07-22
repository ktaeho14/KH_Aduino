package com.collection.part02_set;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestHashSet {
	public void testHashSet() {
		HashSet hset = new HashSet();
		
// 		Set hset2 = new HashSet();
	
	
	hset.add(new String("java"));
	hset.add(new Integer(123));
	hset.add(new Double(45.67));
	hset.add(new Date());
	
	//저장 순서 유지 안됨
	System.out.println("hst: " + hset);
	
	
	//중복 허용 안함(추가 되지않는다)
	hset.add(new String("java"));
	hset.add(new Integer(123));
	System.out.println("hset: " + hset);
	//size또한 추가되지않는다
	System.out.println("저장된 객체 수: " + hset.size());
	
	//포함이 되어있는지 여부확인 .contains(element)
	System.out.println("포함확인: "+ hset.contains(123));
	
	
	
	
	
	
	///
	
	Set set = new HashSet();
	set.add(new Score("이창진",89));
	set.add(new Score("김수호",99));
	set.add(new Score("이원국",77));
	
	System.out.println("set: " + set);
	
	set.add(new Score("정다혜",66));
	set.add(new Score("김수호",99));
	
	System.out.println("set: " + set);
	System.out.println("setSize:" + set.size());
	
	
	//저장된 객체 하나씩 꺼내 접근
	//해결방법
	//1. toArray()
	Object[] arr = hset.toArray();
	for(int i=0; i<arr.length; i++) {
		System.out.println(i + " , " + arr[i]);
	}
	
	//2. Iterator()
	//Iterator() 로 줄을 세운후에 hasNext()로 뒤에있냐 반복
	//next()로 다음 객체를 출력
	Iterator iter = hset.iterator();
	
	while(iter.hasNext()) {
		System.out.println(iter.next());
	}
	
	//지우기
	hset.clear();
	System.out.println("empty?: " + hset.isEmpty());
	
	
	
	
	
	}
	
	
	
	
}
