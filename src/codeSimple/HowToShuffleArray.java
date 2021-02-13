package codeSimple;

import java.util.Arrays;
import java.util.Random;

public class HowToShuffleArray {

	public static void main(String[] args) {
		
		Integer[]ar= {1,2,3,7,8};
		System.out.println(Arrays.toString(shuffle(ar)));
		
		
	}
	public static Object[] shuffle(Object[] ar)
	{
		
		Random rand= new Random();
		
		    
		     
		     for (int i = 0; i < ar.length; i++) {
				
		    	
		    	 int randIndex       = rand.nextInt(ar.length);
		    	 
		    	 int temp= (int) ar[randIndex];
		    	 ar[randIndex]=ar[i];
		    	 ar[i]=temp;
		    	 
		    	 
		    	 
		    	 
		    	 
			}
			return ar;
		             
		
	}
}
