package com.test02;

public class Score {

	public double getAvg(int kor, int eng, int math) {
		//매개 변수로 넘어오는 3과목의 평균 점수를 구해 리턴
		
		double avg = (double)(kor+eng+math)/3;
		return avg;
		
		
		
		
		
		
	}
	
	
	public String getGrade(double avg) {
		//매개변수로 넘어오는 평균 점수의 등급을 구하여 리턴
		//100~90 : A
		//89~70  : B
		//69~50  : C
		//default : F
		//switch문 사용
		String grade="";
		
		
		
		
		switch((int)avg/10) {
		case 10:
		case 9:
			grade="A";
		break;
		
		case 8:
		case 7:
			grade="B";
		break;
		
		case 6:
		case 5: 
			grade="C";
		break;
		
		default:
			grade="F";
			
		}
		return grade;
	}
	
	
	
}
