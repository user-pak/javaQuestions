package test.tutorial.run;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.lang.Runnable;
import java.util.concurrent.Callable;
import java.util.function.BiFunction;

public class IntegerMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntegerMath addtion;
	}
	 public static void processPersonsWithFunction(
			 	
		        List<Integer> roster,
		        Predicate<Integer> tester,
		        Function<Integer, String> mapper,
		        Consumer<String> block,
		        Comparator<Integer> comparator) {
		        for (Integer p : roster) {
		            if (tester.test(p)) {
		                String data = mapper.apply(p);
		                int count = comparator.compare(new Integer(0), new Integer(1));
		                block.accept(data + count);
		            }
		        }
		    }
	 
	 public static <T, SOURCE extends Collection<T>, DEST extends Collection<T>>
	    DEST transferElements(
	        SOURCE sourceCollection,
	        Supplier<DEST> collectionFactory) {
	        
	    DEST result = collectionFactory.get();
	    for (T t : sourceCollection) {
	        result.add(t);
	    }
	    return result;
	}
	 

}
