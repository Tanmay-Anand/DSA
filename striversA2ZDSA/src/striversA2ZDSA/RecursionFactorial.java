package striversA2ZDSA;

public class RecursionFactorial 
{
		
		public int meth1(int n)
		{
			
			if(n ==0)
			{
				return 1;
			}
			else
			{
				return n*meth1(n-1);
			}
			
		}	
	
	public static void main(String[] args) 
	{
		RecursionFactorial obj=new RecursionFactorial();
		System.out.println(obj.meth1(4));
	}

}
