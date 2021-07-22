package com.chap05_date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Run {
	/*
	 * 1. Date
	 * 2. Calendar
	 * 3. GregorianCalendar	leapYear
	 * 4. SimpleDateFormat
	 * 5. Formatter
	 */
	
	
	
	
	public static void main(String[] args) {
		
//	String originTime = new Date(1000L).toGMTString();	
//	System.out.println(originTime);
	
		Date today = new Date();
		System.out.println(today);
		
		//원하는 패턴으로 출력
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-hh:mm:ss");
		System.out.println(sdf.format(today));

		System.out.println("-------캘린더----------");
		
		Calendar cal = Calendar.getInstance(); //현재 시간
		System.out.println(cal);
		
		cal.set(2020, 2-1, 22);
		
		System.out.println(cal);
		
		int year = cal.get(2);
		int month = cal.get(Calendar.MONTH) +1 ;
		int date = cal.get(Calendar.DATE);
		
		System.out.println(year+"년 "+ month + "월" + date + "일");
		
		System.out.println(cal.getTime());
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		System.out.println(sdf.format(cal.getTime()));
		
		cal.add(Calendar.YEAR, -9);
		cal.add(Calendar.MONTH, -3);
		
		System.out.println(cal.getTime());
		
		//타임존
//		for(String name : TimeZone.getAvailableIDs()) {
//			System.out.println(name);
//		}
		
		//	Etc/Greenwich
		
		System.out.println("================");
		TimeZone tz = TimeZone.getTimeZone("Etc/Greenwich");
		sdf1.setTimeZone(tz);
		System.out.println(sdf1.format(cal.getTime()));
		
		
		
		System.out.println("=======그레고리안 캘린더=======");
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc.getTime());
	}
	
	
	
	
	
	
	

}
