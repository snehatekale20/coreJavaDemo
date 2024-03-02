package com.demo.stringDemo;

import java.util.StringTokenizer;

public class ReverseString {
	
	public static void main(String[] args) {
		 String str = "Java is Object Oriented";
		 char[] ch = str.toCharArray();
		 for(int i=str.length()-1;i>=0;i--) {
			 System.out.print(ch[i]);
		 }
		 
		 System.out.println();
			
			  String[] sArr = str.split(" "); 
			  for( String s : sArr) { 
				  StringBuffer sb = new StringBuffer(s); 
				 // System.out.println(); 
				  System.out.print(" "+sb.reverse()); 
				  
			  }
			 
				 System.out.println();

			  String[] sArr1 = str.split(" "); 
			  for( int i=sArr1.length-1;i>=0;i--) { 
				  String revStr = sArr1[i]; 
				  System.out.print(" "+revStr); 
				  
			  }
				 System.out.println();
				 
		
		StringTokenizer st = new StringTokenizer(str);
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			char ch1[] = token.toCharArray();
			for(int i=ch1.length-1;i>=0;i--) {
				System.out.print(ch1[i]);
			}
			System.out.print(" ");
		}
		 
	}

}
