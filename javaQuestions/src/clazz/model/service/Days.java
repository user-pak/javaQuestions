package clazz.model.service;

import java.util.Scanner;

import clazz.model.vo.Day;

public class Days {

	private Scanner sc = new Scanner(System.in);
	public void display(Day day) {
		
		System.out.println("Information about " + day);
		System.out.println("Is " +  day + " a leap year? " + (day.isLeap()?  "Yes" : "No"));
		System.out.println("elapsed days : " + day.dayOfYear());
		System.out.println("days left : " + day.leftDayOfYear());
	}

	public void change(Day day) {
		// TODO Auto-generated method stub
		System.out.println("[1] change year/month/date"
				+ " [2] change year"
				+ " [3] change month"
				+ " [4] change date"
				+ " [5] a day later"
				+ " [6] a day ahead"
				+ " [7] some day later"
				+ " [8] some day ahead");
		int change = sc.nextInt();
		int year = 0, month = 0, date = 0, some = 0;
		if(change == 1 || change == 2) {
			System.out.print("year : ");
			year = sc.nextInt();
		}if(change == 1 || change == 3) {
			System.out.print("month : ");
			month = sc.nextInt();
		}if(change == 1 || change == 4) {
			System.out.print("date : ");
			date = sc.nextInt();
		}if(change == 7 || change == 8) {
			System.out.print("how many : ");
			some = sc.nextInt();
		}
		switch(change) {
		case 1 : day.set(year, month, date); break;
		case 2 : day.setYear(year); break;
		case 3 : day.setMonth(month); break;
		case 4 : day.setDate(date); break;
		case 5 : day.succeed(); break;
		case 6 : day.precede(); break;
		case 7 : day.succeedDays(some); break;
		case 8 : day.precedeDays(some); break;
		}
		System.out.println(day);
	}

	public void compare(Day day) {
		// TODO Auto-generated method stub
		System.out.print("another year: ");
		int year = sc.nextInt();
		System.out.print("month: ");
		int month = sc.nextInt();
		System.out.print("date: ");
		int date = sc.nextInt();
		Day another = new Day(year, month, date);
		int result = day.compareTo(day, another);
		System.out.print(day);
		switch(result) {
		case -1 : System.out.println(" is ahead of " + another); break;
		case 1 : System.out.println(" is behind " + another); break;
		case 0 : System.out.println(" is the same day as " + another); break;
		}
	}

	public void beforeAfter(Day day) {
		// TODO Auto-generated method stub
		System.out.print("[1] tomorrow [2] yesterday [3] after some days [4] some days before : ");
		int choice = sc.nextInt();
		int some = 0;
		if(choice == 3 || choice == 4) {
			System.out.print("some : ");
			some = sc.nextInt();
		}
		switch(choice) {
		case 1 : System.out.println("Tomorrow is " + day.succeedingDay()); break;
		case 2 : System.out.println("Yesterday is " + day.precedingDay()); break;
		case 3 : System.out.println("After " + some + " days is " + day.after(some)); break;
		case 4 : System.out.println(day.before(some) + " is " + some + " days before " + day); break;
		}
	}
	
}
