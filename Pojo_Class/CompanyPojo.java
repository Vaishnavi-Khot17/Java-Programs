/*5. Company Profit Margin
Task:
 Create a Company class with fields: companyName, revenue, and expenses.
 In the main method:
Create a Company object.
Calculate the profit margin (profit/revenue) and display the result.
Explanation:
 This introduces basic mathematical operations and accessing object fields.*/
 
 class Company
 {
   private String companyName;
   private int revenue;
   private int expenses;
   
   public void setCompanyname(String cm)
   {
     companyName=cm;
	 
   }
   public String getCompanyname()
   {
     return companyName;
   }
   public void setRevenue(int r)
   {
      revenue=r;
   }
   public int getRevenue()
   {
      return revenue;
   }
   public void setExpenses(int e)
   {
      expenses=e;
   }
   public int getExpenses()
   {
     return expenses;
   }
  }
  
  public class CompanyPojo
  {
    public static void main(String[]args)
	{
	  Company c1=new Company();
	  c1.setCompanyname("Global Innovations Ltd.");
	  c1.setRevenue(750000);
	  c1.setExpenses(480000);
	  
	  int profit=c1.getRevenue()-c1.getExpenses();
	  
	  int profitMargin=profit/c1.getRevenue();
	  System.out.println("result is="+profitMargin);
	}
	}

