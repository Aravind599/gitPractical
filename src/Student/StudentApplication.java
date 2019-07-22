package Student;
public class StudentApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stud = new Student();
		
		stud.studentid = "plw6519" ;
		stud.name = "Aravind" ;
		stud.marks[0] = 58 ;
		stud.marks[1] = 99 ;
		stud.marks[2] = 28 ;
		stud.marks[3] = 73 ;
		stud.marks[4] = 15 ;
		stud.marks[5] = 58 ;
		int highestmarks = stud.marks[0];
		//logic for total marks
		for(int i=0 ; i<stud.marks.length;i++)
		{
			stud.totalmarks = stud.totalmarks + stud.marks[i];
			if(highestmarks<=stud.marks[i])
			{
				 highestmarks = stud.marks[i];
			}
				
		}
		
		System.out.println("total marks of the student >>>"+stud.totalmarks);
		
		 int Average = stud.totalmarks/stud.marks.length ; 
		 System.out.println("average marks of student  >>>"+Average);
		System.out.println("highest marks of the student >>>"+highestmarks);
		//logic for pass marks 
		int passmmarks =35 ;
		for(int i=0;i<stud.marks.length;i++)
		{
			 
			if(stud.marks[i]<passmmarks)
			{
				System.out.println("student got failed ");
				break ;
			}
				
		}
		
	}

}
