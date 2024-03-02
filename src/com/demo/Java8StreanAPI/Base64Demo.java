package com.demo.Java8StreanAPI;

import java.util.Base64;

public class Base64Demo {
	
	public static void main(String[] args) {
		
		String s = "sneha";
		
		byte[] b = Base64.getEncoder().encode(s.getBytes());
		System.out.println("encoded string : "+new String(b) );
		
		//c25laGE=
		byte[] d = Base64.getDecoder().decode("c25laGE=");
		System.out.println("decoded string : "+new String(d));
	}

}
