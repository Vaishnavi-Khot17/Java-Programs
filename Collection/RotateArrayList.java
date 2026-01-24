/*Q7. Given an ArrayList and a value k, rotate the list to the right by k positions:
 Example: [1,2,3,4,5], k=2 → [3,4,5,1,2]
What you practice:
Modular arithmetic
Using temporary lists
Index manipulation*/

import java.util.*;
public class RotateArrayList
{
  public static void main(String[]args)
  {
     ArrayList list=new ArrayList();
	 list.add(1);
     list.add(2);
     list.add(3);
     list.add(4);
     list.add(5);
	 
	int k=2;
	int n=list.size();
	k=k%n;
	
	ArrayList a1=new ArrayList();
	
	for(int i=0;i<n;i++)
	{
	  a1.add(list.get((i+k)%n));
	}
	System.out.println(a1);
	}
}
    
