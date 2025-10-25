package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NextPermutation 
{
	//method/function
	public List<Integer> nextPermutation(int[] nums)
	{
		List<List<Integer>> all=new ArrayList<>();
		
		Arrays.sort(nums);
		
		permute(nums,0, all);
		
		List<Integer> current=new ArrayList<>();
		for(int num: nums)
		{
			current.add(num);
		}
		
		for(int i=0; i<all.size(); i++)
		{
			if(all.get(i).equals(current))
			{
				if(i==all.size()-1)
					return all.get(0);
				
				return all.get(i+1);
			}
		}
		return current;
	}
	
	
	private void permute(int[] nums, int start, List<List<Integer>>all)
	{
		if(start==nums.length)
		{
			List<Integer> temp=new ArrayList<>();
			for(int num:nums)
				temp.add(num);
			
			all.add(new ArrayList<>(temp));
			return;
		}
		
		for(int i=start; i<nums.length; i++)
		{
			swap(nums, i, start);
			permute(nums,start+1, all);
			swap(nums, i, start);
		}
	}
	
	private void swap(int[] arr, int i, int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public static void main(String[] args) 
	{
		int[] nums= {1,2,3};
		NextPermutation sol=new NextPermutation();
		
		List<Integer> result=sol.nextPermutation(nums);
		
		for(int num:nums)
		{
			System.out.print(num+" ");
		}
		System.out.println();
	}
}
