package sorting;

public class QuickSort1 
{
	public int[] sortmeth(int[] arr, int n) 
	{
		
		return arr;
	}

	public static void main(String[] args) 
	{
		QuickSort1 obj = new QuickSort1();

		int[] arr = { 2, 5, 4, 1, 3 };
		int n = arr.length;

		obj.sortmeth(arr, n);

		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}