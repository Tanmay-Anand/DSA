package striversA2ZDSA;

import java.util.Scanner;

//   A
//  ABA
// ABCBA
//ABCDCBA


public class Pattern17 {

	void pat17(int n)
	{
		for(int i=0;i<n;i++)
		{
			//space
			for(int j=0;i<n-i-1;j++)
			{
				System.out.print(" ");
			}
			//character
			for(int j=0; j<2*(i+1);j++)
			{
				System.out.println("*");
			}
			//space
			for(int j=0;i<n-i-1;j++)
			{
				System.out.print(" ");
			}
			System.out.println( );
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Pattern17 obj=new Pattern17();
		System.out.println("Enter number of rows: ");
		int rows=sc.nextInt();
		
		obj.pat17(rows);
		sc.close();
	}

}