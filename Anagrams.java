//Accept two strings from user and check whether they are anagrams or not.(without using built-in function)
//Consider small letters only
// abcde   cebad
//india  iinda

import java.util.*;

class StringA
{
//	boolean CheckAnagram(String str1, String str2)    ***First logic ****
//	{
//		boolean flag = true;
//		char arr1[] = str1.toCharArray();
//		char arr2[] = str2.toCharArray();
//		int cnt1,cnt2;
//		char temp;
//		
//		if(arr1.length == arr2.length)
//		{
//			for(int i=0; i<arr1.length; i++)
//			{
//				temp = arr1[i];
//				cnt1=1;
//				cnt2=0;
//				
//				for(int j=0; j<arr1.length; j++)
//				{
//					if((arr1[j] == temp) && (j != i))
//					{
//						cnt1++;
//					}
//				}
//				
//				for(int j=0; j<arr2.length; j++)
//				{
//					if(arr2[j] == temp)
//					{
//						cnt2++;
//					}
//				}
//				
//				if(cnt1==cnt2)
//				{
//					continue;
//				}
//				else
//				{
//					flag=false;
//					break;
//				}
//			}
//			
//		}
//		
//		else
//		{
//			flag = false;
//		}
//		return flag;
//	}
	
	
	
	boolean CheckAnagram(String str1, String str2)  // ***logic with less time complexity ***
	{
		
		int arrCnt1[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		int arrCnt2[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		char arr1[] = str1.toCharArray();
    	char arr2[] = str2.toCharArray();
    	int i = 0;
    	
    	if(str1.length() != str2.length())
    	{
    		return false;
    	}
    	
    	else {
    		
    	
	    	for(i = 0; i<arr1.length; i++)
	    	{
	    		arrCnt1[arr1[i] - 'a']++;
	    	}
	    	for(i = 0; i<arr2.length; i++)
	    	{
	    		arrCnt2[arr2[i] - 'a']++;
	    	}
	    	
	    	for(i=0; i<26; i++)
	    	{
	    		if(arrCnt1[i] != arrCnt2[i])
	    		{
	    			break;
	    		}
	    		
	    	}
	    	if(i == 26)
	    	{
	    		return true;
	    	}
	    	else
	    	{
	    		return false;
	    	}
	    	
    	}
    	
    	
	}
	
}


public class Anagrams {
	
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter string 1: ");
		String str1 = sobj.nextLine();
		System.out.println("Enter string 2: ");
		String str2 = sobj.nextLine();
		
		StringA obj = new StringA();
		boolean bRet = obj.CheckAnagram(str1, str2);
		
		if(bRet == true)
		{
			System.out.println("Strings are anagrams");
			
		}
		else
		{
			System.out.println("Strings are NOT anagrams");
			
			
		}
		
	}
	
}
