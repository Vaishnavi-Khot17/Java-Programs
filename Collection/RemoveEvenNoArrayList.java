/*Q1. Given an integer array, convert it into an ArrayList. Remove all even numbers and print the updated list.
What you practice:
Converting array → ArrayList using loops / Arrays.asList
Removing elements while iterating
Understanding wrapper Integer*/

import java.util.*;
public class RemoveEvenNoArrayList
{
  public static void main(String[]args)
  {
    int a[]=new int[6];
    Scanner sc=new Scanner(System.in);
	System.out.println("enter array element");
	
	for(int i=0;i<a.length;i++)
	{
	  a[i]=sc.nextInt();
	}
	
	ArrayList al=new ArrayList();
	
	for(int i=0;i<a.length;i++)
	{
	  al.add(a[i]);
	}
	
	for(int i=al.size()-1;i>=0;i--)
	{
		int num=(int)al.get(i);
	  if(num%2==0)
	  {
	    al.remove(i);
	  }
	}
	System.out.println(al);
  }
 }
	
