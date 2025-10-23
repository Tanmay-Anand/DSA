package array;

import java.util.ArrayList;
import java.util.Scanner;

import utilities.ExecutionTimer;

public class ZeroInEnd {

	public int[] meth(ArrayList<Integer> al, int n)
	{
		int j=-1;
		for(int i=0;i<n;i++)
		{
			if(al.get(i) == 0)
			{
				j=i;
				break;
			}
		}
		
		for(int i=j+1;i<n;i++)
		{
			if(al.get(i) != 0)
			{
				swap(al, i, j);
				j++;
			}
		}
		
		 // Convert ArrayList to array for returning
	    int[] result = new int[n];
	    for (int i = 0; i < n; i++) {
	        result[i] = al.get(i);
	    }

	    return result;
	}
	
	private void swap(ArrayList<Integer> al, int i, int j) {
	    int temp = al.get(i);
	    al.set(i, al.get(j));
	    al.set(j, temp);
	}

	
	public static void main(String[] args) 
	{
		ZeroInEnd obj=new ZeroInEnd();
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
		
		
		// Start timing
		timer.start();
		
		int[] finalArray=obj.meth(al, n);
		
		// Stop timing
        timer.stop();
        
		for(int array: finalArray)
		{
			System.out.print(array + " ");
		}

		System.out.println("\n\nExecution time: " + timer.getDuration() + " ms");

	}

}
