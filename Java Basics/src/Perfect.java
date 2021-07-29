//Check whether the number is perfect or not

import java.util.Scanner;

class CheckPerfect
{
	public boolean isPerfect(int iNo)
	{
		int iSum = 0;
		
		for(int i = 1; i <= iNo/2; i++)
		{
			if((iNo % i) == 0)
			{
				iSum = iSum + i;
			}
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

public class Perfect {
	
	public static void main(String args[])
	{
		int iNo;
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter no: ");
		iNo = sobj.nextInt();
		
		CheckPerfect cobj = new CheckPerfect();
		boolean bRet = cobj.isPerfect(iNo);
		
		if(bRet == true)
		{
			System.out.println(iNo+ " is a Perfect number");
		}
		else
		{
			System.out.println(iNo + " is Not a perfect number");
		}
		
	}

}
