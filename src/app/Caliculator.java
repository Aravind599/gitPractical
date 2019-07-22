package app;
import java.util.Scanner;

public class Caliculator {

	public static void main(String args[])
	{
		
		System.out.println(" enter the two input numbers ");
		Scanner sc =  new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		MathCalcilus  mat = new MathCalcilus() ;
		
		 int result  = mat.add(a, b);
		
		 System.out.println(" addition of given inputs is >>"+ result );
		 
		 result = mat.difference(a, b);
		 System.out.println(" difference  of given inputs is >>"+ result );
		 MathCalcilus.print();
	}
	
}
