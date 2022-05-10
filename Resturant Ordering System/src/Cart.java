
public class Cart
{
	private Item[] itemsInCart = new Item[100];
	private double subtotalOfCart = 0.00; 
	private int quantityOfItems = 0;
	private int positionOfItems = 0;
	
	
	Cart()
	{
	}
	
	Cart(Cart cart)
	{
		for (int i = 0; i < cart.positionOfItems; i++)	
		{
			if (itemsInCart[i] == null)
			{
				break;
			}
			this.itemsInCart[i] = cart.itemsInCart[i];
			this.positionOfItems = cart.positionOfItems;
		}
	}
	
	public void addToCart(Item item, int quantity)
	{
		//
		itemsInCart[positionOfItems] = new Item(item);
		
		itemsInCart[positionOfItems].setItemQuantity(quantity);
		
		// increase quantity of items in cart by 1 after adding something to
		// cart
		positionOfItems++;
	}
	
	//NEEDS WORK***** 
	// removeFromCart needs to be able to shift each array index to the left after removing item.
	public void removeFromCart(int arrayPosition)
	{
		// If element is null at the given index, do nothing.
		if (!(itemsInCart[arrayPosition-1] == null))
		{
			// decrease counter for how many indexs in the array which elements are not null
			positionOfItems--;
			// Set the item to null.
			itemsInCart[arrayPosition - 1] = null;

			int arrayShifter = arrayPosition - 1;

			for (int i = arrayShifter; i < itemsInCart.length; i++)
			{
			
				Item temp = itemsInCart[i + 1];
				itemsInCart[i] = temp;
				if (itemsInCart[i + 1] == null)
				{
					break;
				}
			
			}

		}
		

	}
	
	//returns item array
	public Item[] getCart() 
	{
		return itemsInCart;
	}
	
	
	public void calculateQuantity()
	{
		quantityOfItems=0;
		for (int i = 0; i < positionOfItems; i++)	
		{
			if (itemsInCart[i] == null)
			{
				break;
			}
			quantityOfItems = itemsInCart[i].getItemQuantity() + quantityOfItems;
		}
	}
	
	public int getQuantity()
	{
		calculateQuantity();
		return this.quantityOfItems;
	}
	
	public void clearCart()
	{
		itemsInCart = new Item[100];
		quantityOfItems = 0;
		positionOfItems = 0;
	}

	//mutator
	public void calculateSubtotal()
	{
		subtotalOfCart=0;
		for (int i = 0; i < positionOfItems; i++)	
		{
			if (itemsInCart[i] == null)
			{
				break;
			}
			
			subtotalOfCart = subtotalOfCart + (itemsInCart[i].getPrice() * itemsInCart[i].getItemQuantity());
		}
	}
	
	//getter method to return subtotal
	public double displaySubtotal()
	{
		calculateSubtotal();

		return subtotalOfCart;
	}
	
	
	// this needs to be worked on
//	public String toString() {
//		String a;
//		
//		for (int i = 0; i < positionOfItems; i++)	
//		{
//			
//		}
//		
//		
//		return ;
//	}

}
