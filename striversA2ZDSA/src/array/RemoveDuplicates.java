package array;

public class RemoveDuplicates {
	
	public int[] meth(int[] arr, int n)
	{
		int[] arrFinal=new int[n];
		int i=0;
		int k=0;
		
		for(int j=i+1;j<n;j++)
		{
			if(arr[j] != arr[i])
			{
				arrFinal[k]=arr[j];
				i++;
				k++;
			}
		}
	
		
		return arrFinal;
	}

	public static void main(String[] args) 
	{
		RemoveDuplicates obj=new RemoveDuplicates();
		int[] arr= {1,1,1,2,2,2,3,3,3}; //ALREADY SORTED ARRAY
		int n=arr.length;
		
		int[] finalArray=obj.meth(arr, n);
		
		for(int array: finalArray)
		{
			System.out.print(array + " ");
		}
	}
	}