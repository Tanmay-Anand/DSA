package array;

import java.util.Arrays;

import utilities.Sort;

public class RemoveDuplicates {
	
	public int[] meth(int[] arr, int n)
	{
		int[] arrFinal=Sort.sortmeth(arr, n);
		int i=0;
		
		for(int j=1;j<n;j++)
		{
			if(arrFinal[j] != arrFinal[i])
			{
				arrFinal[i+1] = arrFinal[j];
				i++;
			}
		}

		return Arrays.copyOf(arrFinal, i + 1);

	}

	public static void main(String[] args) 
	{
		RemoveDuplicates obj=new RemoveDuplicates();
		int[] arr= {2,2,2,1,1,1,3,3,3};
		int n=arr.length;
		
		int[] finalArray=obj.meth(arr, n);
		
		for(int array: finalArray)
		{
			System.out.print(array + " ");
		}
	}
	}