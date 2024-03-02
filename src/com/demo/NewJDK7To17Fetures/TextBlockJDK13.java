package com.demo.NewJDK7To17Fetures;

public class TextBlockJDK13 {
	
	
	public static void main(String[] args) {
		
		String s = "<p>The HTML <code>button</code> tag defines a clickable button.</p>\r\n"
				+ "\r\n"
				+ "<p>The CSS <code>background-color</code> property defines the background color of an element.</p>";
		
		String str = """  
				
				<p>The HTML <code>button</code> tag defines a clickable button.</p>
				+ "\r\n"
				+ "<p>The CSS <code>background-color</code> property defines the background color of an element.</p> 
				""";
		
		System.out.println("without text blick: "+s);
		System.out.println("with text blick: "+str);
		
		
	}

}
