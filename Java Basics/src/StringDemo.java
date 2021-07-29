//Count capital letters from string

import java.util.*;

class String1
{
	int CapCount(String str)
	{
		int iCnt = 0;
		char arr[] = str.toCharArray();
		
		for(int i=0; i<arr.length; i++)
		{
			if((arr[i] >= 'A') && (arr[i] <= 'Z'))
			{
				iCnt++;
			}
		}
		
		return iCnt;
	}
}

public class StringDemo {

	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = sobj.nextLine();
		
		String1 s = new String1();
		int iRet = s.CapCount(str);
		
		System.out.println("Count of capital letters: " + iRet);
		
	}
	
}
