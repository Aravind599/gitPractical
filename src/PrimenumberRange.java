import java.util.Scanner;

// program to print the prime numbers with in a range 
public class PrimenumberRange {
	
	
	public static void main (String args[])
	{
		
		    Scanner sc = new Scanner(System.in);
		    System.out.println("enter the range with in which you want to print the prime numbers");
		    int range=sc.nextInt();
		    for(int i=2;i<=range;i++)
		    {
		    	int count = 0 ;
		    	for(int j=2;j<=i;j++)
		    	{
		    	
		    		if(i%j==0)
		    		{
		    			count++;
		    		}
		  
		    		
		    		
		    	}
		    	
				if(count==1)
		    	{
		    		System.out.println(i+" : is a prime number  ");
		    	}
		    	
		    }
		
		
		
		
		
	}

}
