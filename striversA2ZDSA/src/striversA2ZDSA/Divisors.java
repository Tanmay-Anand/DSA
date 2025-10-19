package striversA2ZDSA;

import java.util.ArrayList;

public class Divisors 
{
	public ArrayList calculation(int n)
	{
		ArrayList<Integer> al= new ArrayList<Integer>();
		
			for(int i=2;i<= n;i++)
			{
				if(n%i == 0)
				{
					al.add(i);
				}
			}
		
		return al;
	}
	
	public static void main(String[] args) 
	{
		Divisors obj=new Divisors();
		System.out.println(obj.calculation(15));

	}

}
