package striversA2ZDSA;

public class Prime 
{

	public boolean isPrime(int n) 
	{
		boolean result=false;
		for(int i=2;i<=n/2; i++)
		{
			if(n%i==0)
			{
				result=false;
			}
			else {
				result=true;
			}
		}
		
        return result;
	}
	
	public static void main(String[] args) 
	{
		Prime obj=new Prime();
		System.out.println(obj.isPrime(8));

	}

}
