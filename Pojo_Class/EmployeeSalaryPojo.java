/* Employee Salary Increment
Task:
 Create an Employee class with fields: name, salary, and department.
 In the main method:
Create an Employee object.
Increase the employee's salary by 10% and print the updated salary.
Explanation:
 This introduces instance variable manipulation and basic arithmetic operations.*/
 
 class Employee
 {
    private String name;
	private int salary;
	private String department;
	
	public void setName(String n)
	{
	  name=n;
	}
	public String getName()
	{
	   return name;
	}
	public void setSalary(int s)
	{
	  salary=s;
	}
	public int getSalary()
	{
	  return salary;
	}
	public void setDepartment(String dep)
	{
	  department=dep;
	}
	public String getDepartment()
	{
	  return department;
	}
  }
	
	public class EmployeeSalaryPojo
	{
	  public static void main(String[]args)
	  {
	    Employee em1=new Employee();
		em1.setName("Nita");
		em1.setSalary(10000);
		em1.setDepartment("COmputer");
	
		 
		 Employee em2=new Employee();
		 em2.setName("Kavita");
		 em2.setSalary(20000);
		 em2.setDepartment("IT");
		 
		 int upsalary=(em1.getSalary()*10)/100;
		 upsalary=em1.getSalary()+upsalary;
		 System.out.println("update salary is="+upsalary);
	   }
}