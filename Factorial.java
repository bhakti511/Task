import java.util.Scanner;

class Calculate{
	
	public int CalculateFact(int no)
	{
		int fact = 1;
		
		for(int i = no; i > 1; i--)
		{
			fact = fact * i;
			no--;
		}
		
		return fact;
	}
}

public class Factorial {
	
	public static void main(String args[])
	{
		int no;
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter no: ");
		no = sobj.nextInt();
		
		Calculate cobj = new Calculate();
		int res = cobj.CalculateFact(no);
		
		System.out.println(res);
		
	}
}
