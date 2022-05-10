
public class CreditCard
{
	
	//fields for a CreditCard
	
	//CreditCard will have a balance, essentially acting as a bankaccount -  Sarena
	private double cardBalance = 0;
	
	// args-constructor to create and set creditcard balance to a given ammount -  Sarena
	CreditCard(int a) {
		this.cardBalance = a;
	}
	
	// no-args constructor -  Sarena
	CreditCard()
	{
	}

	//returns balance -  Sarena
	public double getBalance() {
		return cardBalance;
	}
	
	// setter method to set balance to a any amount -  Sarena
	public void setMoney(double amount) 
	{
		this.cardBalance = amount;
	}
	
	// method to deposit money in balance. -  Sarena
	public void depositMoney(double amount) 
	{
		this.cardBalance = cardBalance + amount;
	}
	
	// method to withdraw money -  Sarena
	public void withdrawMoney(double amount) {
		this.cardBalance = cardBalance - amount;
	}
}
