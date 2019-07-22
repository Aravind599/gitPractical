import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		//meter number 
		// no of units 
		//acc holder name 
		//charge per unit 
		
		String meterNumber ;
		int noOFUnits;
		String accHolderName;
		int chargePerUnit=0;
		int category ;
		int totalCharge ;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the meter number");
		meterNumber=sc.next();
		// sc = new Scanner(System.in);
		System.out.println("enter the no of units");
		noOFUnits=sc.nextInt();
		//Scanner sc = new Scanner(System.in);
		System.out.println("enter the acc holder name");
		accHolderName=sc.next();
		//Scanner sc = new Scanner(System.in);
		//System.out.println("enter the charge per unit");
		//chargePerUnit=sc.nextInt();
		System.out.println("enter the category (1/2/3");
		category=sc.nextInt();
		
		switch(category)
		{    
		     case 1: chargePerUnit =15;
		    	 break;
		    	 
		     case 2: chargePerUnit =20;
		    	 break;
		    	 
		     case 3:  chargePerUnit =25;
		    	 break;
		    	 
		     
		}
		
		
		
		 totalCharge=  noOFUnits * chargePerUnit ;
		
		System.out.println("total charge ="+totalCharge);
		
		
		
		
		
		
	}

}
