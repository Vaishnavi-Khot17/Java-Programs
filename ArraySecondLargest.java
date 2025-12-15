/* Find Second Largest Element
Class: ArraySecondLargest
Functions:
void inputArray(int arr[])
int findSecondLargest()
Logic: First find max, then find element just smaller than max.*/

import java.util.*;
class ArraySecondLargest
{
   int a[];
   void inputArray(int arr[])
   {
     a=arr;
	}
	int findSecondLargest()
	{
	  int max=0;
	  int smax=0;
	  for(int i=0;i<a.length;i++)
	  {
	    if(a[i]>max)
		{
		  max=a[i];
		  if(max<smax)
		  {
		    smax=max;
		  }
		 }
	  }
	  return smax;
	}
}

public class ArraySecondLargestCla
{
  public static void main(String[]args)
  {
    int m[]=new int[6];
    Scanner sc=new Scanner(System.in);
	System.out.println("enter arrays value");
	for(int i=0;i<m.length;i++)
	{
	  m[i]=sc.nextInt();
	}
	ArraySecondLargest a1=new ArraySecondLargest();
	a1.inputArray(m);
	int res=a1.findSecondLargest();
	System.out.println("Second largest element is="+res);
  }
 }
         		 

