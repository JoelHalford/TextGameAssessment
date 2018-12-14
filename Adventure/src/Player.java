import java.util.ArrayList;

public class Player {

	ArrayList<String> inventory = new ArrayList<>();
	private static boolean teleport = true;
	
	
	public Player()
	{
		inventory.add("COMPASS");
	}
	
	public void addItem(String item)
	{
		inventory.add(item);
	}
	
	public void checkInventory()
	{
		System.out.println("Inventory Contents");
		inventory.stream().forEach(System.out::println);
	}
	
	public boolean compare(String item)
	{
		for (String inv : inventory)
		{
			if (inv.equals(item))
			{
				System.out.println("You already have that item in your inventory.");
				return false;
			}
		}
		System.out.println("You picked up the " + item);
		return true;
	}
	
	public void useItem(Map map, String item)
	{
		if (!item.equals("TELEPORTER") && !item.equals("POTION"))
		{
			for (String inv : inventory)
			{
				if (inv.equals(item))
				{
					inventory.remove(item);
				}
			}	
		}
		else if (item.equals("TELEPORTER"))
		{
			for (String inv : inventory)
			{
				if (inv.equals(item) && teleport == true)
				{
					teleport = false;
					map.progress();
				}
			}
		}
		else if (item.equals("POTION"))
		{
			for (String inv : inventory)
			{
				if (inv.equals(item))
				{
					map.progress();
				}
			}
		}

	}
	
	public void checkCompass(Map map)
	{
		System.out.println(map.checkLocation());
	}
}
