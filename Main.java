package com_file.OO;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.*;
import java.util.*;


/*
 * 
 *Programming/code created by Ana Marcela Espinosa with student number C20306516
 * this code is Q1 Topic modeler in which it will read the two files and will 
 * compare the likelihood of both, it will be using a buffer reader and will have
 * stop words 
 * 
 * 
 */
public class Main 
{
	//attributes of main class
	
	
	
	
	
	public static void CompareFiles(String[] args)
	{
		Scanner in = null;
		boolean same = true;
		int counter = 0;
		
		
		
		
		//try catch for the first file
		try 
		{
			in = new Scanner (new FileReader("example1.txt"));
		
		}//end try 
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
			
		}//end catch
		
		
		
		
		//creating an Array List in which it will store all of the word
		ArrayList<String> firstLines = new ArrayList<String>();
		while (in.hasNextLine())
		{
			firstLines.add(in.nextLine());
		}
		in.close();
		
		
		
		
		//try catch for the second file 
		try 
		{
			in = new Scanner (new FileReader("example2.txt"));
		
		}//end try 
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
			
		}//end catch for second file
		
		
		
		while(in.hasNextLine())
		{
			if (counter < firstLines.size())
			{
				if(!((in.nextLine()).equals(firstLines.get(counter))))
				{
					same = false;
					break;
				}
				
				counter++;
			}
			else
			{
				break;
			}
		}
		in.close();
		System.out.println("they are similar");
	}// end Compare files 
	
}
