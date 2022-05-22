package com.chap05.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Run {

	public static void main(String[] args) {
		//Date
		//Date date = new Date(0L);
		//System.out.println(date);
		
		//현재날짜
		Date today = new Date();
		System.out.println(today);
		
		//원하는 포맷으로 출력
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
		System.out.println(sdf.format(today));
		
		
		//System.out.println(today.getDay());
		
		System.out.println("======캘린더=====");
		Calendar calendar = Calendar.getInstance(); //현재시간
		System.out.println(calendar);
		calendar.set(2019, 9-1, 9);
		
		//숫자 1을 넣으면 년도가 나온다
		int year = calendar.get(1);
		//1이 모자라서 1을 더해준다
		int month = calendar.get(Calendar.MONTH)+1;
		int date = calendar.get(Calendar.DATE);
		int hour = calendar.get(Calendar.HOUR);
		int min = calendar.get(Calendar.MINUTE);
		int sec = calendar.get(Calendar.SECOND);
		
		System.out.println(year + "년 " + month + "월 " + date + "일 " + hour + ":" + min + ":" + sec);
		System.out.println(calendar.getTime());
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf1.format(calendar.getTime() ));
		
		Calendar cal = (Calendar)calendar.clone();
		cal.add(Calendar.YEAR, -9);
		cal.add(Calendar.MONTH, -3);
		cal.add(Calendar.DATE, 20);
	
		System.out.println(cal.getTime());
		
		System.out.println("==========그레고리안========");
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc.getTime());
		
		System.out.println("year : " + gc.get(GregorianCalendar.YEAR));
		System.out.println("month : " + gc.get(Calendar.MONTH));
		System.out.println("date : " + gc.get(5));
		
		//is를 붙이면 맞냐 아니냐를 확인 해준다
		System.out.println(gc.isLeapYear(2020));
	}

}
