package array;

import java.util.ArrayList;
import java.util.Scanner;

import utilities.ExecutionTimer;

public class LinearSearch {

	public int meth(ArrayList<Integer> al, int n, int occ)
	{
		int num=-1;
		
		for(int i=0; i<n;i++)
		{
			if(al.get(i) == occ)
			{
				num = i;
				break;
			}
		}
		
		return num;
	}
	
	public static void main(String[] args) {

		LinearSearch obj=new LinearSearch();
		Scanner sc=new Scanner(System.in);
		ExecutionTimer timer=new ExecutionTimer();
		
		System.out.println("Specify Size of the Array: ");
		int n=sc.nextInt();
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			System.out.println("Element at index "+i+" : ");
			int num=sc.nextInt();
			al.add(num);
		}
		
		System.out.println("Which Element 1st occurance you want to search? ");
		int occ=sc.nextInt();
		
		// Start timing
		timer.start();
		
		int num=obj.meth(al, n, occ);
		
		// Stop timing
        timer.stop();
        
		
		System.out.print(num + " index!");
		

		System.out.println("\n\nExecution time: " + timer.getDuration() + " ms");


	}

}
