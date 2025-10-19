package striversA2ZDSA;

import java.util.Scanner;

public class NumbersInArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		//input array size
		System.out.println("Input array size: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		//read OR input array elements
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		//Simple HashArray for Counting
		int[] hash=new int[13];
		
		//Precompute frequencies
		for(int i=0;i<n;i++)
		{
			hash[arr[i]] += 1;
		}
		
		//No. of query
		int q=sc.nextInt();
		
		//Answer each query
		while(q-- >0)
		{
			int number=sc.nextInt();
			System.out.println(hash[number]);
		}
	}

}
