package com.demo.ExceptionDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ChekedExceptionDemo {
	
	public static void main1(String[] args) {
		
		FileInputStream fs=null;
			//this throws checkedException we have to handle this
			try {
				 fs = new FileInputStream(new File("abc.txt"));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}finally {
				try {
					fs.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
	}
	
	
	//try with resourse after 1.5
	public static void main2(String[] args) throws IOException {
		
		try(FileInputStream fis = new FileInputStream(new File("abc.txt"))){
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			
		}
	}
	
	
	//try with resourse after 1.8
public static void main(String[] args) throws IOException {
		
	FileInputStream fis = new FileInputStream(new File("abc.txt"));
		try(fis){
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			
		}
	}

}
