package sorting;

public class InsertionSort1 
{
	public int[] sortmeth(int n, int[] arr) 
	{
		for(int i=1;i<n;i++)
		{
			int j=i;
			
			while(j>0 && arr[j-1]>arr[j])
			{
				int temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
				j--;
			}
		}
		
		return arr;
	}

	public static void main(String[] args) 
	{
		InsertionSort1 obj = new InsertionSort1();
        int[] arr = {2, 5, 4, 1, 3};
        int n = arr.length;
        obj.sortmeth(n, arr);

        for (int num : arr) 
        {
            System.out.print(num + " ");
        }

	}

}
