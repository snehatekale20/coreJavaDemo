package com.demo.collectionDemo;

import java.util.List;
import java.util.Vector;

public class VectorDemo {
	
	public static void main(String[] args) {
		
		Vector v = new Vector<>();
		v.add("v1");
		v.addElement("v2");
		v.addElement("v3");
		v.addElement("v4");
		v.addElement("v5");
		
		System.out.println(v);
		v.add(2, "v9");
		System.out.println(v);
		
		System.out.println(v.contains("v2"));
		
		System.out.println(v.elementAt(3));
		
		System.out.println(v.firstElement());
		
		System.out.println(v.indexOf("v3"));
		
		

		
	}

}
