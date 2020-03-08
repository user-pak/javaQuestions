package method;

import java.util.Scanner;

public class MethodRun {

	protected static Scanner sc = new Scanner(System.in);
	
	enum Menu {
		
		SIGNOF, MIN, MED, SUMUP, PRINTSEASON, ISOSCELESTRIANGLE, RANDOMTESTER,
		TERMINATE,
	}
	
	private static Menu selectMenu() {
		
		for(Menu menu : Menu.values()) {
			System.out.print("["+ menu.ordinal() + "]" + menu + " ");
		}
		int choice = sc.nextInt();
		for(Menu menu: Menu.values()) {
			if(menu.ordinal() == choice) return menu;
		}
		return null;
	}
	
	public static void main(String[] args) {
	
		MethodController mc = new MethodController();
		Menu menu; int result;
		do {
			switch(menu = selectMenu()) {
			case SIGNOF: 
				result = mc.signOf(getNumber()); print(result, menu); break;
			case MIN: 
				result = mc.min(getNumber(),getNumber(),getNumber()); print(result, menu); break;
			case MED:
				result = mc.med(getNumber(),getNumber(),getNumber()); print(result, menu); break;
			case SUMUP:
				result = mc.sumUp(getNumber(menu)); print(result, menu); break;
			case PRINTSEASON:// mc.printSeason(getNumber(menu)); break;
								mc.printSeason(getNumber()); break;
			case ISOSCELESTRIANGLE: mc.isoscelesTriangle(getNumber()); break;
			case RANDOMTESTER: mc.randomTester(); break;
			case TERMINATE: return;
			
			}
		}while(menu == null);
	}

	private static int getNumber(Menu menu) {
		// TODO Auto-generated method stub
		int number = -1;
		switch(menu) {
		case SUMUP: case ISOSCELESTRIANGLE:
			do {
				number = getNumber();
			}while(number <= 0);
		case PRINTSEASON:
			do {
				number = getNumber();
			}while(number < 1 || number > 12);
		}
		return number;
	}

	private static void print(int result, Menu menu) {
		// TODO Auto-generated method stub
		System.out.println(menu + " is " + result);
	}

	private static int getNumber() {
		// TODO Auto-generated method stub
		System.out.print("enter any number of Integer values: ");
		int number=  sc.nextInt();
		sc.nextLine();
		return number;
	}
}
