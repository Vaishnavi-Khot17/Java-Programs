/*Q2. Create two ArrayLists containing integers. Merge them into a new ArrayList but avoid adding repeated numbers.
What you practice:
Merging lists
Checking for duplicates (contains)
Building logical flow to avoid sets*/

import java.util.*;
public class MargeArraylist
{
  public static void main(String[]args)
  {
    ArrayList list=new ArrayList();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	
	ArrayList list1=new ArrayList();
	list1.add(70);
	list1.add(20);
	list1.add(30);
	list1.add(80);
	
	ArrayList mergelist=new ArrayList();
	
	for(int i=0;i<list.size();i++)
	{
	  if(!mergelist.contains(list.get(i)))
	  {
	      mergelist.add(list.get(i));
	  }
	}
	
	for(int i=0;i<list1.size();i++)
	{
	  if(!mergelist.contains(list1.get(i)))
	  {
	      mergelist.add(list1.get(i));
	  }
	}
	
	System.out.println(mergelist);
   }
  }
	
	
	
	