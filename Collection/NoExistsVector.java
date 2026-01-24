/*Q4. Take a Vector and add 8 integers.
 Accept a number from the user and check if it exists in the Vector.
Searching using loop
Logical condition:
if (vector.get(i) == searchValue)
Explanation
Compare each element with the search number.
 If matched, set a boolean flag to true.*/
 
 import java.util.*;
 public class NoExistsVector
 {
   public static void main(String[]args)
   {
    boolean flag=false;
     Scanner sc=new Scanner(System.in);
	 
	 Vector v=new Vector();
	 
	 v.add(10);
	 v.add(20);
	 v.add(30);
	 v.add(40);
	 v.add(50);
	 v.add(60);
	 v.add(70);
	 v.add(80);
	 
	 System.out.println("enter Sesrch Key");
	 int skey=sc.nextInt();
	
	for(int i=0;i<v.size();i++)
	{
	   if((int)v.get(i)==skey)
	   {
	     flag=true;
		}
	  }
      if(flag)
      {
	    System.out.println("element is exists");
      }
	  else
	  {
		  System.out.println("element is not exists");
	  }
    }
}	
	   