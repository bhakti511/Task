import java.util.Scanner;

//Display Factors of a number
class CalculateFactors
{
	public void DisplayFact(int iNo)
	{
		int iCnt = 1;
		
		while(iCnt <= iNo/2)
		{
			if((iNo % iCnt)==0)
			{
				System.out.println(iCnt);
			}
			iCnt++;
		}
	}
}

public class Factors {

	public static void main(String args[])
	{
		int no;
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter no: ");
		no = sobj.nextInt();
		
		CalculateFactors cobj = new CalculateFactors();
		cobj.DisplayFact(no);
		
	}
}
