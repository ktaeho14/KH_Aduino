package com.test01;

public class ArrayTest03 {

	public static void main(String[] args) {
		ArrayTest03 at = new ArrayTest03();
		//at.shallowCopy();
		//at.deepCopy();
		//at.deepCopy2();
		at.deepCopy3();
	}

	public void shallowCopy() {
		//얕은복사
		int[] oArr = {1,2,3,4,5};
		int[] cArr = oArr;
		
		//원본
		String str = " ";
		for(int i=0; i<oArr.length; i++) {
			str +=oArr[i] + " ";
		}
		System.out.println("1.oArr : " + str);
		
		//복사본
		str = "";
		for(int i =0;i<cArr.length;i++) {
			str += cArr[i] + " ";
			
		}
		System.out.println("2.cArr : " + str);
		
		
		//원본 배열 인덱스 0의 값을 99로 변경
		oArr[0] = 99;
		
		str = "";
		for(int i=0; i<oArr.length;i++) {
			str += oArr[i] + " ";
		}
		
		System.out.println("1.oArr : " + str);
		
		
		str ="";
		for(int i =0;i<cArr.length;i++) {
			str +=cArr[i] + " ";
		}
		System.out.println("2.cArr : " + str);
		
		//
		System.out.println("oArr의 hashcode" + oArr.hashCode());
		System.out.println("cArr의 hashcode" + cArr.hashCode());
		
		
		
		
	}
	
	public void deepCopy() {
		//깊은복사
		int[] oArr = {1,2,3,4,5};
		int[] cArr = new int[5];
		
		//for문을 이용하여 1:1로 값을 복사
		for(int i=0;i<oArr.length;i++) {
			cArr[i]=oArr[i];
		}
		
		
		//원본출력
		String str = " ";
		for(int i = 0; i<oArr.length;i++) {
			str+=oArr[i]+ " ";
		}
		
		System.out.println("1.oArr : " + str);
		//복사본 출력
		str = " ";
		for(int i=0;i<cArr.length;i++) {
			str += cArr[i] + " ";
		}
		System.out.println("2.cArr : " + str);
		
		
		
		
		
		//원본 배열 인덱스 0의 값을 99로 변경
		oArr[0] = 99;
		
		str =" ";
		for(int i=0; i<oArr.length; i++) {
			str += oArr[i] + " ";
		}System.out.println("oArr : " + str);
		
		str=" ";
		for(int i=0; i<cArr.length; i++) {
			str +=cArr[i] + " ";
		}System.out.println("cArr : " + str);
		
		
		System.out.println("oArr의 hashcode : " + oArr.hashCode());
		System.out.println("cArr의 hashcode : " + cArr.hashCode());
		
		
		
		
		
	}
	
	
	public void deepCopy2() {
		//2.arraycopy()
		//java.lang.System에 있는 arraycopy()
		int[] oArr = {1,2,3,4,5};
		int[] cArr = new int[10];
		
		
		System.arraycopy(oArr, 0, cArr, 5, oArr.length-1);
		//arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
		//src: 원본배열, srcPos:복사 시작위치
		//dest: 카피배열, dstPos:붙여넣기 시작위치
		//length: 복사될 길이
		
		String str = " ";
		for(int i =0; i<oArr.length; i++) {
			str += oArr[i] + " ";
		}
		System.out.println("oArr : " + str);
		
		str = " ";
		for(int i =0; i<cArr.length; i++) {
			str += cArr[i] + " ";
		}
		System.out.println("cArr : " + str);
		
		System.out.println(oArr.hashCode());
		System.out.println(cArr.hashCode());
	}
	
	public void deepCopy3() {
		//clone()
		
		int[] oArr = {1,2,3,4,5};
		int[] cArr = new int[10];		
		
		System.out.println("cArr의 hashcode : " + cArr.hashCode());
		
		cArr = oArr.clone();
		
		System.out.println("복사된 cArr의 hashcode : " + cArr.hashCode());
		System.out.println(cArr.length);
		
		String str = " ";
		for(int i =0; i<cArr.length; i++) {
			str += cArr[i] + " ";
	}
	System.out.println("cArr 의 값 : " + str);
	
	
	
	
	
	}
	
}
