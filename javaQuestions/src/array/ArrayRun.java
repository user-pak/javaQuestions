package array;

import java.util.Scanner;

public class ArrayRun {

	enum Menu {
		PRINTINT, PRINTDOUBLE, BARGRAPH, POINTSUMAVG, LINEARSEARCHTOP, ARRAYRANDX, SHUFFLE, COPYARRAYREVERSE, MONTHCAI, DAYCAI,
		MATRIXPRODUCT, POINTTOTALIZATION,
		TERMINATE,
	}
	
	private static Scanner sc = new Scanner(System.in);
	
	public static Menu selectMenu() {
		
		for(Menu menu : Menu.values()) {
			System.out.print("[" + menu.ordinal() + "]" + menu + " ");
			if(menu.ordinal() !=0 && menu.ordinal() %10 == 0) System.out.println();
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
		case POINTSUMAVG: ac.pointSumAvg(); break;
		case LINEARSEARCHTOP: ac.linearSearchTop(); break;
		case ARRAYRANDX: ac.arrayRandX(); break;
		case SHUFFLE: ac.shuffle(); break;
		case COPYARRAYREVERSE: ac.copyArrayReverse(); break;
		case MONTHCAI: ac.monthCAI(); break;
		case DAYCAI: ac.dayCAI(); break;
		case MATRIXPRODUCT: ac.matrixProduct(); break;
		case POINTTOTALIZATION: ac.pointTotalization(); break;
		case TERMINATE : return;
		}
	}
}
