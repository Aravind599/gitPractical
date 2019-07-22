import java.util.Scanner;

// program to print prime numbers in the given range
public class PrimeNumber {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the range in which you want to print the prime numbers : ");
		int  range  =  sc.nextInt();
		int counter = 0;
		for(int j=1;j<=range;j++)
		{
		int i=1;
		while(i<=j)
		{
			
			if(j%i==0)
			{
				counter++;
				//System.out.println("number is not a prime number");
				
					
			}
			i++;
		}
		}
		if(counter==2)
		{
			System.out.println("number is  a prime number");
		}
		else
		{
			System.out.println("number is not a prime number");
		}
              
	}

}
