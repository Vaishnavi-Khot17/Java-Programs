/* Player High Score
Task:
 Create a Player class with fields: name and score.
 In the main method:
Create two individual Player objects.
Compare their scores and print the name of the player with the higher score.
Explanation:
 This helps to understand comparing fields between objects.*/
 
 class Player
 {
   private String name;
   private int score;
   
   public void setName(String n)
   {
     name=n;
   }
   public String getName()
   {
     return name;
   }
   public void setScore(int s)
   {
     score=s;
   }
   public int getScore()
   {
     return score;
   }
}

public class PlayerPojo
{
  public static void main(String[]args)
  {
    Player p1=new Player();
	p1.setName("Nitin");
	p1.setScore(200);
	
	Player p2=new Player();
	p2.setName("Ajay");
	p2.setScore(250);
	
	if(p1.getScore()>p2.getScore())
	{
	   System.out.println("Nitin and the score is 200");
	}
	else
	{
	  System.out.println("Ajay and Score is 250");
	}
  }
  }