import java.util.Scanner;

public class main
{

	public static void main(String[] args)
	{

//		Scanner x = new Scanner(System.in);
//
//		int userInput;
//		
//		String firstName;
//		String lastName;
//		
//		System.out.print("Enter your first name: ");
//		firstName = x.next();
//		System.out.print("Enter your last name: ");
//		lastName = x.next();
//		
//		Customer user = new Customer(firstName, lastName, 1000);
//
//		System.out.print(
//				"Welcome to any burger place, " + firstName + " " + lastName + "! What would you like to do today? \n");
//		System.out.print(
//				"==================== \n" 
//				+ "1. VIEW MENU  \n"
//				+ "2. PLACE A ORDER \n" 
//				+ "3. VIEW RECENT ORDERS \n"
//				+ "4. ADMINISTRATION \n");
//		System.out.print("Enter a number: ");
//		userInput = x.nextInt();


		 Item burger = new Item("Burger", 5.00);
		
		 Cart a = new Cart();
		 Customer joe = new Customer("John", "Smith",10000);
		
		 joe.addToCart(burger, 1);
		 joe.addToCart(burger, 1);
		 joe.addToCart(burger, 2);
		 joe.addToCart(burger, 4);
		 joe.addToCart(burger, 1);
		 joe.addToCart(burger, 5);
		 
		 joe.viewCart();
		 joe.removeFromCart(6);
		 joe.viewCart();
	}

}
