package programmeFlow;

import java.util.Scanner;

import programmeFlow.controller.Controller;

public class ProgrammeFlow {

	private static Scanner sc = new Scanner(System.in);
	
	enum Menu {
		
		GRADE, MAX, MIN, SORT, RPS, SIGN, GUESS, ENUM, COUNTDOWN, ASTERISK, PLACEVALUE, 
		FACTORIAL, STANDARDWEIGHT, DIVISOR, SQUARE, PRIMENUMBER, CALCULATION,
		TERMINATE,
		;
		
		public static Menu selectMenu() {
			
			for(Menu menu : Menu.values()) {
				System.out.print("[" +menu.ordinal() + "]" + menu + " ");
				if(menu.ordinal() !=0 && menu.ordinal() %10 == 0) System.out.println();
			}
			
			int menuNo = sc.nextInt();
			
			for(Menu menu : Menu.values()) {
				if(menuNo == menu.ordinal()) return menu;
			}
			return null;
		}
	}
	
	public static void main(String[] args) {
		Menu menu;
		Controller cont = new Controller();
		
		do {
			menu  = Menu.selectMenu();
		}while(menu == null);
		
		switch(menu) {
		case GRADE : cont.grade(); break;
		case MAX : cont.max(); break;
		case MIN : cont.min(); break;
		case SORT : cont.sort(); break;
		case RPS : cont.rockPaperScissors(); break;
		case SIGN : cont.sign(); break;
		case GUESS : cont.howMany(); break;
		case ENUM : cont.enumScope(); break;
		case COUNTDOWN : cont.countDown(); break;
		case ASTERISK : cont.asterisk(); break;
		case PLACEVALUE : cont.placeValue(); break;
		case FACTORIAL : cont.factorial(); break;
		case STANDARDWEIGHT: cont.standardWeight(); break;
		case DIVISOR: cont.divisor(); break;
		case SQUARE : cont.square(); break;
		case PRIMENUMBER : cont.primeNumber();break;
		case CALCULATION : cont.calculation(); break;
		}
	}
}
