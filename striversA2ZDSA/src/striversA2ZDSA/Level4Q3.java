package striversA2ZDSA;

public class Level4Q3 
{
	public boolean isPalindrome(int n) 
	{
		boolean result;
		
		int reverse=0;
		int num=n;
		while(num>0)
		{
			int digit=num%10;
			reverse=reverse *10 + digit;
			num=num/10;
		}
		
		if(n == reverse)
		{
			result=true;
		}
		else
		{
			result=false;
		}
		
		return result;
    }

	public static void main(String[] args) 
	{
		Level4Q3 l4=new Level4Q3();
    	System.out.println(l4.isPalindrome(88455));
    	System.out.println(l4.isPalindrome(55455));
	}

}
