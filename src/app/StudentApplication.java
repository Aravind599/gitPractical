package app;

import java.util.Scanner;

import Student.Student;

public class StudentApplication {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("enter the no of students ");
		
	
	   int 	noofStudents = sc.nextInt();
	   
	   Student[]  studObject  = new Student[noofStudents];

	   for(int i=0; i<studObject.length;i++)
	   {
		   studObject[i]  = new Student();
		   System.out.println("enter Name| studentid | age| maths| physics| chemistry");
		   returnValues(studObject[i]);   
		   studObject[i].totalmarks = total(studObject[i]) ;
	   }
	}

	  public static void returnValues(Student presentStudent)
	  {
		  presentStudent.studentid = sc.nextLine();
		  presentStudent.name = sc.nextLine();
		  presentStudent.age = sc.nextInt();
		  presentStudent.maths = sc.nextInt();
		  presentStudent.physics = sc.nextInt();
		  presentStudent.chemistry = sc.nextInt();
		  
	  }
	  
	  public static int  total(Student presentStudent )
	  {
		return   presentStudent.totalmarks = presentStudent.maths + presentStudent.physics + presentStudent.chemistry ;
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
}
