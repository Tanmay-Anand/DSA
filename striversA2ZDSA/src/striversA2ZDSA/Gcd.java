package striversA2ZDSA;

public class Gcd {

	public int GCD(int n1, int n2) 
	{
		int result=0;
		for(int i=1; i<=Math.min(n1, n2); i++)
		{
			if((n1%i)==0 && (n2%i)==0)
			{
				result=i;
			}
			
		}
		
		return result;
    } 
	
	public static void main(String[] args) 
	{
		Gcd obj=new Gcd();
		System.out.println(obj.GCD(5,8));
		

	}

}
