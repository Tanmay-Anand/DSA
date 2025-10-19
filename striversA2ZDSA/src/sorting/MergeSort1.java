package sorting;





//INCOMPLETE













public class MergeSort1 
{
	
	public int[] sortmeth(int[] arr, int low, int mid, int high)
	{
		int[] temp= new int[high];
		
		int left=low;
		int right=mid+1;
		while(left<=mid && right<=high)
		{
			//temp.add(arr[left]);
			left++;
		}
		
		return arr;
	}
	
	public static void main(String[] args) 
	{
		MergeSort1 obj=new MergeSort1();
		
		int[] arr= {2,5,4,1,3};
		int n=arr.length;
		int low=0;
		int high=n;
		
		int mid= (low+high)/2;
		
		obj.sortmeth(arr, low, mid, high);
		
		for(int num: arr)
		{
			System.out.print(num + " ");
		}
	}

}
