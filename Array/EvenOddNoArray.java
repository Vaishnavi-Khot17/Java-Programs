//Q4. Write a java program to find even and odd number in array.

import java.util.*;
public class EvenOddNoArray
{
  public static void main(String[]args)
  {
	 int e=0;
	 int o=0;
     Scanner xyz  = new Scanner(System.in);
       int a[]=new int[4];
	   System.out.println("Enter values in array");
	   for(int i=0; i<a.length; i++)
	   { 
         a[i]=xyz.nextInt();
	   }
	   
	   int even []=new int[a.length];
	   int odd []=new int[a.length];
	   for(int i=0; i<a.length; i++)
	   {
	       if(a[i]%2==0)
		   {
			   even[e++]=a[i];
			   
		   }
		   
		   else
		   {
			    odd[o++]=a[i];
				
		   }
	   }
		   System.out.println("even numbers");
		   for( int i=0;i<e;i++)
		   {
			   System.out.println(even[i]);
		   }
		   System.out.println("odd numbers");
		   for(int  i=0;i<o;i++)
		   {
			   System.out.println(odd[i]);
		   }
		   
	   
	  
   
   }
}