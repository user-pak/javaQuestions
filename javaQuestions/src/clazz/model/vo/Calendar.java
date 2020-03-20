package clazz.model.vo;

public class Calendar {

	private int[] mDays = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public int dayOfWeek(int year, int month, int date) {
		if(month == 1 || month == 2) {
			year--;
			month += 12;
		}
		return (year + year/4 - year/100 + year/400 + (13*month + 8)/5 + date) %7;
	}
	
	public boolean isLeap(int year) {
		return year%4 == 0 && year%100 !=0 || year%400 == 0;
	}
	
	public int monthDays(int year, int month) {
		if(month-- != 2) return mDays[month];
		return mDays[month] + (isLeap(year)? 1 : 0);
	}
	
	public void putCalendar(int year, int month) {
		int firstDay = dayOfWeek(year, month, 1);
		int monthDays = monthDays(year, month);
		
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
		System.out.println("-----------------------------");
		for(int i = 0; i < firstDay; i++) System.out.print("    ");
		for(int i = 1; i <= monthDays; i++) {
			System.out.printf("%4d", i);
			if(++firstDay % 7 == 0) System.out.println();
		}
	}
}
