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

	public void statistics() {
		// TODO Auto-generated method stub
		int[] person = new int[getLength()];
		int[] score = new int[person.length];
		int sum = 0, min= score[0], max= score[0];
		for(int i = 0; i < person.length; i++) {
			score[i] = random.nextInt(100) + 1;
			System.out.print(score[i]+ " ");
			sum += score[i];
			if(max < score[i]) max = score[i];
			if(min > score[i]) min = score[i];
		}
		System.out.println("\nsum: " + sum + " avg: " + (sum/person.length) + " min: " + min + " max: " + max );
	}
}



