package array;

import java.util.Scanner;

public class TwoSumProblem 
{
	public static boolean meth(int[] arr, int l, int t)
	{
		boolean result=false;
		
		for(int i=0; i<l; i++)
		{
			for(int j=1;j<l;j++)
			{
				if(i == j)
					continue; //Break loop
				
				if(arr[i] + arr[j] == t)
				{
					result=true;
				}
			}
		}
		
		return result;	
	}

	public static void main(String[] args) 
	{
		TwoSumProblem tsp=new TwoSumProblem();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter length of the array in making: ");
		int length=sc.nextInt();
		
		int[] arr= new int[length];
		
		System.out.println("Enter your desired element in the following indexes:-");
		for(int i=0;i<length;i++)
		{
			System.out.println("Index "+i+" : ");
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter your target value of a + b : ");
		int target=sc.nextInt();
		
		boolean result= tsp.meth(arr, length, target); 
		System.out.println(result);
	}

}
