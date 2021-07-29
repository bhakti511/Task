import java.util.Scanner;

//927 -> 18 -> 9
//9975 -> 30 -> 3
//8 -> 8

class Digits
{
	int FindGenRoot(int iNo)
	{
		int iSum = iNo;
		while(iSum > 10)
		{
			iSum = 0;
			while(iNo > 0)
			{
				iSum = iSum + (iNo % 10);
				iNo = iNo/10;
			}
			
			iNo = iSum;
		}
		
		return iSum;
	}
	
	
	
}

public class GenericRoot {
	
	public static void main(String args[])
	{
		int iNo, iRet; 
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		iNo = sobj.nextInt();
		
		Digits dobj = new Digits();
		iRet = dobj.FindGenRoot(iNo);
		System.out.println("Generic root is: " +iRet);
	}

}
