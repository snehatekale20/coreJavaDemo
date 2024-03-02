package com.demo.NewJDK7To17Fetures;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileReadWriteUpdate {
	
	
	static void writeFile() {
		
		String content = "hi this is new version of read and write";
		
		try {
			Files.writeString(Path.of("Stude.txt"),content,StandardCharsets.UTF_16,StandardOpenOption.CREATE);
			System.out.println("updated");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void fileRead() {
		
		try {
			String filecontent = Files.readString(Path.of("Stude.txt"),StandardCharsets.UTF_16);
			System.out.println(filecontent);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//file mismatch check or compare content of two files from jdk12
	//it written -1 if files are same
	//it written 0 if files are not same
	
	static void fileismatch() {
		
		try {
			long l = Files.mismatch(Path.of("Stude.txt"), Path.of("Stude.txt"));
			if (l==-1) 
			System.out.println("file is same "+l);
			else if(l==0)
				System.out.println("file is not same : "+l);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		//writeFile();
		//fileRead();
		fileismatch();
	}
	
	
	

}
