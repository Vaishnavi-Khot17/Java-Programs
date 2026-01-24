/*Q5. Create a Vector of 10 integers (including negative numbers).
 Remove all negative values and print the updated Vector.
Condition: num < 0
Removing elements
Using loop carefully when removing values
Explanation
Negative numbers are less than 0.
 You can use a loop with index backward to safely remove elements.*/
 
 import java.util.*;
 public class NegativeNoVector
 {
   public static void main(String[]args)
   {
      Vector<Integer> v = new Vector<>();
	 v.add(10);
	 v.add(-20);
	 v.add(60);
	 v.add(-60);
	 v.add(52);
	 v.add(-66); 
	 v.add(90); 
	 v.add(47);
	 v.add(-23);
	 v.add(11);
	 
	 for(int i=v.size()-1;i>0;i--)
	 {
	   if(v.get(i) < 0)
	   {
	     v.remove(i);
		}
	 }
	   System.out.println(v);
		
	 }
	}
	 
	 