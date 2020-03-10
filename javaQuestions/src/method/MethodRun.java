package method;

import java.util.Scanner;

public class MethodRun {

	protected static Scanner sc = new Scanner(System.in);
//	private static Random random = new Random();
	
	enum Menu {
		
		SIGNOF, MIN, MED, SUMUP, PRINTSEASON, ISOSCELESTRIANGLE, RANDOMTESTER, INVERSENUMBER, MENTALARITHMETIC, SUMOF, MINOF,
		LINEARSEARCH, ARRAYREMOVE, ARRAYEXG, ARRAYCLONE, ARRAYSEARCHINDEX, ARRAYREMOVEOF, ARRAYINSOF, ADDMATRIX, ARRAYCLONETD,
		MINARRAY, ABSOLUTE, PRINTARRAY,
		TERMINATE,
	}
	
	private static Menu selectMenu() {
		
		for(Menu menu : Menu.values()) {
			System.out.print("["+ menu.ordinal() + "]" + menu + " ");
			if(menu.ordinal() %10 == 0) System.out.println();
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
				result = mc.sumUp(getNumber()); print(result, menu); break;
			case PRINTSEASON: mc.printSeason(getNumber(menu)); break;
							//mc.printSeason(getNumber()); break;
			case ISOSCELESTRIANGLE: mc.isoscelesTriangle(getNumber()); break;
			case RANDOMTESTER: 
				result = mc.randomTester(getNumber(), getNumber()); print(result, menu);  break;
			case INVERSENUMBER: mc.inverseNumber(getNumber(), menu); break;
			case MENTALARITHMETIC: mc.mentalArithmetic(); break;
			case SUMOF: mc.sumOf(getNumber()); break;
			case MINOF: mc.minOf(getNumber()); break;
			case LINEARSEARCH: mc.linearSearch(getNumber()); break;
			case ARRAYREMOVE: mc.arrayRemove(getNumber()); break;
			case ARRAYEXG: mc.arrayExchange(getNumber(), getNumber()); break;
			case ARRAYCLONE: mc.arrayClone(getNumber()); break;
			case ARRAYSEARCHINDEX: mc.arraySearchIndex(getNumber()); break;
			case ARRAYREMOVEOF: mc.arrayRemoveOf(getNumber()); break;
			case ARRAYINSOF: mc.arrayInsOf(getNumber()); break;
			case ADDMATRIX: mc.addMatrix(getNumber(), getNumber()); break;
			case ARRAYCLONETD: mc.arrayCloneTD(getNumber(), getNumber()); break;
			case MINARRAY: mc.minArray(getNumber(), getNumber(), getNumber()); break;
			case ABSOLUTE: mc.absolute(); break;
			case PRINTARRAY: mc.printArray(); break;
			case TERMINATE: return;
			
			}
		}while(menu == null);
	}

	private static void print(int result, Menu menu) {
		// TODO Auto-generated method stub
		System.out.println(menu + " is " + result);
	}

	private static int getNumber() {
		// TODO Auto-generated method stub
		int number;
		do {
			System.out.print("enter any number of Integer values: ");
			number = sc.nextInt();
		}while(number <= 0);
		sc.nextLine();
		return number;
	}
	
	private static int getNumber(Menu menu) {
		// TODO Auto-generated method stub
		int number = -1;
//		if(menu.equals("PRINTSEASON")) {
			do {
				System.out.print("enter any number of Integer values: ");
				number = sc.nextInt();
			}while(number < 1 || number > 12);
		sc.nextLine();
//		}
		return number;
	}
	
}
