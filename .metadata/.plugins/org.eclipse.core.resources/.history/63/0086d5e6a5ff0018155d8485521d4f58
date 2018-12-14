import java.util.Scanner;

public class Play {

	boolean proceed = true;
	String input = "";
	String previousInput;
	int counter = 0;
	Scanner sc = new Scanner(System.in);
	
	
	public void playGame(Map map, Player player)
	{
		while (proceed)
		{
			counter++;
			
			if (counter == 1)
			{
				System.out.println("You awaken in the middle of a large grey Swamp. "
						+ "Santa seems one step ahead of you but luckily for you, you have a "
						+ "magic compass!\nThe compass will tell you how far away santa is, "
						+ "allowing you to complete your goal of capturing santa and ruining christmas.");
				
				System.out.println("Type HELP to view commands.");
			}

			System.out.print(">");
			previousInput = input.toUpperCase();
			input = sc.next().toUpperCase();
			
			if (input.toUpperCase().equals("NORTH") || input.toUpperCase().equals("N"))
			{
				map.north();
			}
			else if (input.toUpperCase().equals("EAST") || input.toUpperCase().equals("E"))
			{
				map.east();
			}
			else if (input.toUpperCase().equals("SOUTH") || input.toUpperCase().equals("S"))
			{
				map.south();
			}
			else if (input.toUpperCase().equals("WEST") || input.toUpperCase().equals("W"))
			{
				map.west();
			}
			else if (input.toUpperCase().equals("PICKUP") || input.toUpperCase().equals("P"))
			{
				map.pickup(player);
			}
			else if (input.toUpperCase().equals("USE") || input.toUpperCase().equals("U"))
			{
				System.out.println("Which item would you like to use?");
				player.checkInventory();
				input = sc.next();				
				String inputUpper = input.toUpperCase();
				
				player.useItem(map, inputUpper);				
			}
			else if (input.toUpperCase().equals("CHECK") || input.toUpperCase().equals("C"))
			{
				player.checkInventory();
			}
			else if (input.toUpperCase().equals("HELP") || input.toUpperCase().equals("H"))
			{
				System.out.println("NORTH or N - Go north.\n"
									+ "EAST or E - Go east.\n"
									+ "SOUTH or S - Go south.\n"
									+ "WEST or W - Go west.\n"
									+ "PICKUP or P - Pickup item.\n"
									+ "USE or U - Use item.\n"
									+ "CHECK or C - Check inventory.");
			}
			if (map.win())
			{
				proceed = false;
			}
			
			System.out.println("Current location: " + map.checkLocation());
		}
	}
}
