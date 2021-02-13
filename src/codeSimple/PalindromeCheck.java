package codeSimple;

public class PalindromeCheck {
	
	
	public static int palindromeCheck(int number)
	{
		int rev=0;
		int rem=0;
		while(number!=0)
		{
			rem=number%10;
			rev=rev*10+rem;
			number=number/10;
		}
		return rev;
	}
	
	public static void main(String[] args) {
		
		
		    int reverse=palindromeCheck(156);
		    
		    if(reverse==156)
		    {
		    	System.out.println("palindrome");
		    	
		    	
		    }
		    else
		    	System.out.println("Not a palindrome");
	}
	

}
