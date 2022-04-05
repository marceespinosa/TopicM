package com_file.OO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;

public class FileProcessor 
{

	//attributes for the files 
//	File myFile;
//	String line = "";
//	private ArrayList<String> fileList = new ArrayList<String>();
//	int carray[];
//	private String filePath;
//	private ArrayList<String> listOrdered = new ArrayList<String>();
//	int orderedarray=0;
	
	@SuppressWarnings("unlikely-arg-type")
	public static void readFile(String[] args) throws IOException
	{
		//what file will be imported? ex1 ex2
		File myFile = new File ("example1", "example2");
		//will initialize arrays
		String [] words = null;
		//ArrayList<String> fileList = new ArrayList<String>();
		//will create a file reader object 
		FileReader readFile = new FileReader(myFile);
		// will create the buffered reader object 
		BufferedReader bufferReader = new BufferedReader(readFile);
		String word;
		//initialize a counter
		int count = 0;
		
		
		
		//while loop to read the content of file
		while((word = bufferReader.readLine())!=null)
		{
			//this will split the words
			words = word.split("");
		}
		
		for(String word2: words) 
		{
			if(word2.equals(words)) 
			{
				count++;
			}
		}
		
		if(count!=0) 
		{
			System.out.print("the word is" + words+ "and its this many times" + count);
		}
		
		bufferReader.close();
				
	}









	
	
}
