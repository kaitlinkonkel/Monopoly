import java.util.ArrayList;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class MonopolyRunner
	{
		public static ArrayList <spaces> board = new ArrayList <spaces>();

		public static <Int> void main(String[] args)
		{
			//	board.add(new spaces(1, "Mediteranean Avenue", 100));
//			board.add(new spaces(100, "Go", 0, "Colorless"));
			board.add(new spaces(100, "Mediteranean Avenue", 1, "Dark Purple"));
		//	board.add(new spaces(100, "Community Chest", 2, "Colorless" ));
			board.add(new spaces(100, "Baltic Avenue",3, "Dark Purple" ));
		//	board.add(new spaces(100, "Income TAX", 4, "Colorless" ));
			board.add(new spaces(100, "Reading Railroad", 23, "Station" ));
			board.add(new spaces(100, "Oriental Avenue",3 , "Light Blue" ));
		//	board.add(new spaces(100, "CHANCE", 7 , "Colorless"));
			board.add(new spaces(100, "Vermont Avenue", 4, "Light Blue"));
			board.add(new spaces(100, "Conneticut Avenue", 5, "Light Blue" ));
		//	board.add(new spaces(100, "JAIL", , ));
			board.add(new spaces(100, "St. Charles Place",6, "Pink" ));
		//	board.add(new spaces(100, "Electric Company", 27, "Utility" ));
			board.add(new spaces(100, "States Avenue", 7, "Pink" ));
			board.add(new spaces(100, "Virginia Avenue", 8, "Pink"));
			board.add(new spaces(100, "Pennsylvania Railroad", 24, "Station" ));
			board.add(new spaces(100, "St. James Place", 9, "Orange" ));
		//	board.add(new spaces(100, "COMMUNITY CHEST", 12 , "Colorless" ));
			board.add(new spaces(100, "Tennessee Avenue", 10, "Orange" ));
			board.add(new spaces(100, "New York Avenue", 11, "Orange" ));
		//	board.add(new spaces(100, "FREE PARKING", 13 , "Colorless" ));
			board.add(new spaces(100, "Kentucky Avenue", 12, "Red" ));
		//	board.add(new spaces(100, "CHANCE", 1 , "Colorless"));
			board.add(new spaces(100, "Indiana Avenue", 13, "Red" ));
			board.add(new spaces(100, "Illinois Avenue", 14, "Red" ));
			board.add(new spaces(100, "B. & O. Railroad", 25, "Station" ));
			board.add(new spaces(100, "Atlantic Avenue", 15, "Yellow" ));
			board.add(new spaces(100, "Ventor Avenue", 16, "Yellow" ));
			board.add(new spaces(100, "Water Works", 28, "Utility" ));
			board.add(new spaces(100, "Marvin Gardens", 17, "Yellow"));
		//	board.add(new spaces(100, "JAIL", 1 , "Colorless"));
			board.add(new spaces(100, "Pacific Avenue", 18, "Green" ));
			board.add(new spaces(100, "North Carolina Avenue", 19, "Green" ));
		//	board.add(new spaces(100, "COMMUNITY CHEST", 1, "Colorless"));
			board.add(new spaces(100, "Pennsylvania Avenue", 20, "Green" ));
			board.add(new spaces(100, "Short Line", 26, "Station" ));
		//	board.add(new spaces(100, "CHANCE", 2 , "Colorless"));
			board.add(new spaces(100, "Park Place", 21, "Dark Blue" ));
			board.add(new spaces(100, "LUXURY TAX", 2 , "Colorless" ));
			board.add(new spaces(100, "Boardwalk", 22, "Dark Blue" ));
				//++add more spaces(one for each space on the board)
			// ++ fix values
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
