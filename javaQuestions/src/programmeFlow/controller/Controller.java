package programmeFlow.controller;

import java.util.*;


public class Controller {

	private Scanner sc = new Scanner(System.in);
	private Random random = new Random();
	
	private double score;
	int retry, result, t;
	
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

	public void sign() {
		// TODO Auto-generated method stub
		int sign = 0;
		do {
			do {
				sign = getInt();
			}while(sign <100 || sign >999);
	    System.out.println(sign>0? "positive" :sign<0? "negative" : 0);
    	getRetry();
		}while(retry != 0);
	}

	private void getRetry() {
		System.out.print("1: continue 0: break ");
    	retry = sc.nextInt();
	}

	private int getInt() {
		// TODO Auto-generated method stub
//		do {
		System.out.print("int: ");
		result = sc.nextInt(); sc.nextLine();
//		}while(result == 0);
		return result;
	}

	public void howMany() {
		// TODO Auto-generated method stub
		int question = random.nextInt(10);
		int max = 5;
		int count = max;
		do {
			System.out.println("remaining count: " + count--);
			result = getInt();//
			if(result < question) System.out.println("bigger");
			else if(result > question) System.out.println("smaller");
		}while(result != question && count >0);
		if(result == question) System.out.println((max-count) + "tries");
		else System.out.println("the answer is " + question);
	}

	public void enumScope() {
		// TODO Auto-generated method stub
		int a = getInt();
		int b = getInt();
		if(a>b) {
			t = a; a = b; b = t;
		}
		for(int i= a; i <=b; i++) System.out.print(i + " ");
		do {
			System.out.print(a++ + " ");
		}while(a <=b);
	}

	public void countDown() {
		// TODO Auto-generated method stub
		int num, sum = 0;
		do {
			num = result = getInt();
		}while(result <=0);
		while(result >=0) System.out.print(result-- + " " );
		System.out.println("result: "+ result);
		for(int i = num; i >=0; i--) System.out.print(i + " ");
		System.out.println();
		int j =0;
		for(; j <num; j++) {
			System.out.print(j + " + ");
			sum += j;
		}
		if(j == num) {
			sum += num;
			System.out.print(j + " = " + sum);
		}
	}

	public void asterisk() {
		// TODO Auto-generated method stub
		int asterisk = getInt();
		if(asterisk > 0) {
			int i =0; 
			while(i++< asterisk) {
				if(i%2 == 1) System.out.print("*");// i==1
				else System.out.print("+");
			}
			System.out.println();
			int copy = asterisk;
			int j = 0;
			while(j++ < copy/2) System.out.print("*+");// j==0
			if(copy %2 == 1) System.out.print("*");
			System.out.println();
			for(int k =0; k < asterisk/5; k++) {
				System.out.print("*****\n");
			}
			int rest = asterisk %5;
			if(rest >0)
			for(int l =0; l < rest; l++) System.out.print("*");
		}
	}

	public void placeValue() {
		// TODO Auto-generated method stub
		int num = getInt();
		int value = 0;
		while(num > 0) {
			num /= 10;
			value++;
		}
		System.out.println("place value: " + value);
	}

	public void factorial() {
		// TODO Auto-generated method stub
		int num = getInt();
		int factorial = 1;
		for(int i =1; i <= num; i++) {
			factorial *= i;
			System.out.print(i+"[" + factorial+ "] ");
		}
		
	}

	public void standardWeight() {
		// TODO Auto-generated method stub
		System.out.print("1st:starting height 2nd:ending height 3th:step\n");
		int starting = getInt();
		int ending = getInt();
		int step = getInt();
		if(starting >100 && ending >100 && step >0) {
			for(int i = starting; i <= ending; i += step) {
				System.out.println("height: " + i + " weight: " + ((i -100)*0.9));
			}
		}
	}

	public void divisor() {
		// TODO Auto-generated method stub
		int num = getInt();
		int count =0;
		int copy = num;
		for(int i =1; i <= num; i++) {
			if(num %i == 0) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println("\ncount: " + count);
		for(int j =1, k =1; j <= num; j++, k= j*j) {
			System.out.print("[" + j + "]" + k + " ");
		}
	}

	public void square() {
		// TODO Auto-generated method stub
		int num = getInt();
		System.out.println("square");
		for(int i =0; i< num; i++) {
			for(int j=0; j <num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("isosceles triangle one");
		for(int i=0; i <num; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("isosceles triangle two");
		for(int i =0; i<num; i++) {
			for(int j=num-i; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("isoseles triangle three");
		for(int i = 1; i <= num; i++) {
			for(int j=0; j<num-i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("isoseles triangle four");
		for(int i=0; i<num; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<num-i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("pyramid");
		for(int i=1; i<= num; i++) {
			for(int j=1; j<=num-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=2*i-1; k++) {
				System.out.print(i%10);
			}
			System.out.println();
		}
		
	}

	public void primeNumber() {
		// TODO Auto-generated method stub
		int num = getInt();
		int i;
		for(i =2; i<num; i++) {
			if(num %i == 0) break;
		}
		if(i == num) System.out.println(num + " is a prime number");
		else System.out.println(num + " is not a prime number");
	}

	public void calculation() {
		// TODO Auto-generated method stub
		int count = getInt(); int num,i =0, sum =0, each=0 ;
		System.out.println("enter " + count + " numbers\n0: End");
		if(count >0) {
			for(; i<count; i++) {
				num = getInt();
				if(num == 0) break;
				if(num <0) {
					System.out.println("negative values not allowed");
					continue;
				}
				if(sum + num >1000) {
					System.out.println("sum should not exceed 1000");
					break;
				}
				sum += num;
				each++;
			}
		}
		if(i != 0) System.out.println("sum: " + sum + " avg: "+ sum/each);
	}

	public void realnumber() {
		// TODO Auto-generated method stub
//		int a = getInt(); int b = getInt(); int c = getInt();
//		int sum = a+b+c;
//		double avg = (double)sum/3;
//		System.out.println("sum: " + sum + " avg: " + avg);
		
	}
}
	
	

