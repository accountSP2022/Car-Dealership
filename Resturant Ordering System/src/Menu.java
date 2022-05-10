
public class Menu
{
	private Item[] menuCatalog = new Item[100];
	
	private int positionOfItems = 0;
	
	// use a file scanner
	void addItem(String itemName, double itemPrice)
	{
		menuCatalog[positionOfItems] = new Item(itemName, itemPrice);
		positionOfItems++;
	}
	
	void removeItem(int arrayPosition)
	{
		if (!(menuCatalog[arrayPosition-1] == null))
		{
	
		//Set the item to null.
		menuCatalog[arrayPosition-1] = null;
		
		
		int arrayShifter  = arrayPosition-1;
		
		
		for (int i = arrayShifter; i < menuCatalog.length; i++)
		{
			Item temp = menuCatalog[i + 1];
			menuCatalog[i] = temp;
			if (menuCatalog[i + 1] == null)
			{
				break;
			}

		}
	}

		menuCatalog[arrayPosition-1] = null;
		
		
	}

	
	public Item[] viewMenu()
	{
		return menuCatalog;
	}
}
