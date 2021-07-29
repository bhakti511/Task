import java.util.Scanner;

//2. Exercise -(Instance variable, methods, operators, loop, type conversion) Modify the classes created in 1st assignment to utilize these new concepts
//   Outcome - Should be comfortable with what are instance variables and methods and what is the real use. Should understand how to convert data types.

class StudentInfo{
	
	public int iRollNo;
	public String sName;
	public int iMarks;
	public long iContact;
	
	
	StudentInfo()
	{}
	
	StudentInfo(int iRollNo, String sName, int iMarks, long iContact)
	{
		this.iRollNo = iRollNo;
		this.sName = sName;
		this.iMarks = iMarks;
		this.iContact = iContact;
	}
	
	void search(int rollno, StudentInfo obj[])
	{
		int i = 0;
		for(i=0; i<obj.length; i++)
		{
			if(obj[i].iRollNo == rollno)
			{
				break;
			}
			else
			{
				continue;
			}
		}
		if(i >= obj.length)
		{
			System.out.println("Entered roll no. is invalid.");
		}
		else {
			System.out.println(obj[i].iRollNo +"\n"+ obj[i].sName +"\n"+ obj[i].iMarks +"\n"+ obj[i].iContact );
		}
		
	}
	
	void Display()
	{
		System.out.println(iRollNo +"\t"+ sName +"\t"+ iMarks +"\t"+ iContact);
		
	}
	
}


public class Exercise2 {
	
	public static void main(String args[])
	{
		int Rollno, marks;
		String name;
		long contactno;
		int iNo;
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter no. of students you want to enter: ");
		iNo = sobj.nextInt();
		
		StudentInfo obj[] = new StudentInfo[iNo];
		StudentInfo obj1 = new StudentInfo();
		
		for(int i = 0; i<iNo; i++)
		{
			System.out.println("Enter roll no. of student: ");
			Rollno = sobj.nextInt();
			
			System.out.println("Enter name of student: ");
			name = sobj.next();
			
			System.out.println("Enter marks of student: ");
			marks = sobj.nextInt();
			
			System.out.println("Enter contact no. of student: ");
			contactno = sobj.nextLong();
			
			obj[i] = new StudentInfo(Rollno, name, marks, contactno);
		}
		
		int choice;
		while(true) {
			
		
			System.out.println("1.Display the contents. \n 2.Search the record. \n");
			System.out.println("Enter the choice: ");
			choice = sobj.nextInt();
			
			switch(choice)
			{
				case 1:
					System.out.println("STUDENT DETAILS");
					System.out.println("Roll no. \t Name \t Marks \t Contact number");
					for(int i=0; i<iNo; i++)
					{
						obj[i].Display();
					}
					break;
					
				case 2:
					int no;
					System.out.println("Enter roll no of student to search the info: ");
					no = sobj.nextInt();
					
					obj1.search(no,obj);
					break;
				
				default:
					System.exit(0);
					break;
					
			}
		
		}
		
	}
	

}
