
public class Faculty {

	int id;
	String name;
	String lastname;
	
	void display()
	{
		
		System.out.println("faculty  id >>>"+id);
		System.out.println("faculty  name >>>"+name+lastname);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Faculty f1 = new Faculty();
		Faculty f2 = new Faculty();
        f1.id=10;
        f1.name = "Aravind ";
        f1.lastname = "Raju";
        f2.id = 20 ;
        f2.name = "Suryanarayana raju ";
        f2.lastname = "Penmatsa";
		f1.display();
		f2.display();
	}

}
