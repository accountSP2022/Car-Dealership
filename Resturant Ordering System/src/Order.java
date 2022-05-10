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

public class Order
{
	
	//fields needed for the Order class
	private Cart[] orderHistory = new Cart[100];
	private int historyPosition = 0;
	private static int orderIdIncreaser = 1;
	private int orderId = 0;
	private boolean orderStatus = false;
	
	Order(){
		orderId += orderIdIncreaser;
		orderIdIncreaser++;
		orderStatus = true;
	}
	
	// stores the placed order from the customer in a array - Riley
	void orderPlaced(Cart cart) 
	{
		orderHistory[historyPosition] = new Cart(cart);
		historyPosition++;
	}
	
	//returns entire order history of the user - Riley
	public Cart[] getOrderHistory()
	{
		return orderHistory;
	}
	
	//return a boolean to determine if the order was confirmed or was refunded - Riley
	public boolean getOrderStatus() {
		return orderStatus;
	}
	
	//setter method to set the order status - Riley
	public void setOrderStatus(boolean bool) {
		orderStatus = bool;
	}
	
	
	//NEEDS WORK****
	public String toString() {
		return "Hello";
	}
	
	
}
