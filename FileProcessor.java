package com_file.OO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;


public class FileProcessor 
{
	
	//method to count the words, uses a file name a map
	public static void countwords (String filename, Map<String, Integer> words) 
	{
		Scanner file;
		try {
			file = new Scanner (new File(filename));
			while(file.hasNext()) // if the scanner has a next like or next word it will go thorough a loop and count the word 
			{
				String word = file.next().toLowerCase();
				Integer count = words.get(word);
				if(count!=null)
				{
					count++;
					
				}
				
				else 
				{
					count = 1;
					
				
				}
				words.put(word, count);
			}
			file.close();
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}  
		
	}


		
		
}

	









	
	

