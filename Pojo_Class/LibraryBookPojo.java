/* Library Book Management
Task:
 Create a Book class with fields: title, author, and price.
 In the main method:
Create two individual Book objects.
Compare the prices of the two books and print the title of the more expensive book.
Explanation:
 This task teaches object instantiation and accessing instance variables directly to perform comparisons.*/
 
 class Library
 {
   private String title;
   private String author;
   private int price;
   
   public void setTitle(String t)
   {
     title=t;
   }
   public String getTitle()
   {
     return title;
	}
	public void setAuthor(String a)
	{
	  author=a;
	}
	public String getAuthor()
	{
	  return author;
	}
	public void setPrice(int p)
	{
	  price=p;
	}
	public int getPrice()
	{
	  return price;
	}
	
  }
  
  public class LibraryBookPojo
  {
    public static void main(String[]args)
	{
	   Library l1=new Library();
	   l1.setTitle("Let Us C");
	   l1.setAuthor("Yashwant Kanetkar");
	   l1.setPrice(500);
	   
	   Library l2=new Library();
	   l2.setTitle("JAVA");
	   l2.setAuthor("Khalid mugal");
	   l2.setPrice(800);
	   
	   if(l1.getPrice()>l2.getPrice())
	   {
	     System.out.println("Yashwant Kanetkar");
		}
		else
		{
		  System.out.println("Khalid mugal");
		}
	}
  }