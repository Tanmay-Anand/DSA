package array;

import utilities.IO;

public class LargestElement {
	public int meth(int[] arr, int n) {
		int largest = arr[0];
		for (int i = 0; i < n - 1; i++) {
			if (arr[i + 1] > arr[i]) {
				largest = arr[i + 1];
			}
		}

		return largest;
	}

	public static void main(String[] args) 
	{
		int n = IO.readInt("Enter number of elements: ");
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) 
		{
			arr[i] = IO.readInt("Enter element " + (i + 1) + ": ");
		}
		LargestElement obj = new LargestElement();
		int largestNumber = obj.meth(arr, n);

		IO.print("The largest element is: " + largestNumber);
	}

}
