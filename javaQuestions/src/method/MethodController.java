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

	public void arrayRemoveOf(int length) {
		// TODO Auto-generated method stub
		int[] arr = getArr(length);
		System.out.print("index: ");
		int idx = sc.nextInt();	sc.nextLine();
		int[] arrB = removeClone(arr, idx);
		printArr(arrB);
		System.out.print("count: ");
		int count = sc.nextInt(); sc.nextLine();
		int[] arrC = removeClone(arr, idx, count);
		printArr(arrC);
		System.out.println("arr: " + arr);
		System.out.println("arrB: " + arrB);
		System.out.println("arrC: " + arrC);
	}

	private int[] removeClone(int[] arr, int idx, int count) {
		// TODO Auto-generated method stub
		if(idx <0 || idx > arr.length || count <0) return arr.clone();
		else {
			if(idx + count > arr.length) count = arr.length - idx; 
			int[] arrC = new int[arr.length - count];
			for(int i = 0; i < idx; i++) arrC[i] = arr[i];
			for(int i = idx; i < arrC.length; i++) arrC[i] = arr[i + count];
			return arrC;
		}
	}

	private int[] removeClone(int[] arr, int idx) {
		
		if(idx <0 || idx > arr.length) return arr.clone();
		else {
			int[] arrB = new int[arr.length -1];
			for(int i = 0; i < idx; i++) arrB[i] = arr[i];
			for(int i = idx; i < arrB.length; i++) arrB[i] = arr[i+1];
			return arrB;
		}
	}

	public void arrayInsOf(int length) {
		// TODO Auto-generated method stub
		int[] arr = getArr(length);
		System.out.print("index: ");
		int idx = sc.nextInt();
		System.out.print("value: ");
		int val = sc.nextInt(); sc.nextLine();
		int[] arrI = insertClone(arr, idx, val);
		printArr(arrI);
	}

	private int[] insertClone(int[] arr, int idx, int val) {
		// TODO Auto-generated method stub
		if(idx <0 || idx > arr.length) return arr.clone();
		else {
			int[] arrI = new int[arr.length+1];
			for(int i = 0; i < idx; i++) arrI[i] = arr[i];
			for(int i = idx; i < arr.length; i++) arrI[i+1] = arr[i];
			arrI[idx] = val;
			return arrI;
		}
	}

	public void addMatrix(int column, int row) {
		// TODO Auto-generated method stub
//		int[][] arrA = {{1,2,3,},{4,5,6,}};
//		int[][] arrB = {{10,20,30,},{40,50,60,}};
//		int[][] arrT = new int[2][3];
		int[][] arrA = new int[column][row];
		int[][] arrB = new int[column][row];
		for(int i = 0; i < arrA.length; i++) {
			for(int j = 0; j <arrA[i].length; j++) {
				arrA[i][j] = random.nextInt(10);
				System.out.printf("arrA[%d][%d] : %d ", i, j, arrA[i][j]);
				arrB[i][j] = random.nextInt(10) + 10;
				System.out.printf("arrB[%d][%d] : %d ", i, j, arrB[i][j]);
			}
			System.out.println();
		}
		int[][] arrT = new int[arrA.length][];
		for(int i = 0; i < arrT.length; i++) {
			arrT[i] = new int[arrA[i].length];
			for(int j = 0; j < arrT[i].length; j++) {
				arrT[i][j] = arrA[i][j] + arrB[i][j];
			}
		}
		
		if(checkMatrix(arrA, arrB, arrT)) {
			for(int i = 0; i < arrA.length; i++) {
				for(int j = 0; j < arrA[i].length; j++) System.out.print(arrT[i][j] + " ");
				System.out.println();
			}
		}
	}
	
	private boolean checkMatrix(int[][] arrA, int[][] arrB, int[][] arrT) {
		if(arrA.length != arrB.length || arrB.length != arrT.length) return false;
		for(int i = 0; i < arrT.length; i++) {
			if(arrA[i].length != arrB[i].length || arrB[i].length != arrT[i].length) return false;
			for(int j = 0; j < arrT[i].length; j++) {
//				arrT[i][j] = arrA[i][j] + arrB[i][j];
			}
		}
		return true;
	}

	public void arrayCloneTD(int column, int row) {
		// TODO Auto-generated method stub
		int[][] arr = new int[column][row];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = random.nextInt(10);
			}
		}
		printArr(arr);
		printArr(copyMatrix(arr));
	}
	
	private int[][] copyMatrix(int[][] arr) {
		int[][] copy = new int[arr.length][];
		for(int i = 0; i < copy.length; i++) {
			copy[i] = new int[arr[i].length];
			for(int j = 0; j < copy[i].length; j++) {
				copy[i][j] = arr[i][j];
			}
		}
		return copy;
	}
	
	private void printArr(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++)
				System.out.printf("arr[%d][%d]: %d ", i, j, arr[i][j]);
			System.out.println();
		}
	}

	public void minArray(int a, int b, int c) {
		// TODO Auto-generated method stub
		int between = intMin(a, b);
		int among = intMin(a, b, c);
		int many = intMin(getArr(a));
		System.out.println("min between: " + between + " among: " + among + " many: " + many);
	}

	private int intMin(int[] arr) {
		// TODO Auto-generated method stub
		int min = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] < min) min = arr[i];
		}
		return min;
	}

	private int intMin(int a, int b, int c) {
		// TODO Auto-generated method stub
		int min = a;
		if(b < min) min = b;
		if(c < min) min = c;
		return min;
	}

	private int intMin(int a, int b) {
		// TODO Auto-generated method stub
		return a < b? a : b ;
	}

	public void absolute() {
		// TODO Auto-generated method stub
		int in = random.nextInt();
		long lo = random.nextLong();
		float fl = random.nextFloat();
		double dou = random.nextDouble();
		
		int abIn = getAbs(in);
		long abLo = getAbs(lo);
		float abFl = getAbs(fl);
		double abDo = getAbs(dou);
		
		System.out.println("in: " + in + " abIn: " + abIn + " lo: " + lo + " abLo: " + abLo + " fl: " + fl + " abFl: " + abFl + " dou: " + dou + " abDo: " + abDo);
	}

	private double getAbs(double number) {
		// TODO Auto-generated method stub
		return number >= 0? number: -number;
	}

	private float getAbs(float number) {
		// TODO Auto-generated method stub
		return number >= 0? number: -number;
	}

	private long getAbs(long number) {
		// TODO Auto-generated method stub
		return number >= 0? number: -number;
	}

	private int getAbs(int number) {
		// TODO Auto-generated method stub
		return number >= 0? number: -number;
	}

	public void printArray() {
		// TODO Auto-generated method stub
		System.out.print("length: ");
		int[] arr = getArr(sc.nextInt());
		System.out.print("column: ");
		int[][] matrix = new int[sc.nextInt()][];
		for(int i = 0; i < matrix.length; i++) {
			System.out.print("[" + i + "]row: ");
			matrix[i] = new int[sc.nextInt()];
			for(int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = random.nextInt(10);
			}
		}
		printArr(arr);
		printArr(matrix);
	}
}
