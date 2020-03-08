package method;

import java.util.Scanner;

public class MethodController {

	public int signOf(int number) {
		
		int sign = 0;
		if(number > 0) sign = 1;
		else if(number < 0) sign = -1;
		return sign;
	}

	public int min(int a, int b, int c) {
		// TODO Auto-generated method stub
		int min = a;
		if(min > b) min = b;
		if(min > c) min = c;
		return min;
	}

	public int med(int a, int b, int c) {
		// TODO Auto-generated method stub
		if(a >= b)
			if(b >= c) return b;
			else if(a >= c) return c;
			else return a;
		else if(a > c) return a;
			else if(b > c) return c;
			else return b;
	}

	public int sumUp(int number) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 1; i <= number; i++) {
			sum += i;
		}
		return sum;
	}

	public void printSeason(int number) {
		// TODO Auto-generated method stub
		switch(number) {
		case 3: case 4: case 5: System.out.println("spring"); break;
		case 6: case 7: case 8: System.out.println("summer"); break;
		case 9: case 10: case 11: System.out.println("autumn"); break;
		case 1: case 2: case 12: System.out.println("winter"); break;
		default: System.out.println("wrong"); return;
		}
	}

	public void isoscelesTriangle(int number) {
		// TODO Auto-generated method stub
		char ch = putChar(number);
		for(int i = 1; i <= number; i++) {
			drawChar(ch, i);
			System.out.println();
		}
	}

	private char putChar(int number) {
		System.out.print("character: ");
		return MethodRun.sc.nextLine().charAt(0);
	}

	private void drawChar(char ch, int number) {
		while(number-- > 0) System.out.print(ch);
	}

	public void randomTester() {
		// TODO Auto-generated method stub
		
	}
}
