package array;

import java.util.ArrayList;
import java.util.Scanner;

import utilities.ExecutionTimer;

public class LeftRotateDPlaces 
{
	public int[] meth(ArrayList<Integer> al, int n, int d)
	{
		d=d%n;
		int[] result = new int[n];
		//From here use ArrayList and other collection classes.
		ArrayList<Integer> al2=new ArrayList<Integer>();
		
		// Copy elements after d to the front
        int index = 0;
        for (int i = d; i < n; i++) {
            result[index++] = al.get(i);
        }

        // Copy first d elements to the end
        for (int i = 0; i < d; i++) {
            result[index++] = al.get(i);
        }
		
		return result;
	}

	public static void main(String[] args) 
	{
		
		LeftRotateDPlaces obj=new LeftRotateDPlaces();
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
		
		System.out.println("Number of places you want to rotate Left?");
		
		int d=sc.nextInt();
		
		// Start timing
		timer.start();
		
		int[] finalArray=obj.meth(al, n, d);
		
		// Stop timing
        timer.stop();
        
		for(int array: finalArray)
		{
			System.out.print(array + " ");
		}

		System.out.println("\n\nExecution time: " + timer.getDuration() + " ms");
	}
}
