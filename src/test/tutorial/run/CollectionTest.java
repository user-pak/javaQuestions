package test.tutorial.run;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<String>();
		List<String> linkedList = new LinkedList<String>();
		
		list.add("a");
		linkedList.add("A");
		list.add("b");
		linkedList.add("B");
		list.add(1, "b-1");
		linkedList.add(1, "B-1");
		list.add("c");
		linkedList.add("C");
		
//		for(String a : list) {
//			System.out.print(a + " ");
//		}
//		list.forEach(a -> System.out.println(a));
//		System.out.println();
//		for(String b : linkedList) {
//			System.out.print(b+ " ");
//		}
		list.remove(2);
		linkedList.remove(2);
		list.add("d");
		linkedList.add("D");
//		for(int i = 0; i < list.size(); i++) {
//			System.out.print(i + " ");
//		}
//		System.out.println(list.toString());
//		for(int i = 0; i < linkedList.size(); i++) {
//			System.out.print(i + " ");
//		}
//		
//		System.out.println(linkedList.toString());
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("one", "a");
		map.put("two", "b");
		map.put("three", "c");
		System.out.println(map.toString());
		map.forEach((k, e) ->System.out.println("[" + k + "] = " + e));
		
		Set<String> set = new HashSet<String>();
		
	}

}
