package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader; 
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.filechooser.FileFilter;

/**
 * Simple brute force implementation
 *
 */

public class WriteSymptomAndCount implements ISymptomWriter {
	
	
	private List<String> symptoms = new ArrayList<String>();

/**
 * 	
 * @param symptoms represents the list of symptoms
 */
		
	public WriteSymptomAndCount (List <String> symptoms)
	{
		this.symptoms = symptoms;
	}
	
	@Override
	public void writeSymptoms () 
	
	{
		FileWriter writer = null;
		
		try
		{
		
		String file = "results.out";
		writer = new FileWriter(file);
		Set<String> st = new TreeSet<String>(symptoms); 
	    for (String s : st) 
	        {	
	        	writer.write(s + ": " + Collections.frequency(symptoms, s)+ "\n");
	        }
		
		}
		
		catch (IOException e) 
		{
			e.printStackTrace();
		
		}finally {
			if (writer != null)
				try {
					writer.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			
		}
		
	}
		
	
	}



