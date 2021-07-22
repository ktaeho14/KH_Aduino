package com.collection.part01_list_arrayListSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ScoreManager {
	
	public void scoreSort() {
		List list = new ArrayList();
		
		list.add(new Score("김수호",99));
		list.add(new Score("고혜림",75));
		list.add(new Score("권민지",52));
		
		
		list.add(new Score("김태호",86));
		list.add(new Score("정수빈",32));
		list.add(new Score("김동주",68));
		
		
		System.out.println("list: " + list);
		
		//정렬
		//1. Comparable - 기본 정렬 기준 구현
		Collections.sort(list);
		System.out.println("list: " + list);
		
		//2. Comparator = 기본 정렬 기준 외에 다른 기준으로 정렬
		Collections.sort(list, new ScoreSorting());
		System.out.println("Comparator: " + list);
		
		list.sort(new ScoreSorting2());
		System.out.println(list);
		
		System.out.println("===============");
		list.sort(null);
		System.out.println(list);
	}
}
