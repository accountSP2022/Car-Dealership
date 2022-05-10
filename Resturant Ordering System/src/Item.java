
public class Item implements Payable
{
	// fields for the items for sale - Riley
	
	// Item needs a name - Riley
	private String itemName;
	// Item needs a price - Riley
	private double itemPrice;
	// item needs a quantity
	private int itemQuantity = 0;
	
	// default constructor - Riley
	Item()
	{
	}
	
	// constructor with args - Riley
	Item(String itemName, double itemPrice) 
	{
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}
	
	// copy constructor - Riley
	Item(Item item)
	{
		this.itemName = item.getItemName();
		this.itemPrice = item.getPrice();
		this.itemQuantity = item.getItemQuantity();
	}

	
	//Override method of toString
	@Override
	public String toString()
	{
		return itemName + " || Price: $" + itemPrice + " || (" + itemQuantity + " items)";
	}
	
	// mutators and accessors below this

	// method to get name of item - Riley
	public String getItemName()
	{
		return this.itemName;
	}
		
	//Method to set the name of the item - Riley 
	public void setItemName(String itemName)
	{
		this.itemName = itemName;
	}
	

	@Override
	public double getPrice()
	{
		return this.itemPrice;
	}

	@Override
	public void setPrice(double itemPrice)
	{
		this.itemPrice = itemPrice;
		
	}

	public int getItemQuantity()
	{
		return this.itemQuantity;
	}

	public void setItemQuantity(int itemQuantity)
	{
		this.itemQuantity = itemQuantity;
	}


}
