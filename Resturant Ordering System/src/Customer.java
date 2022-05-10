/** 
 * Lead Author(s): 
 * @author Riley Phan; 5550006344
 * @author Sarena P
 * 
 * References: 
 * Morelli, R., & Walde, R. (2016).  
 * Java, Java, Java: Object-Oriented Problem Solving 
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-
java-object-oriented-problem-solving 
 * 
 * Version: 2021-12 (4.22.0)
 * Responsibilities of class:
 * Methods that use objects and args, storing variables, constructing objects. 
 * Holds information about a receipt on a credit card charge.
 */

public class Customer extends Person
{

	//Customer has a Cart;
	private Cart cart = new Cart();
	
	//Customer has a array of orders objects
	private Order[] orderHistory = new Order[100];
	
	//Customer has a CreditCard
	private CreditCard card;
	
	//args-constructor *NEEDS WORK* 
	Customer(String firstName, String lastName, int a)
	{
		super(firstName, lastName);
		this.card = new CreditCard(a);
	}
	
	//method that reorders the previous order *NEEDS WORK* - Sarena
	void reOrder()
	{
		
	}
	
	// Place order once customer decides to checkout *NEEDS WORK* - Riley
	void placeOrder() throws NotEnoughMoney
	{
		if (cart.displaySubtotal() < this.card.getBalance())
		{
			throw new NotEnoughMoney("You dont have enough funds!");
		}
		
		// withdraw x amount of money from balance
		card.withdrawMoney(cart.displaySubtotal());
		
		// clears cart after confirming order
		cart.clearCart();
		
		//stores cart information in a array to keep track of orders.
		//orderPlaced(cart);
	}
	
	// Cancel recent order and refunds money *WORK IN PROGRESS* - Riley
	void cancelOrder()	
	{
		if (orderHistory[0].getOrderStatus() == true) {
			
		}
	}
	
	// Displays array of all orders by customer
	void orderHistory()
	{
		for (int i = 0; i < orderHistory.length; i++)	
		{
			if (orderHistory[i] == null)
			{
				break;
			}
			System.out.println(orderHistory);
		}
	}
	
	// method adds items to the cart array
	// ****** need to add exception where quantity cannot be zero!!!!! *******
	void addToCart(Item item, int quantity)
	{
		cart.addToCart(item, quantity);
	}
	
	//method that removes item position in cart.
	void removeFromCart(int arrayPosition)
	{
		cart.removeFromCart(arrayPosition);
	}
	
	//method that changes the quantity of item in the cart.
	void setCartItemQuantity (int positionInCart, int quantity)
	{
		cart.getCart()[0].setItemQuantity(quantity);
	}
	
	//displays to the console whatever you have in your cart. - Riley
	void viewCart()
	{
		for (int i = 0; i < cart.getCart().length; i++)
		{
			if (cart.getCart()[i] == null)
			{
				break;
			}
			System.out.println(i + 1 + ". " + cart.getCart()[i]);
		}
		System.out.println("Subtotal (" + cart.getQuantity() + " items)" + ": $" + cart.displaySubtotal());
		
		
	}


}
