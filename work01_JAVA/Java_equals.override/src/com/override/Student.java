package com.override;

public class Student {
	//필드
	private String name;
	
	//기본생성자
	public Student() {}

	
	//매개변수 생성자
	public Student(String name) {
		this.name = name;
	}
	
/*
	//동등성만들기
	@Override
	public boolean equals(Object obj) {
		Student s =(Student)obj;
		return this.name == s.name;
	}
//		equals라는 메소드를 오버라딩시켜 obj라는 매개변수에 name을 넣어
//		자식 클래스로 형변환을 시킨후에 리턴값으로
//		필드값과 형변환시킨 name값을 비교한다
	*/
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj==null) {
			return false;
			
		}
		
		Student other = (Student)obj;
		
		if(this.name == null) {
			if(other.name!=null) {
				return false;
			}
		}
			
		
		if(!this.name.equals(other.name)) {
			return false;
		}
		
		
		
		
		
		
		
		
		
		
		return true;
	}
	
	
	@Override
	public int hashCode() {
		return (name).hashCode();
	}
	
	
	
public static void main(String[] args) {
		Student s1 = new Student("egoing");
		Student s2 = new Student("김수호");
		
		Student s3 = new Student("egoing");
		Student s4 = new Student("김수호");
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		System.out.println(s1.hashCode());
		System.out.println(s3.hashCode());
	}

}
