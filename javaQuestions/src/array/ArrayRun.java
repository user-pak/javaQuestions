package array;

import java.util.Scanner;

public class ArrayRun {

	enum Menu {
		PRINTINT, PRINTDOUBLE, BARGRAPH, STATISTICS,
		TERMINATE,
	}
	
	private static Scanner sc = new Scanner(System.in);
	
	public static Menu selectMenu() {
		
		for(Menu menu : Menu.values()) {
			System.out.print("[" + menu.ordinal() + "]" + menu + " ");
		}
		int choice = sc.nextInt();
		for(Menu menu : Menu.values()) {
			if (menu.ordinal() == choice) return menu;
		}
		return null;
	}
	
	public static void main(String[] args) {
		
		Menu menu;
		ArrayController ac = new ArrayController();
		do {
			menu = selectMenu();
		}while(menu == null);
		switch(menu) {
		case PRINTINT: ac.printInt(); break;
		case PRINTDOUBLE: ac.printDouble(); break;
		case BARGRAPH: ac.barGraph(); break;
		case STATISTICS: ac.statistics(); break;
		case TERMINATE : return;
		}
	}
}
