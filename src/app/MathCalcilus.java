package app;

public class MathCalcilus {
	
	int firstNumber ;
	int secondNumber ;
	
	private void printData()
	{
		System.out.println("inside print data method");
	}
	
	public int add(int x , int y)
	{
		firstNumber = x ;
		secondNumber = y ;
		int result = firstNumber + secondNumber ;
		return result ;
	}
	
	public int difference(int x , int y)
	{
		firstNumber = x ;
		secondNumber = y ;
		int result = firstNumber - secondNumber ;
		return result ;
	}
	
	public static void print()
	{
		System.out.println(" inside print method ");
	}
	
}
