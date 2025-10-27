package array;

public class MaxConsecutive {

	public int meth(int[] nums)
	{
		int maximum=0;
		int count=0;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]==1)
			{
				count++;
				maximum=Math.max(maximum,count);
			}
			else
			{
				count=0;
			}
		}
		return maximum;
	}
	
	public static void main(String[] args) 
	{
		int[] nums= {1,1,0,1,1,1,0,1,1};
		
		MaxConsecutive obj=new MaxConsecutive();
		
		int result=obj.meth(nums);

		System.out.println(result);
	}

}
