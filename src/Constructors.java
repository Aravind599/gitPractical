// this program explains different types of constructors 
public class Constructors {
	
	
	static int i;
	static String name ;
	static float k ;
	static double t;
	
	
	Constructors(int x,String y,float z,double v)
	{
		i = x;
		name = y;
		k = z ;
		t= v;
		
		
	}
	
	public static void main(String[] args) {
		
		
		Constructors   c = new Constructors(10,"aravind",5.0f,7.0d);
		System.out.println(c);
		System.out.println(i);
		System.out.println(name);
		System.out.println(k);
		System.out.println(t);
		
		System.out.println("Aravind");
		System.out.println("Suryanarayana");
		System.out.println("Raju");

		System.out.println("indian guy");

		System.out.println("Asian constructor");
		System.out.println("Asian constructor2");

		//
		System.out.println("american guy");
		System.out.println("change1");
		System.out.println("change2");
		
		
	}
	

}
class A 
{
	
}
class B Extends A
{
	
}
class C Extends B 
{
	
}