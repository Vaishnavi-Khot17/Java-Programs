/*Q3. Store any 7 integers in a Vector.
 Calculate and print the sum of all elements.
Addition operation
Looping through Vector
Explanation
Keep a variable sum initially 0, then add each element.*/

import java.util.*;
public class SumOfElementVector
{
  public static void main(String[]args)
  {
    Vector v=new Vector();
	v.add(10);
	v.add(20);
	v.add(30);
	v.add(40);
	v.add(50);
	v.add(60);
	v.add(70);
	int sum=0;
	Iterator i=v.iterator();
	while(i.hasNext())
	{
	  Object obj=i.next();
	  sum=sum+(int)obj;
	}
	 System.out.println("sum="+sum);
	}
}