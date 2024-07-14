package sava.collections.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapInterface {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> defaults = new LinkedHashMap<>();
		defaults.put("a", "defaultA");
		defaults.put("b", "defaultsB");
		defaults.put("c", "defaultsC");
		Map<String,String> overrides = new HashMap<>();
		overrides.put("A", "overridesa");
		overrides.put("B", "overridesb");
		overrides.put("C", "overridesc");
		newAttributeMap(defaults, overrides);
		Map<String, String> managers = new LinkedHashMap<>();
		managers.put("employeeA","managerA");
		managers.put("employeeC", "managerC");
		managers.put("managerC", "CEO");
		individualContributor(managers);
		findSlackers(managers);
	}
	
	private static <K,V> void newAttributeMap(Map<K,V> defaults, Map<K,V> overrides) {
		
		Map<K,V> results = new LinkedHashMap<>(defaults);
		System.out.println(results);
		results.putAll(overrides);
		System.out.println(results);
		System.out.println(results.entrySet());
		
	}
	
	private static <K,V> void individualContributor(Map<K,V> managers) {
		
		Set<K> employees = new HashSet<>(managers.keySet());
		System.out.println(employees);
		employees.removeAll(managers.values());
		System.out.println("individualContributor: " + employees);
	}
	
	private static <K,V> void findSlackers(Map<K,V> managers) {
		
		Map<K,V> map = new HashMap<>(managers);
		map.values().remove(Collections.singleton("employeeA"));
		System.out.println("map: " + map);
		map.values().removeAll(map.keySet());
		Set<K> slackers = map.keySet();
		System.out.println("slackers: " + slackers);
		
	}

}
