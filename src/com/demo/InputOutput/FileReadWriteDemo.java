package com.demo.InputOutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadWriteDemo {
//C:\Users\Tushar\OneDrive\Desktop
	
	
	void writeContent(String fileName) {
		
		String content = "Hi this is file content for demo";
		
		try {
		FileOutputStream fos = new FileOutputStream(new File(fileName));
		byte[] b = content.getBytes();
		fos.write(b);
		fos.close();
		System.out.println("file updated");
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	
	void readContent(String fileName) {
		
		try {
			FileInputStream fis = new FileInputStream(new File(fileName));
			int c = 0;
			while((c=fis.read())!=-1){  //here we read file till ascii of char is !=-1
			System.out.print((char)c);  //-1 represent end of file
			}
			
			//we can also use for loop
			  for(int c1 = 0;(c1=fis.read())!=-1; ) 
			  { 
				  System.out.print((char)c1);
			  }
			 
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		
		FileReadWriteDemo obj = new FileReadWriteDemo();
		obj.writeContent("abc1.txt");
		obj.readContent("abc.txt");
	}
	
	}
