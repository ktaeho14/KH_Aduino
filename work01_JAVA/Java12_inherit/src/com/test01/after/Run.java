package com.test01.after;

import java.util.Date;

public class Run {

	public static void main(String[] args) {
		TeleVision t = new TeleVision("»ï¼º","03","t-321","»ï¼ºtv",50000,new Date(),46);
		
		System.out.println(t.prn());
		
		Desktop d = new Desktop("»ï¼º","01","s-123","»ï¼ºÄÄÇ»ÅÍ",10000,new Date(),"i9",500,16,"window",false);
		
		System.out.println(d.prn());
		
		SmartPhone s = new SmartPhone("»ï¼º","02","g-321","°¶·°½Ãs21",800000, new Date(), "Ä÷ÄÄ",1024,16,"android","KT");
		System.out.println(s.prn());
		
		System.out.println(s.getBrand());
	
	}

}
