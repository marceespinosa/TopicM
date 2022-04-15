package com_file.OO;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.swing.JFileChooser;

public class FileProcessor 
{
	static int num =0;
	static HashMap<String,Integer> tempWordlist = new HashMap<String, Integer>();
	HashMap<String,Integer> Words = new HashMap<String, Integer>(); 
	ArrayList<String> Words_2 = new ArrayList<String>();
	static ArrayList<String> StopWords_2 = new ArrayList<String>();
	static int correctcounter=0;
	final JFileChooser fc1 = new JFileChooser();
	final JFileChooser fc2 = new JFileChooser();
	double similarity = 0;
	
	
	public  void readwords(String filename, int n) 
	{
		
		        
		    try (LineNumberReader read = new LineNumberReader(new FileReader(filename))) 
		    {
		        String line;
		        LineNumberReader b = new LineNumberReader(new FileReader("StopWords.txt"));
		        String line2;
		        
		        
		        // While loop to read the StopWords file and it will store them into the array
		        while ((line2 = b.readLine()) != null)
		        {
		            for (String stop : line2.toLowerCase().split(" ")) {
		            	StopWords_2.add(stop);
		            }//end for
		                	
		                
		        }//end while
		        
		       //while loop will read the words from the text file and if a stop word is in there then 
		        // it will not store it in the array list for words
		       
		        while ((line = read.readLine()) != null) {
		            for (String filewords : line.toLowerCase().split(" ")) {
		            	if(StopWords_2.contains(filewords))
		            	{
		            		
		            	}//end if	
		            	else 
		            	{
		            		Words_2.add(filewords);
		            	}//end else

		            }//end for
		            
		        } //end while 
 
		       
		        //A new created HashSet to input the values that had been read/scanned from the file
		        Set<String> unique = new HashSet<String>(Words_2);
		       
		        // a for loop will scan through the list of words within the hash set and it willhave a counter for how many times its int the textfile
	            for(String scan: unique) 
	            {   
	            	Words.put(scan,Collections.frequency(Words_2, scan));
			        
			    }  //end for
	           
	            //this for loop will check if the scans and the words are the same and count the repetition
	            for (String scan: Words.keySet())
	            {
	                if (tempWordlist.containsKey(scan)) 
	            	{ 
	            		
	            		//if there is a scan
	            		if (tempWordlist.containsValue(Words.get(scan))) 
		            	{ 
		            	       //it will count the repetition 
		            			correctcounter++;
		            			
		            	} //end nested if
	            	} //end nested if
	            	
	            }//end for
	            
	          
	          // in here it will compare the two files and display how likely they are to be the same or the similarity
	            if(num == 0)
	     		{
	              
			    	tempWordlist.putAll(Words);
	 			    num =1;
	     		}   
		
 
	
		    }//end try 
		    catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//end catch
		   	    
	}
	
	
	//this will display the hashmap 
	public void hashmap(int n) {
		
	
		Words.entrySet().stream()
    	.sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).limit(n)
    	.forEach(x -> 
    		{
    			System.out.println(x.getKey() + " Count is "+ x.getValue());
    		
    		
    		}
    		);
	
	}
}
