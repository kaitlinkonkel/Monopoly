import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class MonopolyRunner
	{
		//public static ArrayList <spaces> board = new ArrayList <spaces>();

		public static  void main(String[] args) throws FileNotFoundException
		{
			Game.createBoard();
			begining();			
				
			}

		public static void begining()
		{
				Scanner userInput = new Scanner(System.in);
				System.out.println("Hello welcome to monoply. What is your name?");
				String playerName = userInput.nextLine();
				System.out.println("Ok "+playerName+". Would you like to start?");
				Scanner userInput3 = new Scanner(System.in);
				String playerGoesFirst = userInput3.next();
				if(playerGoesFirst.equals("yes"))
					{
					playerOneTurn();
					}
		}
		
		
		public static int diceRoll()
		{
				int diceRoll1=(int)(Math.random()*6);
				int diceRoll2=(int)(Math.random()*6);
				int diceRollSum = diceRoll1+diceRoll2;
				System.out.println("You rolled a "+diceRoll1+" and a "+diceRoll2+" for a sum of "+diceRollSum);
				return diceRollSum;
		}
		
		
		public static void playerOneTurn()
		{
			
			 ArrayList<String> playerProperties = new ArrayList<String>();
		       
			int playerSpace = 0;
			int playerMoney = 1500;
			for(int i =0;i<1000; i++)
			{
				
			Scanner userInput4 = new Scanner(System.in);
			System.out.println("(type 'roll' to roll your dice)");
			String rollYesOrNo = userInput4.nextLine();
			if(rollYesOrNo.equals("roll"))//change later
				{
				
				
					playerSpace = playerSpace+diceRoll(); 
					if(playerSpace >= 39)
					{
						System.out.println("You have passed go! You gain 200 dollars.");
						playerMoney =playerMoney+200;
						playerSpace = 0;
					}
					
					if(playerMoney <=0)
					{
						System.out.println("You are bankrupt. Game Over.");
					}
					
					System.out.println("You are now at position "+Game.board.get(playerSpace).getLocation());
					
					
					if(Game.board.get(playerSpace).getPrice()==0) 
					{
						System.out.println("This is a "+Game.board.get(playerSpace).getName()+" space. ");
					}
					else
					{
						System.out.println("This space is "+Game.board.get(playerSpace).getName()+" and you can buy it for "+Game.board.get(playerSpace).getPrice()+" dollars.");
						System.out.println("Would you like to buy it?");
					
						Scanner userInput5 = new Scanner(System.in);
						System.out.println("(type 'yes' to buy the property)");
						String yesOrNo = userInput4.nextLine();
					
						if(yesOrNo.equals("yes"))
						{							
							playerMoney = playerMoney - Game.board.get(playerSpace).getPrice();//takes the price from playerMoney
							System.out.println("You now have "+playerMoney+" dollars and you own "+Game.board.get(playerSpace).getName()+".");
							 playerProperties.add(Game.board.get(playerSpace).getName());
							//++add this space to spaces the player has bought
						}
						else
						{
							System.out.println("Okay this space will not be bought.");
						}
					}
					
					
					System.out.println("All the properties you own are:"	);
					 for (int z = 0; z<playerProperties.size(); z++)
					 {
					 System.out.println("-"+playerProperties.get(z));
					 }
					//++go through an array list with all of the properties you own 
					//get the array list working 
				}
			}
		}
		
//		public static void aiTurn()
//		{
//				System.out.println("It is the ");
//		}

		
	}
