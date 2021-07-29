//1. Exercise - (Hello world, Class, Object, Variables) Create as many different classes they can create from real world along with there properties. 
//   Outcome - Should  be able to map real world objects to java classes along with proper data types for mapping the properties.


//class student  which can store the name, roll no. amd other information of student.

import java.util.*;

class Student{
	
	private int iRollNo;
	private String sName;
	private int iMarks;
	private long iContact;
	
	Student(int iRollNo, String sName, int iMarks, long iContact)
	{
		this.iRollNo = iRollNo;
		this.sName = sName;
		this.iMarks = iMarks;
		this.iContact = iContact;
	}
	
	void Display()
	{
		System.out.println("STUDENT DETAILS: ");
		System.out.println("Roll number: "+iRollNo+
							"\nName: " +sName+
							"\nMarks: "+iMarks+
							"\nContact number: "+iContact);
		
	}
	
}

public class Exercise1 {
	
	public static void main(String args[])
	{
		int Rollno, marks;
		String name;
		long contactno;
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter roll no. of student: ");
		Rollno = sobj.nextInt();
		
		System.out.println("Enter name of student: ");
		name = sobj.next();
		
		System.out.println("Enter marks of student: ");
		marks = sobj.nextInt();
		
		System.out.println("Enter contact no. of student: ");
		contactno = sobj.nextLong();
		
		
		
		Student obj = new Student(Rollno, name, marks, contactno);
		
		obj.Display();
		
		
	}
	
	

}
