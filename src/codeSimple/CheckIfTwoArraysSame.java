package codeSimple;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CheckIfTwoArraysSame {
	
	
	public static void main(String[] args) {
		
		
		
			Integer[] a1 = {1,2,3,2,1};
			Integer[] a2 = {1,2,3,6,7};
			
			System.out.println(result(a1, a2));
			
	}
	public static boolean result(Integer[]ar,Integer[]ar2)
	{
		Set<Integer> li= new HashSet<Integer>(Arrays.asList(ar));
		Set<Integer> li2= new HashSet<Integer>(Arrays.asList(ar2));
		
		if(!(li.size()==li2.size()))
		{
			return false;
		}
		
		for(Object ob:li)
		{
			if(!(li2.contains(ob)))
			{
				return false;
			}
			
		}
		return true;
		
	}
	
	

}
