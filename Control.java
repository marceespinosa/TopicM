package com_file.OO;

import java.util.HashMap;
import java.util.Map;

public class Control {

	public static void main(String[] args) 
	{
			int n = 10;
			FileProcessor example1 = new FileProcessor();
			FileProcessor example2 = new FileProcessor();
			
			Map<String,Integer> words=new HashMap<String, Integer>();
			Map<String,Integer> words2=new HashMap<String, Integer>();
			example1.countwords("example1.txt",words);
			example2.countwords("example2.txt",words2);
			words.entrySet().stream()
            .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).limit(n)
            .forEach(x -> {
                 System.out.println(x.getKey() + ","+ x.getValue());
            });
			
		       System.out.println("\n");
			
			words2.entrySet().stream()
            .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).limit(n)
            .forEach(x -> {
                 System.out.println(x.getKey() + ","+ x.getValue());
            });


	}


}
