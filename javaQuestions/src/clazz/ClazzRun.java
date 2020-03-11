package clazz;

import java.util.Scanner;

import clazz.controller.ClazzController;

public class ClazzRun {

	private static Scanner sc = new Scanner(System.in);
	
	enum Menu {
		
		HUMANTESTER, GETPASSWORD, CARTESTER,
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
		}
	}
}
