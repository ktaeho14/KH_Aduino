package com.silsub1.objArr.run;

import com.silsub1.objArr.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		
		
		
		Student st[] = new Student[3];
		
		
		st[0]=new Student(3, 1, 1, "ȫ�浿");
		st[1]=new Student(4, 3, 2,"������");
		st[2]=new Student(2, 7, 5, "������");
		
		
		
		
		for(int i = 0; i<st.length; i++) {
		System.out.println(st[i].information());
		
		}
		
		
	
		
		
		
		
			
		
		
		
		
		
		
		
		
		
	}

}
