package com.collection.part01_list_arrayListSort;


public class Score implements Comparable<Score> {
	private String name;
	private int score;
	
	public Score() {}
	public Score(String name, int score) {
		this.name =name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Score [name=" + name + ", score=" + score + "]";
	}
	@Override
	public int compareTo(Score o) {
		//name으로 기본정렬
		String otherName = o.getName();
		// int flag = name.compareTo(otherName);
		// return flag;
		return name.compareTo(otherName);
		//양수를 리턴하면 바꾼다, 음수를 리턴하면 그대로.
		
		
		
		
		//System.out.println(i.compareTo(i2));
		//0은 비교해서 같을때, 양수면 i가 클때, 음수면 i2가클때
		
		//"나".compareTo("가");	  => 양수 값을 리턴받는다.
		//앞에꺼가 크면 양수값이나온다.  << "나"
		//뒤에꺼가 크면 음수값이나온다.  << "가"가 클때
		
		//-"나".compartTo("가"); => -를 붙여줌으로서 음수를 리턴받는다 (앞에 값이 클때)
		
	}
	
	
	
	
	
	
	
	
	
}
