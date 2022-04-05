package com_file.OO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;


public class FileProcessor 
{
	//method to count the words, uses a file name a map
	public static void countwords (String filename, Map<String, Integer> words) throws IOException 
	{
		ArrayList<String> stopwords = new ArrayList<String>();
		Scanner file;
		String wordintext;
	
		
		try {
				file = new Scanner (new File(filename));
				LineNumberReader w = new LineNumberReader (new FileReader ("StopWords"));
				String line;
				
			while((line = w.readLine()) !=null )
			{
				for (String textword : line.toLowerCase().split(""))
				{
					stoplist.add(line);
				}
				
			}
			
				
			while(file.hasNext()) // if the scanner has a next like or next word it will go thorough a loop and count the word 
			{
				
				String word = file.next().toLowerCase();
				Integer count = words.get(word);
				
				if(count!=null)
				{
					count++;
					
				}//end if
				
				else 
				{
					count = 1;
					
				
				}//end else
				if (stopwords.contains(word))
				{
					count = null;
					word = null;
				}
				
				words.put(word, count);
			}//end while
			
			file.close();
			
		
		}//end try
		
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}//end catch
		
	}//end count words
	
	
//	public static String [] readStopWords(String stopFileName)
//	{
//		String[] stopword = null;
//		
//			try 
//			{
//				Scanner stopwords = new Scanner (new File(stopFileName));
//				stopwords.close();
//			} 
//			
//			catch (FileNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//		return stopword;
//		
//		
//	}
//	public static void removeStopWords(String fileName, String[] stopwords)
//	{
//		String stop;
//		
//		try 
//		{
//			Scanner file = new Scanner(new File (fileName));
//			
//			while (file.hasNext())
//			{
//				stop = file.next();
//				
//				if(isStopWord(word, ))
//			}
//			
//		} //end try
//		
//		catch (FileNotFoundException e) 
//		
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}//end catch
//		
//	}//end removestopwords


		
		
}//end File Processors

	









	
	

