package programmeFlow.controller;

import java.util.Random;
import java.util.Scanner;

public class Controller {

	private Scanner sc = new Scanner(System.in);
	private Random random = new Random();
	
	private double score;
	
	public void grade() {
		
		do {
			score = inputScore();
		}while(score <0 || score >100 );
		
		if(score <50) System.out.println("F");
		else if(score < 80) System.out.println("C");
		else System.out.println("A");
	}

	private double inputScore() {
		
		System.out.print("score: ");
		double score = sc.nextInt(); sc.nextLine();
		return score;
	}

	public void max() {
		// TODO Auto-generated method stub
		double a, b;
		a = inputScore();
		b = inputScore();
		
//		double max = one;
//		if(max < two) max = two;
//		System.out.println("max: " + max);
		System.out.println((a>b? "max: "+a+" min: "+b:a<b?"max: "+b+" min: " +a:"a=b"));
		double diff = a>=b? a-b: b-a;
		System.out.println("diff: " + (diff>=10?"+10":"-10"));
	}

	public void min() {
		// TODO Auto-generated method stub
		double a, b, c;
			a = inputScore();
			b = inputScore();
			c = inputScore();
		double min = a;
			if(min > b) min = b;
			if(min > c) min = c;
		System.out.println("min: " + min);
		
		double med;
			if(a >= b) {
				if(b >= c) med = b;
				else if(a >= c) med = c;
				else med = a;
			}
			else if(a > c) med = a;
			else if(c > b) med = b;
			else med = c;
		System.out.println("med: " + med);
	}

	public void sort() {
		// TODO Auto-generated method stub
		double a, b, c, t;
		a = inputScore();
		b = inputScore();
		c = inputScore();
		System.out.println("[before] a: " +a+"b: " +b+"c: "+c);
		if(a>b) {
			t = a; a = b; b = t;
		}
		if(b>c) {
			t = b; b = c; c = t;
		}
		if(a>b) {//retry
			t = a; a = b; b = t;
		}
		System.out.println("[after] a: " +a+"b: " +b+"c: "+c);
	}

	public void rockPaperScissors() {
		// TODO Auto-generated method stub
		System.out.print("RPS: ");
		switch(random.nextInt(3)) {
		case 0 : System.out.println("rock"); break;
		case 1 : System.out.println("paper"); break;
		case 2 : System.out.println("scissors"); break;
		}
		int what;
		do {
			System.out.print("month: ");
			what = sc.nextInt();
			switch(what) {
			case 3: case 4: case 5: System.out.println("spring"); break;
			case 6: case 7: case 8: System.out.println("summer"); break;
			case 9: case 10: case 11: System.out.println("autumn"); break;
			case 12 : case 1: case 2: System.out.println("winter"); break;
			}
		}while(what >0 && what <13);
	}
}
	
	

