package com.demo.collectionDemo;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		TreeSet<Integer>  tree1 = new TreeSet<>();
		tree1.add(99);
		tree1.add(26);
		tree1.add(10);
		tree1.add(90);
		
	System.out.println(tree1);
	
	System.out.println("ceiling method : "+tree1.ceiling(90 ));
	System.out.println(tree1.contains(99));
	System.out.println(tree1.first());
	System.out.println(tree1.floor(90));
	
	//print greater element
	System.out.println(tree1.higher(90));
	
	//print less than given
	System.out.println(tree1.lower(99));
	
	System.out.println(tree1.pollFirst());
	System.out.println(tree1);
	
	System.out.println(tree1.size());
	
	System.out.println(tree1.tailSet(90));
	
	System.out.println(tree1.headSet(90));
	
	Iterator<Integer> descendingIterator = tree1.descendingIterator();
	while(descendingIterator.hasNext()) {
		System.out.println(descendingIterator.next());
	}
	
	NavigableSet<Integer> descendingSet = tree1.descendingSet();
	System.out.println(descendingSet);

	}

}
