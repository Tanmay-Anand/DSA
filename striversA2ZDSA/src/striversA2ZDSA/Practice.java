package striversA2ZDSA;

public class Practice {

	public void p1(int n)
	{
		for(int i=0; i<=n; i++)
		{
			for(int j=0; j<n; j++)
			{
				System.out.print("*");
			}
			System.out.println( );
		}
		System.out.println("\n");
	}
	
	
	public void p2(int n)
	{
		for(int i=0; i<=n; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println( );
		}
		System.out.println("\n");
	}
	
	
	public void p3(int n)
	{
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j);
			}
			System.out.println( );
		}
		System.out.println("\n");
	}
	
	public void p4(int n)
	{
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(i);
			}
			System.out.println( );
		}
		System.out.println("\n");
	}
	
	
	public void p5(int n)
	{
		for(int i=0; i<=n; i++)
		{
			for(int j=1; j<n-i+1; j++)
			{
				System.out.print("*");
			}
			System.out.println( );
		}
		System.out.println("\n");
	}
	
	
	public void p6(int n)
	{
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n-i+1; j++)
			{
				System.out.print(j);
			}
			System.out.println( );
		}
		System.out.println("\n");
	}
	
//   *
//  ***
// *****
//*******
	
	public void p7(int n)
	{
		for(int i=0; i<n; i++)
		{
			//space
			for(int j=0;j<n-i-1;j++)
			{
				System.out.print(" ");
			}
			//star
			for(int j=0;j<2*i+1;j++)
			{
				System.out.print("*");
			}
			//space
			for(int j=0;j<n-i-1;j++)
			{
				System.out.print(" ");
			}
			System.out.println( );
		}
		System.out.println("\n");
	}
	
	
//   *
//  ***
// *****
//*******
//*******
// *****
//  ***
//   *
	
	
	public void p8(int n) {
	    // upper half
	    for (int i = 0; i < n; i++) {
	        // spaces
	        for (int j = 0; j < n - i - 1; j++) {
	            System.out.print(" ");
	        }
	        // stars
	        for (int j = 0; j < 2 * i + 1; j++) {
	            System.out.print("*");
	        }
	        System.out.println();
	    }

	    // lower half
	    for (int i = n - 1; i >= 0; i--) {
	        // spaces
	        for (int j = 0; j < n - i - 1; j++) {
	            System.out.print(" ");
	        }
	        // stars
	        for (int j = 0; j < 2 * i + 1; j++) {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	}

	
	public static void main(String[] args) 
	{
		Practice obj=new Practice();
		obj.p1(5);
		obj.p2(5);
		obj.p3(5);
		obj.p4(5);
		obj.p5(5);
		obj.p6(5);
		obj.p7(5);
		obj.p8(5);
		
	}

}
