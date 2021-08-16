package test;
import java.util.*;
import java.util.stream.*;
public class StreamMain {

		public static void main(String args[])
		{
			//create list and filter even no. from the list.
			
			List<Integer> list1 = new ArrayList<>();
			list1.add(12);
			list1.add(4);
			list1.add(73);
			list1.add(58);
			list1.add(7);
			
			//without stream
			List<Integer> Evenlist = new ArrayList<>();
			
			for(Integer i:list1)
			{
				if(i%2 == 0)
				{
					Evenlist.add(i);
				}
			}
			
			System.out.println(list1);
			System.out.println(Evenlist);
			
			
			//with stream
			
			Stream<Integer> stream = list1.stream();
			List<Integer> newList = stream.filter(i-> i%2==0).collect(Collectors.toList());
			
			System.out.println(list1);
			System.out.println(newList);
			
		}
	}

