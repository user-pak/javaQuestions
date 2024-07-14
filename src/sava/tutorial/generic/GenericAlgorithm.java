package sava.tutorial.generic;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class GenericAlgorithm {

	class OddIntegerTest implements Predicate<Integer> {

		@Override
		public boolean test(Integer t) {
			// TODO Auto-generated method stub
			return t % 2 != 0;
		}		
	}
	
	class PrimeNumberTest implements Predicate<Integer> {

		@Override
		public boolean test(Integer t) {
			// TODO Auto-generated method stub
			return false;
		}	
	}
	
	class CompareAlgorithm<T extends Object & Comparable<? super T>> {
//	class CompareAlgorith<T extends Number> implements Comparable<T> {	
		T findMaxElement(List<? extends T> list, int begin, int end) {
			
			T maxElement = list.get(begin);
			
			for(++begin; begin < end; ++begin) {
				
				if(maxElement.compareTo(list.get(begin)) < 0) {
					
					maxElement = list.get(begin);
				}
			}
			
			return maxElement;
		}

//		@Override
//		public int compareTo(T o) {
//			// TODO Auto-generated method stub
//			return 0;
//		}
		
	}
	
	
	private static <T> int countIf(Collection<T> list, Predicate<T> predicate) {
		
		int count = 0;
		
		for(T element : list) {
			
			if(predicate.test(element)) ++count;
		}
		
		return count;
	}
	
	
	public static void main(String[] args) {
		
		GenericAlgorithm gen = new GenericAlgorithm();
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		System.out.println(countIf(list, new GenericAlgorithm().new OddIntegerTest()));
		CompareAlgorithm<Integer> algorithm = gen.new CompareAlgorithm<>();
		System.out.println(algorithm.findMaxElement(Arrays.asList(5,4,3,2,1), 1, 4));
	}
}
