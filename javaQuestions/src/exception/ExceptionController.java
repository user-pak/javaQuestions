package exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

import clazz.model.vo.Day;
import exception.error.ParameterRangeError;
import exception.error.ResultRangeError;

public class ExceptionController {

	private Scanner sc = new Scanner(System.in);
	
	public void mulDiv2() {
		// TODO Auto-generated method stub
		int x = getInt();
		int y = getInt();
		int resultA = mul(x,y);
		
		int resultB = 0;
		try {
			resultB = div(x, y);
		}catch (ArithmeticException e) {
			System.err.println(e);
		}finally {
			System.out.println("Fin");
		}
		
		printResult(resultA);
		printResult(resultB);
	}

	private void printResult(int result) {
		// TODO Auto-generated method stub
		System.out.println(result);
	}

	private int div(int x, int y) {
		// TODO Auto-generated method stub
		return x / y;
	}

	private int mul(int x, int y) {
		// TODO Auto-generated method stub
		return x * y;
	}

	private int getInt() {
		System.out.print("int : ");
//		int input = 0;
//		try {
//			input = sc.nextInt();
//			sc.nextLine();
//		}catch (InputMismatchException e) {
//			System.out.println(e);
//		}finally {
//			System.out.println("Fin");
//		}
//		return input;
		return sc.nextInt();
	}
	
	private void check(int sw) throws Exception {
		switch(sw) {
		case 1 : throw new Exception("exception");
		case 2 : throw new RuntimeException("runtime exception");
		}
	}
	
	public void test() {
		try {
			testB();
		} catch (RuntimeException e) {
			System.err.println("runtime exception: " + e.getMessage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("exception: " + e.getMessage());
		}
	}

	private void testB() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Enter 1 or 2");
		check(getInt());
	}
	
	public void init() {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader("foo.txt"));
		System.out.println(reader.readLine());
		}catch (IOException e) {
			System.err.println(e.getMessage());
		}finally {
			if(reader != null) {
				try {
					reader.close();
					System.out.println("br.close");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.err.println(e.getMessage());
				}
			}
		}
	}
	
	public void term() {
		FileWriter writer = null;
		try {
			writer = new FileWriter("foo.txt");
			writer.write(new Day().toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		} finally {
			if(writer != null) {
				try {
					writer.close();
					System.out.println("writer.close");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.err.println(e.getMessage());
				}
			}
		}
	}
	
	public void rangeErrorTester() {
		
		int a = getInt();
		sc.nextLine();
		int b = getInt();
		
		try {
		System.out.println("sum : " + add(a,b));
		}catch (ParameterRangeError e) {
			System.err.println("parameterRangeError " + e.getMessage());
		}catch (ResultRangeError e) {
			System.err.println("resultRangeError " + e.getMessage());
		}
	}

	private int add(int a, int b) throws ParameterRangeError, ResultRangeError{
		// TODO Auto-generated method stub
		if(!isValid(a)) throw new ParameterRangeError(a);
		if(!isValid(b)) throw new ParameterRangeError(b);
		int result = a + b;
		if(!isValid(result)) throw new ResultRangeError(result);
		return result;
	}

	private boolean isValid(int number) {
		// TODO Auto-generated method stub
		return number >= 0 && number <=9;
	}
	
	private void reverse(int[] arr) throws RuntimeException{
		try {
			for(int i = 0 ; i < arr.length/2; i++) {
//				swap(arr, i, arr.length -1 -i);
//				throw error
				swap(arr, i, arr.length -i);
			}
		}catch(NullPointerException e) {
			e.printStackTrace();
			System.exit(1);
		}catch(ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
//			System.exit(1);
			throw new RuntimeException("throw runtimeException", e);
		}
	}

	private void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public void reverseArr() {
		int[] arr = new int[getInt()];
		for(int i = 0 ; i < arr.length; i++) {
			arr[i] = new Random().nextInt(10);
		}
		for(int i : arr) System.out.print(i + " ");
		try {
			reverse(arr);
		}catch (RuntimeException e){
			System.err.println(e);
			System.err.println(e.getCause());
			System.exit(1);
		}
		System.out.println("reverse");
		for(int i : arr) System.out.print(i + " ");
	}
}
