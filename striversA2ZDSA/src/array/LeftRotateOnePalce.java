package array;

public class LeftRotateOnePalce 
{

	public int[] meth(int[] arr, int n)
	{
		 int temp=arr[0];
		 for(int i=1;i<n;i++)
		 {
			 arr[i-1]=arr[i];
		 }
		 arr[n-1]=temp;
		
		return arr;
	}
	
	public static void main(String[] args) 
	{
		LeftRotateOnePalce obj=new LeftRotateOnePalce();
		int[] arr= {2,2,2,1,1,1,3,3,3};
		int n=arr.length;
		
		int[] finalArray=obj.meth(arr, n);
		
		for(int array: finalArray)
		{
			System.out.print(array + " ");
		}

	}

}
