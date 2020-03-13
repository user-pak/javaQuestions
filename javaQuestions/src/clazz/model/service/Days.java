package clazz.model.service;

import java.util.Calendar;

import clazz.model.vo.Day;

public class Days {

	private Calendar calendar = Calendar.getInstance();
//	private int year = calendar.get(Calendar.YEAR);
//	private int month = calendar.get(Calendar.MONTH) + 1;
//	private int date = calendar.get(Calendar.DATE);
	
	private int[][] monthDates = {
			{31,29,31,30,31,30,31,31,30,31,30,31},
			{31,28,31,30,31,30,31,31,30,31,30,31},
	};
	
	public boolean isLeap(Day day) {
		int year = day.getYear();
		return year%4 == 0 && year%100 !=0 || year%400 == 0; 
	}
	
	public int dayOfMonth(Day day) {
		int month = day.getMonth();
		return monthDates[isLeap(day)? 0 : 1][month -1];
	}
	
}
