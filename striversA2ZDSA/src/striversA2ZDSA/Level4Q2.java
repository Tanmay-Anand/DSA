package striversA2ZDSA;

public class Level4Q2 
{
	
	public int revDigit(int n)
	{
		int reversedDigit=0;
		while(n > 0) {
		    int digit = n % 10;
		    reversedDigit = reversedDigit * 10 + digit;
		    n = n / 10;
		}
		return reversedDigit;
	}
	
	public static void main(String[] args) 
	{
		Level4Q2 l4=new Level4Q2();
    	System.out.println(l4.revDigit(547));
    	
	}

}
