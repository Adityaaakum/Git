package codeSimple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DistinctCharacters {

	public static void distinctQuoute(String st)
	{
		
		char[] ch= st.toCharArray();
	
		ArrayList<Character>c= new ArrayList<Character>();
		
		for(int i=0;i<ch.length;i++)
		{
			
			c.add(ch[i]);
			
		}
		
		HashSet<Character> cc= new HashSet<Character>(c);
		
		System.out.println("Distinct characters are");
		for(Character chs:cc)
		{
			System.out.println(chs);
		}
		
		System.out.println("count of distinct chars are "+cc.size());
		
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		distinctQuoute("abccDEF");
		
	}
}
