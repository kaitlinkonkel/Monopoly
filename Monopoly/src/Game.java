import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Game 
{
	public static ArrayList <spaces> board = new ArrayList <spaces>();

public static void createBoard() throws FileNotFoundException
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
	
//	Scanner file = new Scanner( new File( "OriginalMonopoly" ) );
//    int numberOfLines = file.nextInt();      
//    file.nextLine();
//    for( int zz = 0; zz < numberOfLines; zz++ )
//    {
//       String str = file.nextLine();
//       String[] num1 = str.split("/");
//       String[] num2= str.split("/", 2);
//       String[] num3 = str.split("/",3);
//       String[] num4 = str.split("/",4);
//       int price = Integer.parseInt(num1[0]);
//       int position = Integer.parseInt(num3[2]);
//       board.add(new spaces(price, num2[1], position, num4[3]));
//       
 //   }
}
}
