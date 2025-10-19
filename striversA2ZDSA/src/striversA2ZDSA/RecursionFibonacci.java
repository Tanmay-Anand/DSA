package striversA2ZDSA;

public class RecursionFibonacci 
{
	public int fibb(int n)
	{
		if(n<=1)
			return n;
		
		int last=fibb(n-1);
		int secLast=fibb(n-2);
		return last + secLast;
	}
	
	public static void main(String[] args) 
	{
		RecursionFibonacci obj=new RecursionFibonacci();
		System.out.println(obj.fibb(4));
		
	}
}
