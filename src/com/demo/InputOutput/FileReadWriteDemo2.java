package com.demo.InputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReadWriteDemo2 {
	
	
	 void writeFile(String fileName, String content) {

		 try (FileWriter fw =  new FileWriter(new File(fileName));){
			
			fw.write(content);
			System.out.println("file updated");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 
	 void readFile(String fileName) {
		 
		 try {
			FileReader fr = new FileReader(new File(fileName));
			int b=0;
			while((b=fr.read())!=-1) {
				System.out.print((char)b);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	 }
	 
	 void scanner(String fileName) throws IOException {
		 Scanner sc = new Scanner(new File(fileName));
		 while(sc.hasNextLine()) {
			 System.out.print(sc.nextLine());
		 }
		 
	 }
	public static void main(String[] args) throws IOException {
		String fileName="abc2.txt";
		String content = "Hi this is another example for demo";
		FileReadWriteDemo2 obj = new FileReadWriteDemo2();
		obj.writeFile(fileName,content);
		obj.readFile(fileName);
		obj.scanner(fileName);
		
	}

	

}
