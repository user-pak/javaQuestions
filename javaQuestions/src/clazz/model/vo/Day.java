package clazz.model.vo;

import java.util.GregorianCalendar;
import static java.util.GregorianCalendar.*;

public class Day {

	private int year = 1;
	private int month = 1;
	private int date = 1;
	
	private int[][] monthDates = {
			{31,29,31,30,31,30,31,31,30,31,30,31},
			{31,28,31,30,31,30,31,31,30,31,30,31},
	};
	
	private Day temp;
	
	public boolean isLeap(int year) {
		return year%4 == 0 && year%100 != 0 || year%400 == 0 ;
	}
	
	public int dayOfMonth(int year, int month) {
		return monthDates[isLeap(year)? 0 : 1][month-1];
	}
	
	private int adjustedMonth(int month) {
		return month < 1 ? 1 : month > 12? 12 : month;
	}
	
	private int adjustedDate(int year, int month, int date) {
		if(date < 1) return 1;
		int result = dayOfMonth(year, month);
		return date < result? date : result;
	}
	
	private int adjustedYear(int year) {
		return this.year = year == 0? 1 : year;
	}
	
	public Day() {
		GregorianCalendar today = new GregorianCalendar();
		this.year = today.get(YEAR);
		this.month = today.get(MONTH)+1;
		this.date = today.get(DATE);
	}
	public Day(int year) {
		this.year = adjustedYear(year);
	}
	public Day(int year, int month) {
		this(year);
		this.month = adjustedMonth(month);
	}
	public Day(int year, int month, int date) {
		this(year, month);
		this.date = adjustedDate(this.year, this.month, date);
	}
	public Day(Day day) {
		this(day.year, day.month, day.date);
	}
	public void setYear(int year) {
		this.year = adjustedYear(year);
		this.date = adjustedDate(this.year, this.month, this.date);
	}
	public void setMonth(int month) {
		this.month = adjustedMonth(month);
		this.date = adjustedDate(this.year, this.month, this.date);
	}
	public void setDate(int date) {
		this.date = adjustedDate(this.year, this.month, date);
	}
	public void set(int year, int month, int date) {
		this.year = adjustedYear(year);
		this.month = adjustedMonth(month);
		this.date = adjustedDate(this.year, this.month, date);
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
	public boolean isLeap() {
		return isLeap(this.year);
	}
	public int dayOfYear() {
		int days = this.date;
		for(int i = 1; i < this.month; i++) {
			days += dayOfMonth(this.year, i);
		}
		return days;
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
		
	public boolean equalTo(Day day) {
		return this.year == day.year && this.month == day.month && this.date == day.date;
	}
	@Override
	public String toString() {
		String[] day = {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
		return year + "/" + month + "/" + date + " " + day[dayOfWeek()];
	}

	public int leftDayOfYear() {
		// TODO Auto-generated method stub
		return 365 - dayOfYear() + (isLeap()? 1 : 0);
	}

	public void succeed() {
		// TODO Auto-generated method stub
		if(date < dayOfMonth(year, month)) date++;
		else {
			if(++month > 12) {
				year++;
				month = 1;
			}
			date = 1; 
		}
	}

	public void succeedDays(int some) {
		// TODO Auto-generated method stub
		if(some < 0) precedeDays(-some);
		else if(some > 0) {
			date += some;
			while(date > dayOfMonth(year, month)) {
				date -= dayOfMonth(year, month);
				if(++month > 12) {
					year++;
				month = 1;
				}
			}
		}
	}
	public void precedeDays(int some) {
		// TODO Auto-generated method stub
		if(some < 0) succeedDays(-some);
		else if(some > 0) {
			date -= some;
			while(date < 1) {
				if(--month < 1) {
					year--;
					month = 12;
				}
				date += dayOfMonth(year, month);
			}
		}
	}

	public void precede() {
		// TODO Auto-generated method stub
		if(date > 1) date--;
		else {
			if(--month < 1) {
				year--;
				month = 12;
			}
			date = dayOfMonth(year, month);
		}
	}

	public int compareTo(Day day, Day another) {
		// TODO Auto-generated method stub
		if(day.year > another.year) return 1;
		if(day.year < another.year) return -1;
		if(day.month > another.month) return 1;
		if(day.month < another.month) return -1;
		return day.date > another.date? 1 : day.date < another.date? -1 : 0;
	}

	public Day succeedingDay() {
		// TODO Auto-generated method stub
		temp = new Day(this);
		temp.succeed();
		return temp;
	}

	public Day precedingDay() {
		// TODO Auto-generated method stub
		temp = new Day(this);
		temp.precede();
		return temp;
	}

	public Day after(int some) {
		// TODO Auto-generated method stub
		temp = new Day(this);
		temp.succeedDays(some);
		return temp;
	}

	public Day before(int some) {
		// TODO Auto-generated method stub
		temp = new Day(this);
		temp.precedeDays(some);
		return temp;
	}

}
