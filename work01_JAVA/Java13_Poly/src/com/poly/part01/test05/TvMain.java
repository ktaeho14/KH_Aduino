package com.poly.part01.test05;

public class TvMain {

	public static void main(String[] args) {
		//lg tv(+1)와 samsung tv(+3)를 만들어
		//볼륨 업/다운을 완성 하고
		//생성자 호출 될시 "tv가 켜졌습니다"라고 출력
		
		//tvClosed() 메소드를 만들어 호출하면
		//"tv가 꺼졌습니다." 출력
		
		
		
		Samsung_tv sg = new Samsung_tv();
		
		System.out.println(sg.volUp());
		System.out.println(sg.volUp());
		System.out.println(sg.volUp());
		
		System.out.println(sg.volDown());
		System.out.println(sg.volDown());
		System.out.println(sg.volDown());
		
		sg.tvClosed();
		
		
		
	}

}
