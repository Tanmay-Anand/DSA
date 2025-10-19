package striversA2ZDSA;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FrequencyMap 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Give array SIZE: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		System.out.println("Give VALUES to the Array: ");
		for(int i=0;i<n;i++)
		{
			System.out.print("Value for index "+i+" : ");
			arr[i]= sc.nextInt();
		}
		
		//PreCompute frequencies using TreeMap- Sorted by Key
		TreeMap<Integer, Integer> mpp= new TreeMap<>();
		
		for(int i=0;i<n;i++)
		{
			mpp.put(arr[i], mpp.getOrDefault(arr[i], 0)+1);
		}
		
		//print map- Sorted Automatically
		for(Map.Entry<Integer, Integer> entry: mpp.entrySet())
		{
			System.out.println(entry.getKey()+" -> "+entry.getValue());
		}
	}

}
