//153 -> 1^3 + 5^3 + 3^3 = 153

import java.util.Scanner;

class Digit
{
	public boolean isArmstrong(int iNo)
	{
		int iCnt = 0;
		int temp = iNo;
		int iSum = 0, iDigit = 0, iPower = 1;
		
		while(temp > 0)
		{
			temp = temp / 10;
			iCnt++;
		}
		
		temp = iNo;
		while(temp > 0)
		{
			iDigit = temp % 10;
			
			for(int i=1; i <= iCnt; i++)
			{
				iPower = iPower * iDigit;
			}
			iSum =  iSum + iPower;
			iPower = 1;
			temp = temp/10;
		}
		
		if(iSum == iNo)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}




public class Armstrong {

	public static void main(String args[])
	{
		int iNo; 
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		iNo = sobj.nextInt();
		
		Digit dobj = new Digit();
		boolean iRet = dobj.isArmstrong(iNo);
		
		if(iRet == true)
		{
			System.out.println(iNo + " is a Armstrong number");
		}
		else
		{
			System.out.println(iNo + " is NOT a Armstrong number");
		}
		
	}
}
