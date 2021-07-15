import java.util.Scanner;

//calculate sum of digits in a number

class CalculateRes
{
	public int CalSum(int iNo)   // non-recursive function
	{
		int iSum = 0;
		int iDigit;
		
		while(iNo > 0)
		{
			iDigit = iNo%10;
			iSum = iSum + iDigit;
			iNo = iNo/10;
		}
		return iSum;
	}
	
	
}

public class SumDigit {
	
	public static void main(String args[])
	{
		int iNo;
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter no: ");
		iNo = sobj.nextInt();
		
		CalculateRes cobj = new CalculateRes();
		int res = cobj.CalSum(iNo);
		
		System.out.println(res);
		
		
	}

}
