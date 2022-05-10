
public class Person
{
	// Fields for a person
	
	//First name variable
	private String firstName;
	// Last name variable;
	private String lastName;
	
	//accessor and mutators methods below
	Person(String firstName, String lastName) 
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	

	
	
	
}
