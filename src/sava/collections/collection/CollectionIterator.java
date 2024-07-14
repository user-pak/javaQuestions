package sava.collections.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Queue;
import java.util.stream.Collectors;

public class CollectionIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		List<Integer> newList = new ArrayList<>();
		newList.add(100);
		newList.add(200);
		replace(list, 2, newList);
		dealHand(list, 3, 1000);
		
		Queue<String> queue = new LinkedList<>();
		queue.offer("Hello");
		getFreqeuncy();
		
	    int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};   
	    int sum = Arrays.stream(ages).boxed().collect(Collectors.summingInt((Integer::intValue)));
        System.out.println(sum);
	}

	private static void getFreqeuncy() {
		Map<String, Integer> frequency = new LinkedHashMap<>();
		String[] args = {"apple", "gun", "apple"}; 
		for(String key : args) {
			Integer count = frequency.get(key);
			frequency.put(key, (count == null?  count = 1 : ++count));
		}
		System.out.print(frequency.size() + " distinct words:");
        System.out.println(frequency);
	}
	
	private void filter(Collection<?> col) {
		
		for(Iterator<?> it = col.iterator(); it.hasNext(); ) {
			
			if(it.next().equals(col.size())) {
			Object[] obj = col.toArray();	
				it.remove();
			}
		}
	}
	
	public static <E> void replace(List<E> list, E val, List<? extends E> newVals) {

		for (ListIterator<E> it = list.listIterator(); it.hasNext(); ){
			if (val == null ? it.next() == null : val.equals(it.next())) {
				it.remove();
				for (E e : newVals) {
					it.add(e);
				}
			}
		}		
		System.out.println("list: " + list);
	}
	
	private static <E> void dealHand(List<E> deck, int count, E val) {
		
		int deckSize = deck.size();
		List<E> handView = deck.subList(deckSize-count, deckSize);
		List<E> hand = new ArrayList<>(handView);		
//		handView.clear();
		handView.set(0, val);
		
		System.out.println("hand: " + hand);
		System.out.println("deck: " + deck);
	}

}
