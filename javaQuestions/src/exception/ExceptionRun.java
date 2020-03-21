package exception;

import java.util.Scanner;

public class ExceptionRun {

	enum Menu {
		MULDIV2, THROWANDCHATCH, INIT, TERM, RANGEERRORTESTER, REVERSEERROR,
	}
	
	public static Menu selectMenu() {
		Scanner sc = new Scanner(System.in);
		
		for(Menu menu : Menu.values()) {
			System.out.print("[" + menu.ordinal() + "]" + menu + " ");
		}
		int choice = sc.nextInt(); sc.nextLine();
		for(Menu menu : Menu.values()) {
			if(menu.ordinal() == choice) return menu;
		}
		return null;
	}
	public static void main(String[] args) {
		
		Menu menu = selectMenu();
		ExceptionController cont = new ExceptionController();
		switch(menu) {
		case MULDIV2 : cont.mulDiv2(); break;
		case THROWANDCHATCH : cont.test(); break;
		case INIT: cont.init(); break;
		case TERM: cont.term(); break;
		case RANGEERRORTESTER: cont.rangeErrorTester(); break;
		case REVERSEERROR: cont.reverseArr(); break;
		}
	}
}
