//sort array elements by ascending order
import java.util.*;
public class AscendigOrderArray
{
  public static void main(String[]args)
  {
    int temp;
    int a[]=new int[6];
	Scanner sc=new Scanner(System.in);
	System.out.println("enter array elements");
	for(int i=0;i<a.length;i++)
	{
	   a[i]=sc.nextInt();
	}
	for(int i=0;i<a.length;i++)
	{
	  for(int j=i+1;j<a.length;j++)
	  {
	      if(a[i]>a[j])
		  {
		    temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		  }
	  }
	}
	System.out.println("\n after ascending order");
	for(int i=0;i<a.length;i++)
	{
	   System.out.print(a[i]+" ");
	}
   }
  }