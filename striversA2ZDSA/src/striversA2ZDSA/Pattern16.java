package striversA2ZDSA;

import java.util.Scanner;

//A
//BB
//CCC
//DDDD
//EEEEE

public class Pattern16 {

	void pat16(int n)
	{
		char ch='A';
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(ch+" ");
			}
			System.out.println();
			ch += 1;
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Pattern16 obj=new Pattern16();
		System.out.println("Enter number of rows: ");
		int rows=sc.nextInt();
		
		obj.pat16(rows);
		sc.close();
	}

}