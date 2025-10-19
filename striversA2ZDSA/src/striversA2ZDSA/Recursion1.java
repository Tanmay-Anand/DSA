package striversA2ZDSA;

public class Recursion1 
{
	int count=0;
	
	public void meth1()
	{
		if(count ==11)
		{
			return;
		}
		else
		{
			System.out.println(count);
			count++;
			meth1();
		}
			
	}
	
	public static void main(String[] args) 
	{
		Recursion1 obj=new Recursion1();
		obj.meth1();
	}

}
