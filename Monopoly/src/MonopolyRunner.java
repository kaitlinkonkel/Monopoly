import java.util.ArrayList;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class MonopolyRunner
	{
		public static ArrayList <spaces> board = new ArrayList <spaces>();

		public static <Int> void main(String[] args)
		{

			board.add(new spaces(0, "Go", 0, "Colorless"));//worth 0 dollars
			board.add(new spaces(60, "Mediteranean Avenue", 1, "Dark Purple"));
		    board.add(new spaces(0, "Community Chest", 2, "Colorless" ));//worth 0 dollars
			board.add(new spaces(60, "Baltic Avenue",3, "Dark Purple" ));
		    board.add(new spaces(100, "Income TAX", 4, "Colorless" ));
			board.add(new spaces(100, "Reading Railroad", 5, "Station" ));
			board.add(new spaces(100, "Oriental Avenue",6, "Light Blue" ));
		    board.add(new spaces(0, "CHANCE", 7 , "Colorless")); //worth 0 dollars 
			board.add(new spaces(120, "Vermont Avenue", 8, "Light Blue"));
			board.add(new spaces(140, "Conneticut Avenue", 9, "Light Blue" ));
		    board.add(new spaces(0, "JAIL", 10,"Colorless" ));//worth 0 dollars
			board.add(new spaces(140, "St. Charles Place",11, "Pink" ));
			board.add(new spaces(100, "Electric Company", 12, "Utility" ));
			board.add(new spaces(140, "States Avenue", 13, "Pink" ));
			board.add(new spaces(180, "Virginia Avenue", 14, "Pink"));
			board.add(new spaces(180, "Pennsylvania Railroad", 15, "Station" ));
			board.add(new spaces(200, "St. James Place", 16, "Orange" ));
			board.add(new spaces(0, "COMMUNITY CHEST", 17 , "Colorless" ));////worth 0 dollars
			board.add(new spaces(220, "Tennessee Avenue", 18, "Orange" ));
			board.add(new spaces(220, "New York Avenue", 19, "Orange" ));
			board.add(new spaces(0, "FREE PARKING", 20 , "Colorless" ));//worth 0 dollars
			board.add(new spaces(240, "Kentucky Avenue", 21, "Red" ));
			board.add(new spaces(0, "CHANCE", 22 , "Colorless"));//worth 0 dollars
			board.add(new spaces(260, "Indiana Avenue", 23, "Red" ));
			board.add(new spaces(260, "Illinois Avenue", 24, "Red" ));
			board.add(new spaces(260, "B. & O. Railroad", 25, "Station" ));
			board.add(new spaces(280, "Atlantic Avenue", 26, "Yellow" ));
			board.add(new spaces(300, "Ventor Avenue", 27, "Yellow" ));
			board.add(new spaces(320, "Water Works", 28, "Utility" ));
			board.add(new spaces(350, "Marvin Gardens", 29, "Yellow"));
			board.add(new spaces(0, "JAIL", 30 , "Colorless"));//worth 0 dollars
			board.add(new spaces(350, "Pacific Avenue", 31, "Green" ));
			board.add(new spaces(350, "North Carolina Avenue", 32, "Green" ));
			board.add(new spaces(0, "COMMUNITY CHEST", 33, "Colorless"));//worth 0 dollars
			board.add(new spaces(400, "Pennsylvania Avenue", 34, "Green" ));
			board.add(new spaces(400, "Short Line", 35, "Station" ));
			board.add(new spaces(0, "CHANCE", 36 , "Colorless"));//worth 0 dollars
			board.add(new spaces(400, "Park Place", 37, "Dark Blue" ));
			board.add(new spaces(400, "LUXURY TAX", 38 , "Colorless" ));
			board.add(new spaces(400, "Boardwalk", 39, "Dark Blue" ));
		
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
					
					System.out.println("You are now at position "+board.get(playerSpace).getLocation());
					
					
					if(board.get(playerSpace).getPrice()==0) 
					{
						System.out.println("This is a "+board.get(playerSpace).getName()+" space. ");
					}
					else
					{
						System.out.println("This space is "+board.get(playerSpace).getName()+" and you can buy it for "+board.get(playerSpace).getPrice()+" dollars.");
						System.out.println("Would you like to buy it?");
					
						Scanner userInput5 = new Scanner(System.in);
						System.out.println("(type 'yes' to buy the property)");
						String yesOrNo = userInput4.nextLine();
					
						if(yesOrNo.equals("yes"))
						{							
							playerMoney = playerMoney - board.get(playerSpace).getPrice();//takes the price from playerMoney
							System.out.println("You now have "+playerMoney+" dollars and you own "+board.get(playerSpace).getName()+".");
							 playerProperties.add(board.get(playerSpace).getName());
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
