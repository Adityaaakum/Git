package codeSimple;

import java.util.Iterator;

public class RemoveWhiteSpaces {

	
	public static String removeWhiteSpaces(String input)
	{
		
		StringBuilder out= new StringBuilder();
		
		        char[] white =  input.toCharArray();
		        
		        for(char c :white)
		        {
		        	if(!Character.isWhitespace(c))
		        	{
		        		out.append(c);
		        	}
		        }
		        return out.toString();
		
	}
	public static void main(String[] args) {
		
		
		System.out.println(removeWhiteSpaces("vvvvvv m"));
	}
	
}
