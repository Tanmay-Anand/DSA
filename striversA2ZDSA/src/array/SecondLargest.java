package array;

import utilities.Sort;
import utilities.InputOutput;

public class SecondLargest 
{
	public int meth(int[] arr, int n) 
	{
		int[] sortedArray=Sort.sortmeth(arr, n);
		int largest=sortedArray[n-1];
		
		int secondLargest = -1;
		for(int i=n-2;i>=0;i--)
		{
			
			if(sortedArray[i] != largest)
			{
				secondLargest = sortedArray[i];
				break;
			}
		}
		return secondLargest;
	}
	
	public static void main(String[] args) 
	{
		int n = InputOutput.readInt("Enter number of elements: ");
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) 
		{
			arr[i] = InputOutput.readInt("Enter element " + (i + 1) + ": ");
		}
		SecondLargest obj = new SecondLargest();
		int secondLargestNumber = obj.meth(arr, n);

		InputOutput.print("The largest element is: " + secondLargestNumber);
	}

}
