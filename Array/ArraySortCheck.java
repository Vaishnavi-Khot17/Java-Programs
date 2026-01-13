//check array is sorted or not (only check not sort array)

import java.util.*;
public class ArraySortCheck
{
  public static void main(String[]args)
  { 
    int a[]=new int[5];
	boolean flag=true;
    Scanner sc=new Scanner(System.in);
	System.out.println("enter arrays element");
	for(int i=0;i<a.length;i++)
	{
	  a[i]=sc.nextInt();
	}
	for(int i=0;i<a.length-1;i++)
	{
	  if(a[i]>a[i+1])
	  {
	    flag=false;
		break;
	   }
	}
	
	if(flag)
	{
	  System.out.println("array is sorted");
	}
	else
	{
	  System.out.println("array is not sorted");
	}
  }
 }
	
	