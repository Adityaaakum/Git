package codeSimple;

import java.util.HashMap;
import java.util.Map;

public class DupUsingHashMap {
	
	public static void getDup(int[]ar)
	{
		Map<Integer, Integer> hm= new HashMap<Integer, Integer>();
		for(int i:ar)
		{
		  if(!hm.containsKey(i))
		  {
			  hm.put(i, 1);
		  }
		  else
			  hm.put(i,hm.get(i)+1 );
		}
		
		for(Integer i:hm.keySet())
		{
			if(hm.get(i)>1)
			{
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[]ar= {1,2,3,4,1};
		getDup(ar);
	
	}
}
