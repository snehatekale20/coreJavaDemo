package com.demo.InputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReadWrite3 {
	
	
	
	 void fileRead(String fileName) {
		try(FileReader fir = new FileReader(new File(fileName));){
			int a=0;
			while((a=fir.read())!=-1) {
				System.out.print((char)a);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	 void fileWrite(String fileName, String fileCntent) {
		
		 try(FileWriter fiw = new FileWriter(new File(fileName));) {
			fiw.write(fileCntent);
			System.out.println("updated!!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		//String fileName =null;
		String fileContent=null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your file name");
		String fileName = sc.next();
		System.out.println("Enter your file content");
			while(sc.hasNext()) {
				fileContent=sc.next();
			}
		
	
		FileReadWrite3 obj3 = new FileReadWrite3();
		obj3.fileWrite(fileName,fileContent);
		obj3.fileRead(fileName);
		
	}

	

}
