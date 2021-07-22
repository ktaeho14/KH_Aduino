package com.collection.silsub2.comparator;

import java.util.Comparator;

import com.collection.silsub2.model.vo.Book;

public class AscCategory implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
			if(o1 instanceof Book && o2 instanceof Book) {
				return ((Book)o1).getCategory() - ((Book)o2).getCategory();
			}
			
			return 0;
	}

}
