/* Person Age Verification
Task:
 Create a Person class with fields: name and age.
 In the main method:
Create a Person object.
Check if the person is eligible to vote (age >= 18) and print the result.
Explanation:
 This demonstrates condition checking using instance variables.*/
 
 class Person
 {
   private String name;
   private int age;
   
   public void setName(String n)
   {
     name=n;
   }
   public String getName()
   {
     return name;
   }
	public void setAge(int a)
   {
	  age=a;
   }
	 public int getAge()
   {
	   return age;
   }
  }
  
  public class PersonAgePojo
  {
    public static void main(String[]args)
	{
	   Person p1=new Person();
	   p1.setName("Nita Patil");
	   p1.setAge(20);
	   
	   Person p2=new Person();
	   p2.setName("Nilesh Patil");
	   p2.setAge(15);
	   
	   if(p1.getAge()>=18)
	   {
	     System.out.println("person is eligible to vote");
	    }
		else
		{
		  System.out.println(" person is not eligible to vote"); 
		 }
	}
}