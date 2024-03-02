package com.demo.collectionDemo;

import java.util.PriorityQueue;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tree = new TreeMap<>();
		tree.put(2, "ss");
		tree.put(4, "bb");
		tree.put(5, "ll");
		tree.put(9, "cc");
		tree.put(2, "ss");
		
		System.out.println(tree);
		System.out.println(tree.pollLastEntry());
		System.out.println(tree);
		
		PriorityQueue<Integer> que = new PriorityQueue<>();
		que.add(20);
		que.add(30);
		que.add(5);
		System.out.println(que);
	}
}
