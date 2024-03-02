package com.demo.collectionDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	private static Set<Entry<Integer, String>> entrySet;

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		System.out.println(map.size());
		map.put(2, "abc");
		map.put(2, "aaa");
		map.put(3, null);
		map.put(4, "tushar");
		map.put(5, "xzy");
		map.put(null, "sne");
		System.out.println(map);
		
		System.out.println(map.getOrDefault(3, "pqr"));
		entrySet = map.entrySet();
		for (Entry entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		Set<Integer> keySet = map.keySet();
		
		System.out.println(keySet);
		
		System.out.println(map.entrySet());
		Collection<String> values = map.values();
		System.out.println(values);
		
		System.out.println(map.get(4));
		System.out.println(map.remove(5));
		System.out.println(map);


	}
}
