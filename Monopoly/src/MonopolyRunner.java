import java.util.ArrayList;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class MonopolyRunner
	{
		public static ArrayList <spaces> board = new ArrayList <spaces>();

		public static <Int> void main(String[] args)
		{
				board.add(new spaces(1, "Mediteranean Avenue", 100));
				
				//++add more spaces(one for each space on the board)
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
			int playerSpace = 0;
			int playerMoney = 1500;
			for(int i =0;i<1000; i++)
			{
			Scanner userInput4 = new Scanner(System.in);
			System.out.println("type 'roll' to roll your dice");
			String rollYesOrNo = userInput4.nextLine();
			if(rollYesOrNo.equals("roll"))
				{
					playerSpace = playerSpace+diceRoll(); 
					System.out.println("You are now at position "+board.get(playerSpace).getLocation());
					System.out.println("This space is "+board.get(playerSpace).getName()+" and you can buy it for "+board.get(playerSpace).getPrice());
					System.out.println("Would you like to buy it?");
					
					Scanner userInput5 = new Scanner(System.in);
					System.out.println("type 'yes' to buy the property");
					String yesOrNo = userInput4.nextLine();
					
					if(yesOrNo.equals("yes"))
						{
							
							playerMoney = playerMoney - board.get(playerSpace).getPrice();//takes the price from playerMoney
							System.out.println("Alright you now have "+playerMoney+" dollars");
							//++add this space to spaces the player has bought
						}
					else
						{
							System.out.println("Alright this space will not be bought");
						}
					
					System.out.println("all the properties you own are:"	);
					//++go through an array list with all of the properties you own 
				}
			}
		}
//		public static void aiTurn()
//		{
//				System.out.println("It is the ");
//		}

		
	}
