package test.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [][] array = {{12, 41, 36, 56}, {82, 10, 12, 61}, {14, 16, 18, 78}, {45, 26, 72, 23}};
		int count = 0;
		int[] copyArray = new int[8];
		for(int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if(array[i][j] % 3 == 0) {
					copyArray[count++] = array[i][j];
					for(int k = copyArray.length; k < 1; k++) {
						if(copyArray[k] == copyArray[k-1]) {
							count--;
						}
					}
				}
			}
		}
		for(int i = 0; i < copyArray.length; i++) {
			System.out.print(copyArray[i] + " ");
		}


	}

}
