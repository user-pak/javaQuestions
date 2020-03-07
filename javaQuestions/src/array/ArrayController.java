package array;

import java.util.Random;
import java.util.Scanner;

public class ArrayController {

	private Scanner sc = new Scanner(System.in);
	private Random random = new Random();
	
	private int getLength() {
		int length;
		do {
			System.out.print("array.length(int): ");
			length = sc.nextInt();
		}while(length <= 0);
			return length;
	}
	
	public void printInt() {
		// TODO Auto-generated method stub
		int length = getLength();
		int[] arr = new int[length];
		System.out.print("arr = {");
		if(length >=2) {
		for(int i = 0; i < arr.length -1; i++) {
			arr[i] = 5 - i;
			System.out.print(arr[i] + " ,");
			}
		}
		if(length >=1)
		System.out.print(arr[arr.length-1] + "}");
		}
	
	public void printDouble() {
		Double[] arr = new Double[getLength()];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (i+1) * 1.1;
			System.out.print(arr[i] + " ");
		}
	}

	public void barGraph() {
		// TODO Auto-generated method stub
		int[] arr = new int[getLength()];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(10) + 1; 
		}
		for(int i = 10; i > 0; i--) {
			for(int j = 0; j < arr.length; j++) {
				if(arr[j] >= i) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}

	public void pointSumAvg() {
		// TODO Auto-generated method stub
		int[] person = new int[getLength()];
		int[] score = new int[person.length];
		for(int i = 0; i < person.length; i++) {
			score[i] = random.nextInt(100) + 1;
			System.out.print(score[i]+ " ");
		}
		int sum = 0, min= score[0], max= score[0];
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
			if(max < score[i]) max = score[i];
			if(min > score[i]) min = score[i];
		}
		System.out.println("\nsum: " + sum + " avg: " + (sum/person.length) + " min: " + min + " max: " + max );
		int length = getLength();
		double[] arr = new double[length];
		double sumB = 0;
		for(int i = 0; i < arr.length; i++) {
			System.out.print("arr["+ i + "] = ");
			arr[i] = sc.nextDouble();
			sumB += arr[i];
		}
		System.out.println("sum: " + sumB + " avg: " + sumB/length);
	}

	public void linearSearchTop() {
		// TODO Auto-generated method stub
		int length = getLength();
		int[] arr = new int[length];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(100) + 1;
			System.out.print(arr[i] + " ");
		}
		int i, j, search = getLength();
		for(i = 0; i < arr.length; i++) {
			if(search == arr[i]) {
				System.out.println(i);
				break;
			}
		}
		if(i == length)
		System.out.println("nothing");
		for(j = arr.length-1; j >= 0 ; j--) {
			if(arr[j] == search) {
				System.out.println(j);
				break;
			}
		}
		if(j == length)
		System.out.println("nothing");
	}

	public void arrayRandX() {
		// TODO Auto-generated method stub
		int length;
		do {
			length = getLength();
		}while(length > 10);
		int[] arr = new int[length];
		arr[0] = random.nextInt(10) + 1;
		for(int i = 1 ; i < arr.length; i++) {
			arr[i] = random.nextInt(10) + 1; 
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					arr[i] = random.nextInt(10) + 1;
					break;
				}
			}
		}
		for(int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
		System.out.println();
//		arr[0] = random.nextInt(10) + 1;
		for(int j = 1; j < arr.length; j++) {
			do {
				arr[j] = random.nextInt(10) + 1;
			}while(arr[j] == arr[j-1]);
		}
		for(int k = 0; k < arr.length; k++)
		System.out.print(arr[k] + " ");
		System.out.println();
		for(int l = 0; l < arr.length; l++) {
			int m;
			do {
				arr[l] = random.nextInt(10) + 1;
				for(m = 0; m < l; m++) {
					if(arr[m] == arr[l]) break;
				}
			}while(m < l);
		}
		for(int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
	}

	public void shuffle() {
		// TODO Auto-generated method stub
		int length = getLength();
		int[] arr = new int[length];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(10)+ 1;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
//		for(int i = 0; i < 10; i++) {
//			int idxA = random.nextInt(length);
//			int idxB = random.nextInt(length);
//			int temp = arr[idxA];
//			arr[idxA] = arr[idxB];
//			arr[idxB] = temp;
//		}
		// Fisher-Yates algorithm ??
		for(int i = arr.length -1; i > 0; i--) {
			int n = random.nextInt(i+1);
			if(i != n) {
				int temp = arr[i];
				arr[i] = arr[n];
				arr[n] = temp;
			}
		}
		for(int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
	}

	public void copyArrayReverse() {
		// TODO Auto-generated method stub
		int[] arr = new int[getLength()];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(10) + 1;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		int[] arrB = new int[arr.length];
		for(int i = 0; i < arrB.length; i++) {
			arrB[i] = arr[arr.length-1-i];
			System.out.print(arrB[i] + " ");
		}
	}

	public void monthCAI() {
		// TODO Auto-generated method stub
		String[] months = {"JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
		int question = -1, month, retry = -1;
		do{
			do {
			month = random.nextInt(12);
			}while(question == month);
			question = month;
			System.out.print("what month is " + (month+1) + "? :");
			String answer = sc.nextLine().trim();
			if(answer.equalsIgnoreCase(months[month])) System.out.println("correct");
			else System.out.println("incorrect");
			System.out.print("try again?(Y/N): ");
			if(String.valueOf(sc.nextLine().charAt(0)).equalsIgnoreCase("y")) retry = 0;
		}while(retry == 0);
	}

	public void dayCAI() {
		// TODO Auto-generated method stub
		String[] days = {"일","월","화","수","목","금","토"};
		String[] EngDays = {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
		int idx, question = -1;
		while(true) {
			do {
				idx = random.nextInt(7);
			}while(question == idx);
			question = idx;
			System.out.print("what is " + days[idx] + "요일 in English?: ");
			String answer = sc.nextLine().trim();
			if(EngDays[idx].equalsIgnoreCase(answer)) System.out.println("correct");
			else System.out.println("incorrect");
		}
	}

	public void matrixProduct() {
		// TODO Auto-generated method stub
		int[][] matA = new int[4][3];
		int[][] matB = new int[3][4];
		int[][] matMulti = new int[4][4];
		for(int i = 0; i < 4; i ++) {
			for(int j = 0; j < 3; j++) {
				matA[i][j] = random.nextInt(10) +1;
			}
		}
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				matB[i][j] = random.nextInt(10) +1;
			}
		}
		for(int i = 0; i < 4; i++) { 
			for(int j = 0; j < 4; j++) {
//				matMulti[i][j] = 0;
				for(int k = 0; k < 3; k++) {
					matMulti[i][j] += matA[i][k] * matB[k][j];
//					c[i][j] = (a[i][0] * b[0][j]) + (a[i][1] * b[1][j]) + (a[i][2] * b[2][j]) ??
				}
			}
		}
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(matMulti[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void pointTotalization() {
		// TODO Auto-generated method stub
		int person, subject;
		do {
			System.out.print("person: " );
			person = sc.nextInt();
			System.out.print("subject: ");
			subject = sc.nextInt();
		}while(person < 0 || subject < 0);
		int[][] points = new int[person][subject];
		int[] sumP = new int[person];
		int[] sumS = new int[subject];
		
		
	}
}



