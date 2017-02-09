import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Game 
{
	public static ArrayList <spaces> board = new ArrayList <spaces>();



public static void createBoard() throws FileNotFoundException
{
	
//	board.add(new spaces(0, "Go", 0, "Colorless"));//worth 0 dollars
//	board.add(new spaces(60, "Mediteranean Avenue", 1, "Dark Purple"));
//    board.add(new spaces(0, "Community Chest", 2, "Colorless" ));//worth 0 dollars
//	board.add(new spaces(60, "Baltic Avenue",3, "Dark Purple" ));
//    board.add(new spaces(100, "Income TAX", 4, "Colorless" ));
//	board.add(new spaces(100, "Reading Railroad", 5, "Station" ));
//	board.add(new spaces(100, "Oriental Avenue",6, "Light Blue" ));
//    board.add(new spaces(0, "CHANCE", 7 , "Colorless")); //worth 0 dollars 
//	board.add(new spaces(120, "Vermont Avenue", 8, "Light Blue"));
//	board.add(new spaces(140, "Conneticut Avenue", 9, "Light Blue" ));
//    board.add(new spaces(0, "JAIL", 10,"Colorless" ));//worth 0 dollars
//	board.add(new spaces(140, "St. Charles Place",11, "Pink" ));
//	board.add(new spaces(100, "Electric Company", 12, "Utility" ));
//	board.add(new spaces(140, "States Avenue", 13, "Pink" ));
//	board.add(new spaces(180, "Virginia Avenue", 14, "Pink"));
//	board.add(new spaces(180, "Pennsylvania Railroad", 15, "Station" ));
//	board.add(new spaces(200, "St. James Place", 16, "Orange" ));
//	board.add(new spaces(0, "COMMUNITY CHEST", 17 , "Colorless" ));////worth 0 dollars
//	board.add(new spaces(220, "Tennessee Avenue", 18, "Orange" ));
//	board.add(new spaces(220, "New York Avenue", 19, "Orange" ));
//	board.add(new spaces(0, "FREE PARKING", 20 , "Colorless" ));//worth 0 dollars
//	board.add(new spaces(240, "Kentucky Avenue", 21, "Red" ));
//	board.add(new spaces(0, "CHANCE", 22 , "Colorless"));//worth 0 dollars
//	board.add(new spaces(260, "Indiana Avenue", 23, "Red" ));
//	board.add(new spaces(260, "Illinois Avenue", 24, "Red" ));
//	board.add(new spaces(260, "B. & O. Railroad", 25, "Station" ));
//	board.add(new spaces(280, "Atlantic Avenue", 26, "Yellow" ));
//	board.add(new spaces(300, "Ventor Avenue", 27, "Yellow" ));
//	board.add(new spaces(320, "Water Works", 28, "Utility" ));
//	board.add(new spaces(350, "Marvin Gardens", 29, "Yellow"));
//	board.add(new spaces(0, "JAIL", 30 , "Colorless"));//worth 0 dollars
//	board.add(new spaces(350, "Pacific Avenue", 31, "Green" ));
//	board.add(new spaces(350, "North Carolina Avenue", 32, "Green" ));
//	board.add(new spaces(0, "COMMUNITY CHEST", 33, "Colorless"));//worth 0 dollars
//	board.add(new spaces(400, "Pennsylvania Avenue", 34, "Green" ));
//	board.add(new spaces(400, "Short Line", 35, "Station" ));
//	board.add(new spaces(0, "CHANCE", 36 , "Colorless"));//worth 0 dollars
//	board.add(new spaces(400, "Park Place", 37, "Dark Blue" ));
//	board.add(new spaces(400, "LUXURY TAX", 38 , "Colorless" ));
//	board.add(new spaces(400, "Boardwalk", 39, "Dark Blue" ));
//	
	System.out.println("Which version of monopoly would you like to play? I have colorado and original");
	Scanner file;
	Scanner userInput4 = new Scanner(System.in);
	String whichKind = userInput4.next();
	if(whichKind.equals("colorado"))
		{
		file = new Scanner( new File( "OriginalMonopoly" ) );
		}
	else{
		file = new Scanner( new File( "OriginalMonopoly" ) );
	}
	
    
	int numberOfLines = file.nextInt();      
    file.nextLine();
    for( int zz = 0; zz < numberOfLines; zz++ )
    {
    	String str = file.nextLine();
    	//splits the string into peices
    	String[] output = str.split("/");
    	
    	//price
    	String price0 = output[0];
    	int price = Integer.parseInt(price0);
//    	System.out.println("price:"+ price);
    	//name
    	String name = output[1];
//    	System.out.println("name:"+ name);
    	//location
    	String location0 = output[2];
    	int location = Integer.parseInt(location0);
//    	System.out.println("location:"+ location);
    	//color
    	String color = output[3];
//    	System.out.println("color:"+ color);

       board.add(new spaces(price, name, location, color));
       
    }
}
}
