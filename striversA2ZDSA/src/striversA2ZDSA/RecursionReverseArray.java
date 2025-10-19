package striversA2ZDSA;

import java.util.Arrays;

public class RecursionReverseArray 
{
	static void reverse(int[] arr, int left, int right)
	{
		if(left>=right)
		{
			return;
		}
		//Swap Elements
		int temp=arr[left];
		arr[left]=arr[right];
		arr[right]=temp;
		
		//Recursive call with narrowed range
		RecursionReverseArray.reverse(arr, left+1,right-1);
	}

	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,4,5};
		RecursionReverseArray.reverse(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

}
