/*
 Food Item Price Comparison
Task:
 Create a FoodItem class with fields: name and price.
 In the main method:
Create two FoodItem objects.
Compare their prices and print the name of the cheaper food item.
Explanation:
 This helps understand comparison logic with custom objects.*/
 
 class FoodItem
 {
   private String name;
   private int price;
   
   public void setName(String n)
   {
     name=n;
   }
   public String getName()
   {
     return name;
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
  
  public class FoodItemPojo
  {
    public static void main(String[]args)
	{
	  FoodItem f1=new FoodItem();
	  f1.setName("Piza");
	  f1.setPrice(100);
	  
	  FoodItem f2=new FoodItem();
	  f2.setName("Burger");
	  f2.setPrice(80);
	  
	  if(f1.getPrice()<f2.getPrice())
	  {
	    System.out.println("Piza");
	  }
	  else
	  {
	    System.out.println("Burger");
	  }
	 }
	 }