package programmeFlow;

import java.util.Scanner;

import programmeFlow.controller.Controller;

public class ProgrammeFlow {

	private static Scanner sc = new Scanner(System.in);
	
	enum Menu {
		
		GRADE, MAX, MIN, SORT, RPS,
		TERMINATE,
		;
		
		public static Menu selectMenu() {
			
			for(Menu menu : Menu.values()) {
				System.out.print("[" +menu.ordinal() + "]" + menu + " ");
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
		
		}
	}
}
