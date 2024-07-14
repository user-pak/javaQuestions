package sava.tutorial.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.swing.Box;

public class GenericMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<?>> lists = new ArrayList<List<?>>();
		lists.add(new ArrayList<Integer>());
		lists.add(new ArrayList<String>());
		
	}

	private static void arrayAsList() {
		List<?> list = Arrays.asList(1,2,3);
		list.iterator().forEachRemaining(i -> System.out.println(i));
		
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.iterator().forEachRemaining(i -> System.out.println(i));
	}
	
	private static <T extends Comparable<T>> int compare(T[] array, T element) {
		
		for(T t : array) {
			if(t.compareTo(element)> 0) {
				
			}
		}
		return 1;
	}
	

	


}
