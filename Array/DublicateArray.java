//write a program remove duplicates from sorted array.

import java.util.*;
public class DublicateArray
{
  public static void main(String[]args)
  {
    int a[]=new int[6];
	int j=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter array elements");
	for(int i=0;i<a.length;i++)
	{
	  a[i]=sc.nextInt();
	}
	for(int i=0;i<a.length;i++)
	{
	  if(a[i]!=a[j])
	  {
	    j++;
		a[j]=a[i];
	  }
	}
	System.out.println("array after removing duplicates");
	for(int i=0;i<=j;i++)
	{
	  System.out.println(a[i]+" ");
	}
   }
  }