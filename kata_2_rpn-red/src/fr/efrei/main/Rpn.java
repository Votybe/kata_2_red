package fr.efrei.main;

public class Rpn {
	
	public int[] parse(String elements) {
		
		String[] splittedElements = elements.split(" ");
		
		int length = splittedElements.length;
		
		int[] finalValues = new int[length]; 
		
		for (int i = 0; i < length ; i++) {
			
			finalValues[i] =  Integer.parseInt(splittedElements[i]);
					
		}
		
		return finalValues;
	}
}
