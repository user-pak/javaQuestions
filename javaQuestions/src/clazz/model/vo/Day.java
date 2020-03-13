package clazz.model.vo;

import java.util.Calendar;

import java.util.GregorianCalendar;
import static java.util.GregorianCalendar.*;

import clazz.model.service.Days;

public class Day {

	private Days days = new Days();
	private int year = 1;
	private int month = 1;
	private int date = 1;
	
	public Day() {
		GregorianCalendar today = new GregorianCalendar();
		this.year = today.get(YEAR);
		this.month = today.get(MONTH)+1;
		this.date = today.get(DATE);
	}
	public Day(int year) {
		this.year = year == 0? 1 : year;
	}
	public Day(int year, int month) {
		this(year);
		this.month = month < 1? 1 : month > 12? 12 : month;
	}
	public Day(int year, int month, int date) {
		this(year, month);
		if(date < 1) this.date = 1;
		else {
			int result = days.dayOfMonth(new Day(year, month));
			this.date = date > result? result: date;
		}
	}
	public Day(Day day) {
		this(day.year, day.month, day.date);
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getYear() {
		return this.year;
	}
	public int getMonth() {
		return this.month;
	}
	public int getDate() {
		return this.date;
	}
	public void set(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}
	private int dayOfWeek() {
//		Zeller's Congruence
		int year = this.year;
		int month = this.month;
		if(month == 1 || month == 2) {
			year--;
			month += 12;
		}
		return (year+year/4-year/100+year/400+(13*month+8)/5 + this.date) %7;
	}
	private String printDay() {
		String[] day = {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
		return day[dayOfWeek()];
	}
	@Override
	public String toString() {
		return year + "/" + month + "/" + date + " " + printDay();
	}
}
