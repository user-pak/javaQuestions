package clazz.model.service;

public class MinMax {

	public int min(int a , int b) {

		return a < b? a: b;
	}
	
	public int min(int a, int b, int c) {

		int min = a;
		if(b < min) min = b;
		if(c < min) min = c;
		return min;
	}
	
	public int min(int[] arr) {
		int min = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] < min) min = arr[i];
		}
		return min;
	}
	
	public int[] minIndex(int[] arr) {
		int min = min(arr);
		int count = 0;
		for(int i= 0; i < arr.length; i++) {
			if(min == arr[i]) count++;
			
		}
		int[] index = new int[count--];
		for(int i = arr.length -1; count >= 0; i--) {
			if(min == arr[i]) index[count--] = i;
 		}
		return index;
	}
	
	public int max(int a, int b) {
		return a > b? a: b;
	}
	
	public int max(int a, int b, int c) {
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		return max;
	}
	
	public int max(int[] arr) {
		int max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > max) max = arr[i];
		}
		return max;
	}
	
	public int[] maxIndex(int[] arr) {
		int max = max(arr);
		int count = 0;
		for(int i : arr) {
			if(i == max) count++;
		}
		int[] index = new int[count--];
		for(int i = arr.length-1; count >= 0; i--) {
			if(arr[i] == max) index[count--] = i;
		}
		return index;
	}
}
