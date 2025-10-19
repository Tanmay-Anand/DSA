package striversA2ZDSA;

class Level4Q1 
{
    public int countDigit(int n) 
    {
    	int count=0;
    	String numStr=Integer.toString(n);
    	int[] digitArr=new int[numStr.length()];
    	
    	for(int i=0; i<= digitArr.length -1; i++)
    	{
    		count++;
    	}
    	return count;
    }
    
    public static void main(String[] args) 
    {
    	Level4Q1 l4=new Level4Q1();
    	System.out.println(l4.countDigit(865879447));
    	
	}
}
