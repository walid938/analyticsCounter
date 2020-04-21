package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class AnalyticsCounter {
	
	
	/** Declaration and instantiation  of the reading of the list of symptoms
     * as well as the writing
     * 
		*/
	public static void main(String args[]) throws Exception {
		
		
		
		ReadSymptomDataFromFile read = new ReadSymptomDataFromFile("symptoms.txt");
		List<String> symptoms = new ArrayList<String>(); 
		
		symptoms = read.getSymptoms();
		
		
		WriteSymptomAndCount wracount = new WriteSymptomAndCount(symptoms);
		
		wracount.writeSymptoms();
		
		
		
		
	   }
	
	



            
 } 
	
	
		
		
	
	
	
	
	

