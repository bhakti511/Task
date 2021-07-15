import java.util.Scanner;

//take array as a input and calculate it's sum

class Operation{
	
	public void ArrayAddition(int iArr[], int iSize)
	{
		int iSum = 0;
		
		for(int i = 0; i<iSize; i++)
		{
			iSum = iSum + iArr[i];
		}
		
		System.out.println(iSum);
	}
}


public class ArrAdd {

	public static void main(String args[])
	{
		System.out.println("Enter no. of elements: ");
		Scanner sobj = new Scanner(System.in);
		
		int iSize = sobj.nextInt();
		
		int iArr[] = new int [iSize];

		System.out.println("Enter elements:");
		for(int i=0; i<iSize; i++)
		{
			iArr[i] = sobj.nextInt();
		}
		
		Operation obj = new Operation();
		obj.ArrayAddition(iArr,iSize);
	}
}
