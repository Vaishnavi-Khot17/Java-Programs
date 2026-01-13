/*
7. Find Intersection of Two Arrays
 Problem:
Print common elements in two arrays using brute force.
Example:
Input: arr1 = [1, 2, 3], arr2 = [2, 3, 4]  
Output: 2, 3
*/

import java.util.*;
public class IntersectionTwoarray
{
  public static void main(String[]args)
  {
    int a[]=new int[3];
	int b[]=new int[3];
	int i;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter values of first arrays");
	
	for(i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
		
	}
	System.out.println("enter values of second arrays");
	for(i=0;i<b.length;i++)
	{
	  b[i]=sc.nextInt();
	}
	for(i=0;i<a.length;i++)
	{
	  for(int j=0;j<b.length;j++)
	   {
		if(a[i]==b[j])
		{
			System.out.println("Intersection of array:"+a[i]);
			break;
		}
	
	   }
   }
  }
}