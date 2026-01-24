/* Write a Java program to store 5 integers in a Vector.
 Print only the even numbers using a loop.
Vector creation
Adding elements
Logical condition: num % 2 == 0*/

import java.util.*;
public class StoreEvenNocollection
{
  public static void main(String[]args)
  {
     Vector v = new Vector();
	 v.add(10);
	 v.add(11);
	 v.add(12);
	 v.add(13);
	 v.add(14);
	 v.add(15);
	 
	 System.out.println("even number");
	 
	 Iterator i = v.iterator();
	 while(i.hasNext())
	 {
	   Object obj=i.next();
	   if((int)obj%2==0)
	   {
	     System.out.println(obj);
		}
	 }
  }
}
	 
	 