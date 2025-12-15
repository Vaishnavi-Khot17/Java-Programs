 /* Check If Array Is Sorted
 Problem:
Determine whether an array is sorted in non-decreasing order.
Example:
Input: [1, 2, 2, 3, 4]  
Output: true
*/
                                                                                   
import java.util.*;
public class CheckArraySorted
{
  public static void main(String[]args)
  {
     int a[]=new int[5];
	 
	 
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter values of array");
	 boolean sorted=true;;
	 for(int i=0;i<a.length;i++)
	 {
	   a[i]=sc.nextInt();
	 }
	 for(int i=0;i<a.length-1;i++)
	 {
	   if(a[i]>a[i+1])
	   {
	     sorted=false;
		 break;
	   }
	 }
	 System.out.println(sorted);
	
   }
  }

	 
