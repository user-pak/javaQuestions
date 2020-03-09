package method;

import java.util.Random;
import java.util.Scanner;

import method.MethodRun.Menu;

public class MethodController {

	private Random random = new Random();
	private Scanner sc = new Scanner(System.in);
	
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

	public int randomTester(int min, int max) {
		// TODO Auto-generated method stub
		int number;
		if(min >= max) number = max;
		else number = min + random.nextInt(max - min +1); //number >= min && number <= max
		return number;
	}

	public void inverseNumber(int positive, Menu menu) {
		// TODO Auto-generated method stub
		System.out.print(menu + " : ");
		for(int i = positive; i > 0; i /= 10) System.out.print(i%10);
	}

	public void mentalArithmetic() {
		// TODO Auto-generated method stub
		int x = random.nextInt(10) + 1;
		int y = random.nextInt(10) + 1;
		int z = random.nextInt(10) + 1;
		int pattern = random.nextInt(4);
		
		int result = -1;
		switch(pattern) {
		case 0 : result = x + y + z; break;
		case 1 : result = x + y - z; break;
		case 2 : result = x - y + z; break;
		case 3 : result = x - y - z; break;
		}
		System.out.println(x + (pattern < 2 ? " + " : " - ") + y + (pattern %2 == 0? " + " : " - ") + z + " = ?");
		do {
			System.out.print("answer: ");
			int answer = sc.nextInt();
			sc.nextLine();
			if(answer == result) {
				System.out.println("correct"); 
				break;
			}
			else System.out.println("incorrect");
		}while(confirmRetry());
	}

	private boolean confirmRetry() {
		// TODO Auto-generated method stub
		System.out.print("try again?(Y/N) ");
		char reply = sc.nextLine().charAt(0);
		if(reply == 'Y' || reply == 'y') return true;
		return false;
	}

	public void sumOf(int length) {
		// TODO Auto-generated method stub
		int[] arr = new int[length];
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(10) +1;
			System.out.print("arr[" + i + "]:" + arr[i] + " ");
			sum += arr[i];
		}
		System.out.println("\nsum = " + sum);
	}

	public void minOf(int length) {
		// TODO Auto-generated method stub
		int[] height = new int[length];
		int[] weight = new int[length];
		for(int i = 0 ; i < length; i++) {
			height[i] = random.nextInt(200 - 100 + 1) + 100;
			weight[i] = random.nextInt(100 - 40 + 1) + 40;
		}
		System.out.println("\nminH : " + getMinOf(height) + " minW : " + getMinOf(weight));
	}
	
	private int getMinOf(int[] arr) {
		
		int min = arr[0];
		for(int i : arr) {
			System.out.print(i + " ");
			if(min > i) min = i;
		}
		return min;
	}

	public void linearSearch(int length) {
		// TODO Auto-generated method stub
		int[] arr = getArr(length);
		System.out.print("\nkey: " );
		int key = sc.nextInt(); sc.nextLine();
		int idxS = searchFromStart(arr, key);
		int idxE = searchFromEnd(arr, key);
		if(idxS == -1) System.out.println("nothing");
		else if(idxS == idxE) System.out.println("arr[" + idxS + "]");
		else {
			System.out.println("FromStart: arr[" + idxS + "] FromEnd: arr[" + idxE+ "]");
		}
	}

	private int[] getArr(int length) {
		int[] arr = new int[length];
		int i;
		for(i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(10) +1;
			System.out.print(arr[i] + " ");
		}
		if(i == arr.length) System.out.println();
		return arr;
	}

	private int searchFromEnd(int[] arr, int key) {
		// TODO Auto-generated method stub
		int flag = -1;
		for(int i = arr.length-1; i >= 0; i--) {
			if(arr[i] == key) flag = i;;
		}
		return flag;
	}

	private int searchFromStart(int[] arr, int key) {
		// TODO Auto-generated method stub
		int flag = -1;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == key) flag = i;
		}
		return flag;
	}

	public void arrayRemove(int length) {
		// TODO Auto-generated method stub
		int[] arr = getArr(length);
		System.out.print("index: ");
		int index = sc.nextInt(); sc.nextLine();
		removeIndex(arr, index);
		printArr(arr);
		System.out.print("count: ");
		int count = sc.nextInt(); sc.nextLine();
		removeIndex(arr, index, count);
		printArr(arr);
		System.out.print("value: ");
		int value = sc.nextInt(); sc.nextLine();
		insertIndex(arr, index, value);
		printArr(arr);
	}

	private void printArr(int[] arr) {
		for(int i : arr) System.out.print(i + " ");
		System.out.println();
	}

	private void insertIndex(int[] arr, int index, int value) {
		// TODO Auto-generated method stub
		if(index >= 0 && index < arr.length) {
			for(int i = arr.length-1; i > index; i--) {
				arr[i] = arr[i-1];
			}
			arr[index] = value;
		}
	}

	private void removeIndex(int[] arr, int index, int count) {
		// TODO Auto-generated method stub
		if(index >=0 && index < arr.length && index+count < arr.length) {
			int lastIdx = index + count -1;
			if(lastIdx > arr.length -1 - count) lastIdx = arr.length -1 - count;
			for(int i = index; i <= lastIdx; i++) {
				arr[i] = arr[i+count];
			}
		}
	}

	private void removeIndex(int[] arr, int index) {
		// TODO Auto-generated method stub
		if(index >= 0 && index < arr.length) {
			for(int i = index; i < arr.length -1; i++) {
				arr[i] = arr[i+1];
			}
		}
	}

	public void arrayExchange(int length1, int length2) {
		// TODO Auto-generated method stub
		int[] arrA = getArr(length1);
		int[] arrB = getArr(length2);
		int length = length1 < length2? length1 : length2;
		arrayExg(arrA, arrB, length);
		printArr(arrA); printArr(arrB);
		
	}

	private void arrayExg(int[] arrA, int[] arrB, int length) {
		// TODO Auto-generated method stub
		for(int i = 0; i < length; i++) {
			int temp = arrA[i];
			arrA[i] = arrB[i];
			arrB[i] = temp;
		}
	}

	public void arrayClone(int length) {
		// TODO Auto-generated method stub
		int[] arr = getArr(length);
		int[] copy = copyArr(length, arr);
		printArr(copy);
	}

	private int[] copyArr(int length, int[] arr) {
		int[] copy = new int[length];
		for(int i = 0; i < arr.length; i++) {
			copy[i] = arr[i];
		}
		return copy;
	}

	public void arraySearchIndex(int length) {
		// TODO Auto-generated method stub
		int[] arr = getArr(length);
		System.out.print("value: ");
		int value = sc.nextInt(); sc.nextLine();
		int[] idxArr = getIndex(arr, value);
		printArr(idxArr);
	}

	private int[] getIndex(int[] arr, int value) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i : arr) if(i == value) count++;
		int[] idxArr = new int[count--];
		for(int i = arr.length-1; i>=0; i--) {
			if(arr[i] == value) idxArr[count--] = i;
		}
		if(idxArr.length > 0) return idxArr;
		else return null;
	}

}
