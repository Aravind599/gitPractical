
public class IfElse {

	public static void main(String[] args) 
	{
		
	     int age = 22 ;
	     String country = "India";
	     String country1 = "USA";
	     String country2 = "Australia";
	     String country3 = "Canada";
	     String country4 = "Europe";
	     String country5 = "Germany";
	     
	     if(age>=20 && country != "India")
	     {
	    	System.out.println("You are eligeble to vote in india"); 
	     }
	     else if(age>=22 && country1 == "USA")
	     {
	    	 System.out.println("You are eligeble to vote in USA");
	     }
	     else if(age>=24 && country2 == "Australia")
	     {
	    	 System.out.println("You are eligeble to vote in Australia");
	     }
	     else if(age>=26 && country3 == "Canada")
	     {
	    	 System.out.println("You are eligeble to vote in Canada");
	     }
	     else if(age>=28 && country4 == "Europe")
	     {
	    	 System.out.println("You are eligeble to vote in Europe");
	     }
	     else if(age>=30 && country5 == "Germany")
	     {
	    	 System.out.println("You are eligeble to vote in Germany");
	     }
	     else 
	     {
	    	 System.out.println("You are not eligeble to vote in any country");
	     }
	}

	

}
