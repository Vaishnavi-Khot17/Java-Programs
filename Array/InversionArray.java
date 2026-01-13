/*Write a program in java to count the number of inversion in a given array
Expected Output :
 The given array is : 1 9 6 4 5
 The inversions are: (9, 6) (9, 4) (9, 5) (6, 4) (6, 5)
 The number of inversion can be formed from the array is: 5*/
 
 import java.util.*;
 public class InversionArray
 {
   public static void main(String[]args)
   {
     int a[]=new int[5];
	 int count=0;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter array element");
	 for(int i=0;i<a.length;i++)
	 {
	   a[i]=sc.nextInt();
	 }
	 System.out.println("Inversion Array");
	 for(int i=0;i<a.length;i++)
	 {
	   for(int j=i+1;j<a.length;j++)
	   {
	      if(a[i]>a[j])
		  {
			System.out.println(a[i]+","+a[j]);
		    count++;
		  }
		  
		}
	 }
	 System.out.println("Count="+count);
	}
}
