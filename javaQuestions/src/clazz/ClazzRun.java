package clazz;

import java.util.Scanner;

import clazz.controller.ClazzController;

public class ClazzRun {

	private static Scanner sc = new Scanner(System.in);
	
	enum Menu {
		
		HUMANTESTER, GETPASSWORD, CARTESTER, COORDINATETESTER, HUMANARRAYTESTER, DAYTESTER, ACCOUNTTESTER, PERIODTESTER, IDTESTER,
		MATHMETHOD,
//		public static final String HUMANTESTER = new Menu();
		;
		
		public static Menu selectMenu() { 
			
			for(Menu menu : Menu.values()) {
				System.out.print("[" + menu.ordinal() + "]" + menu + " ");
			}
			int choice = sc.nextInt();
			for(Menu menu : Menu.values()) {
				if(choice == menu.ordinal()) return menu;
			}
			return null;
		}
	}
	
	
	public static void main(String[] args) {
		
		ClazzController cc = new ClazzController();
		Menu menu = Menu.selectMenu();
		
		switch(menu) {
		case HUMANTESTER : cc.humanTester(); break;
		case GETPASSWORD: cc.getPassword(); break;
		case CARTESTER: cc.carTester(); break;
		case COORDINATETESTER: cc.CoordinateTester(); break;
		case HUMANARRAYTESTER: cc.HumanArrayTester(); break;
		case DAYTESTER: cc.dayTester(); break;
		case ACCOUNTTESTER: cc.accountTester(); break;
		case PERIODTESTER: cc.periodTester(); break;
		case IDTESTER: cc.idTester(); break;
		case MATHMETHOD: cc.mathMethod(); break;
		}
	}
}
